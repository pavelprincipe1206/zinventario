/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/config/JacksonConfiguration.java.p.vm
 */
package com.incloud.hcp._configuration;

//@Configuration
//public class JacksonConfiguration {
//
//    @Bean
//    Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
//        JavaTimeModule module = new JavaTimeModule();
//
//        module.addDeserializer(LocalDate.class, new CustomLocalDateDeserializer());
//        module.addSerializer(LocalDate.class, new CustomLocalDateSerializer());
//
//        module.addDeserializer(LocalDateTime.class, new CustomLocalDateTimeDeserializer());
//        module.addSerializer(LocalDateTime.class, new CustomLocalDateTimeSerializer());
//
//        return new Jackson2ObjectMapperBuilder()
//                .featuresToDisable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
//                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
//                .findModulesViaServiceLoader(true)
//                .modulesToInstall(module);
//    }
//}

public class JacksonConfiguration {
}