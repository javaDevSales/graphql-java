package graphql.spring.web.servlet;

import graphql.GraphQL;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntegrationTestConfig {


    @Bean
    public GraphQL graphQL() {
        return Mockito.mock(GraphQL.class);
    }

}

