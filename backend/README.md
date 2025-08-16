# Getting Started

### Architecture Overview

This projects tries to use a clean architecture approach, with a clear separation of concerns. The project is divided in the following modules:

![Architecture](https://miro.medium.com/max/1400/1*ZdlHz8B0-qu9Y-QO3AXR_w.png)

#### Domain

This module contains the business rules and entities of the application. It is the core of the application and should not depend on any other module.

##### Entities

The entities are the core of the application. They represent the business rules and the data that the application will handle.

In this package we declare the entities that will be used in the application. The entities should be simple POJOs with no dependencies on any other module.

Also, here we declare the interfaces for the gateways that will be implemented in the infrastructure module.

###### Gateways

The gateways are the interfaces that the infrastructure module will implement. They are the way that the domain module communicates with the infrastructure module.

##### Use Cases

The use cases are the business rules of the application. They are the classes that will implement the business rules of the application.

#### Infrastructure

This module contains the implementations of the gateways declared in the domain module. It is responsible for the communication with the external world.

##### Driven Adapters

The driven adapters are the classes that implement the gateways declared in the domain module. They are the classes that will communicate with the external world.

These types of classes are intended to be the way that we consume data from the external world. They should be simple classes that only knows how to communicate with the external world.

##### Entry Points

The entry points are the classes that will be responsible for the communication with the external world. They are the classes that will receive the requests from the external world and will call the use cases.

#### Configuration

This module contains the configuration of the application. It is responsible for the configuration of the application.

The configuration of Spring Boot and Spring Security are declared in this module.

#### Application

This module contains the main class of the application. It is responsible for the initialization of the application.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.3/gradle-plugin/packaging-oci-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.4.3/reference/actuator/index.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.3/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.3/reference/using/devtools.html)
* [Liquibase Migration](https://docs.spring.io/spring-boot/3.4.3/how-to/data-initialization.html#howto.data-initialization.migration-tool.liquibase)
* [Java Mail Sender](https://docs.spring.io/spring-boot/3.4.3/reference/io/email.html)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/htmlsingle/)
* [Spring Security](https://docs.spring.io/spring-boot/3.4.3/reference/web/spring-security.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.3/reference/web/servlet.html)
* [WebSocket](https://docs.spring.io/spring-boot/3.4.3/reference/messaging/websockets.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

