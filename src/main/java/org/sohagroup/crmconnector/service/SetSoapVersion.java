package org.sohagroup.crmconnector.service;

import org.apache.cxf.binding.soap.Soap11;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.SoapVersion;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;

/**
 * package org.sohagroup.crmconnector.service This class Change the version of Request to desire version
 *
 * @Author feynman
 * @create 1/5/21 7:46 PM project crm-connector created by feynman at 1/5/21 7:46 PM
 * @since 1.0
 */
public class SetSoapVersion extends AbstractSoapInterceptor {

  public SetSoapVersion(String p) {
    super(p);
  }

  public SetSoapVersion(String i, String p) {
    super(i, p);
  }

  /**
   * Set the version of request to proper version. Default version is 1.1 but for some version you should set to 1.2
   *
   * @param message pass by interceptor
   * @throws Fault
   */
  @Override
  public void handleMessage(SoapMessage message) throws Fault {
    final SoapVersion soap11 = Soap11.getInstance();
//    final SoapVersion soap12 = Soap12.getInstance();
    message.setVersion(soap11);
  }
}
