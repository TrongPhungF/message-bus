package com.org.messagebus.config;

import com.org.messagebus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


@Configuration
public class IntegrationConfig {
    @Autowired
    private UserService userService;

    @Bean
    public MappingJackson2JsonView jsonView() {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }

    @Bean
    public IntegrationFlow addUserFlow( ) {
        return IntegrationFlows.from("addUserInputChannel")
                .handle(userService, "addUser")
                .get();
    }
    @Bean
    public IntegrationFlow getAllUserFlow() {
        return IntegrationFlows.from("gettAllUserInputChannel")
                .handle(userService, "findAll")
                .handle("jsonView", "render")
                .get();
    }


}
