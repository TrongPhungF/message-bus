package com.org.messagebus.config;

import com.org.messagebus.messagebus.UserGatewayService;
import com.org.messagebus.service.UserService;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.handler.ServiceActivatingHandler;
import org.springframework.integration.http.dsl.Http;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;


@Configuration
public class IntegrationConfig {

    @Bean
    public IntegrationFlow addUserFlow(UserService  userService) {
        return IntegrationFlows.from("addUserInputChannel")
                .handle(userService, "addUser")
                .get();
    }
}
