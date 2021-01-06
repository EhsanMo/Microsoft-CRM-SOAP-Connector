
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.1 2021-01-05T18:53:52.774+03:30 Generated source version: 3.4.1
 */

@WebFault(name = "OrganizationServiceFault", targetNamespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
public class IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage extends Exception {

  private OrganizationServiceFault faultInfo;

  public IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage() {
    super();
  }

  public IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage(String message) {
    super(message);
  }

  public IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage(String message, Throwable cause) {
    super(message, cause);
  }

  public IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage(String message,
      OrganizationServiceFault organizationServiceFault) {
    super(message);
    this.faultInfo = organizationServiceFault;
  }

  public IOrganizationServiceCreateOrganizationServiceFaultFaultFaultMessage(String message,
      OrganizationServiceFault organizationServiceFault, Throwable cause) {
    super(message, cause);
    this.faultInfo = organizationServiceFault;
  }

  public OrganizationServiceFault getFaultInfo() {
    return this.faultInfo;
  }
}
