package org.sohagroup.crmconnector.service;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * package org.sohagroup.crmconnector.service This class set the password to ws-security header
 *
 * @Author feynman
 * @create 1/5/21 7:49 PM project crm-connector created by feynman at 1/5/21 7:49 PM
 * @since 1.0
 */
public class ClientPasswordCallback implements CallbackHandler {

  private static final String BUNDLE_LOCATION = "auth2";
  private static final String PASSWORD_PROPERTY_NAME = "auth.manager.password";
  private String password = "password"; //this password should change

  /**
   * Set the password to ws-security header
   *
   * @param callbacks return the request to another interceptor
   */
  @Override
  public void handle(Callback[] callbacks) {
    WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
    pc.setPassword(password);
  }
}
