/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/validation/FixedLength.p.vm.java
 */
package com.incloud.hcp.validation;

import com.incloud.hcp.validation.impl.FixedLengthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = FixedLengthValidator.class)
@Documented
public @interface FixedLength {
    int length() default 0;

    boolean nullable() default true;

    String message() default "{com.incloud.hcp.validation.FixedLength.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
