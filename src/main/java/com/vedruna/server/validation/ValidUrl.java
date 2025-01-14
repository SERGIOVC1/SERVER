package com.vedruna.server.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UrlValidator.class) 
public @interface ValidUrl {
    String message() default "Invalid URL format"; 
    Class<?>[] groups() default {}; 
    Class<? extends Payload>[] payload() default {}; 
}
