package graphql.spring.web.reactive;

import graphql.spring.web.reactive.components.GraphQLController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnWebApplication
@ComponentScan(basePackageClasses = GraphQLController.class)
public class GraphQLEndpointConfiguration {

    @Autowired
    ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
    }
}
