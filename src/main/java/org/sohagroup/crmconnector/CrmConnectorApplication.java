package org.sohagroup.crmconnector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sohagroup.crmconnector.domain.crm.model.QueryExpression;
import org.sohagroup.crmconnector.service.CRMConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrmConnectorApplication {

  @Autowired
  CRMConnector crmConnector;
  private Logger logger = LogManager.getLogger(CrmConnectorApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CrmConnectorApplication.class, args);

  }

  @Bean
  CommandLineRunner lookup(CRMConnector crmConnector) {
    return args -> {
      QueryExpression queryExpression = new QueryExpression();
      Object o = crmConnector.sendRequestRetrieveMultiple(queryExpression);
      logger.info("received data : {}", o);
    };
  }

}
