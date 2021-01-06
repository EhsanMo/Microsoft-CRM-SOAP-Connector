package org.sohagroup.crmconnector.service;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.annotation.PostConstruct;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sohagroup.crmconnector.domain.crm.model.EntityCollection;
import org.sohagroup.crmconnector.domain.crm.model.IOrganizationService;
import org.sohagroup.crmconnector.domain.crm.model.IOrganizationServiceRetrieveMultipleOrganizationServiceFaultFaultFaultMessage;
import org.sohagroup.crmconnector.domain.crm.model.QueryExpression;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * package org.sohagroup.crmconnector.service
 *
 * @Author feynman
 * @create 1/5/21 6:58 PM project crm-connector created by feynman at 1/5/21 6:58 PM
 * @since 1.0
 */
@Configuration
public class CRMConnector {

  private Logger logger = LogManager.getLogger(CRMConnector.class);
  @Value("${crm.userName}")
  private String userName;
  @Value("${crm.password}")
  private String password;
  /**
   * The url must be in format of http://crm.organization.xyz/somename/XRMServices/2011/Organization.svc/web URL ends
   * with: XRMServices/2011/Organization.svc/web /web should be added at end of url. otherwise you get Bad Request
   * error
   */
  @Value("${crm.url}")
  private String url;
  private IOrganizationService client;

  /**
   * Setup the connector set the url and password to request Add WSS4JOutInterceptor to header, because the Microsoft
   * CRM Dynamics is secured by the ws-security for unknown reason some
   */
  @PostConstruct
  public void init() {
    logger.info("Post construct {} starts", this.getClass());
    JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    factory.setServiceClass(IOrganizationService.class);
    factory.setAddress(url);
    client = (IOrganizationService) factory.create();
    WSS4JOutInterceptor wss4jOut = new WSS4JOutInterceptor();
    wss4jOut.setProperty("action", "UsernameToken");
    wss4jOut.setProperty("user", userName);
    wss4jOut.setProperty("password", password);
    wss4jOut.setProperty("mustUnderstand", "false");
    wss4jOut.setProperty("passwordCallbackClass", "org.sohagroup.crmconnector.service.ClientPasswordCallback");
    ClientProxy.getClient(client).getOutInterceptors().add(new LoggingOutInterceptor());
    ClientProxy.getClient(client).getOutInterceptors().add(new SetSoapVersion(Phase.POST_LOGICAL));
    ClientProxy.getClient(client).getInInterceptors().add(new LoggingInInterceptor());
    ClientProxy.getClient(client).getOutInterceptors().add(wss4jOut);
    logger.info("Post construct {} finished", this.getClass());
  }

  /**
   * As Microsoft use NTLM Authentication, first initialize NTLM then send request to CRM Server This method only show
   * usage of {@link org.sohagroup.crmconnector.domain.crm.model.RetrieveMultiple}, for other methods such as {@link
   * org.sohagroup.crmconnector.domain.crm.model.Update}, {@link org.sohagroup.crmconnector.domain.crm.model.Delete},
   * {@link org.sohagroup.crmconnector.domain.crm.model.Associate}, {@link org.sohagroup.crmconnector.domain.crm.model.Disassociate},
   * {@link org.sohagroup.crmconnector.domain.crm.model.Execute} {@link org.sohagroup.crmconnector.domain.crm.model.Retrieve}
   * use one of them.
   *
   * @param queryExpression: specified query to send to CRM
   * @return Result of query from CRM
   * @throws IOrganizationServiceRetrieveMultipleOrganizationServiceFaultFaultFaultMessage
   * @see QueryExpression
   * @see <a href="https://docs.oracle.com/javase/7/docs/technotes/guides/net/http-auth.html">Oracle's Http
   * Authentication Doc</a>
   */
  public Object sendRequestRetrieveMultiple(QueryExpression queryExpression)
      throws IOrganizationServiceRetrieveMultipleOrganizationServiceFaultFaultFaultMessage {
    logger.info("NTLM initializing  starts");

    Authenticator.setDefault(new Authenticator() {
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
        return (new PasswordAuthentication(userName, password.toCharArray()));
      }
    });
    logger.info("NTLM initializing  ends");

    logger.info("Send request to CRM ");
    EntityCollection entityCollection = null;
    try {
      entityCollection = client.retrieveMultiple(queryExpression);
    } catch (Exception ex) {
      logger.info("Error in calling Service with error {}", ex.getMessage(), ex);
    }
    logger.info("Get response from  CRM ");
    return entityCollection;
  }
}
