package com.company;

@EnableWs
@Configuration

public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean

    public ServletRegistrationBean dispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext( applicationContext );
        servlet.setTransformWsdlLocations( true );
        return new ServletRegistrationBean( servlet, "/ws/*" );
    }
    @Bean(name = "subjectq")

    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema subjectqSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName( "SubjectqPort" );
        wsdl11Definition.setLocationUri( "/ws" );
        wsdl11Definition.setTargetNamespace( "http://spring.io/guides/gs-producing-web-service" );
        wsdl11Definition.setSchema( subjectqSchema );
        return wsdl11Definition;
    }
    @Bean

    public XsdSchema subjectqSchema() {
        return new SimpleXsdSchema( new ClassPathResource( "Schema.xsd" ) );
    }

    private class MessageDispatcherServlet {
        public void setMainContext(MainContext mainContext) {
        }
    }
}