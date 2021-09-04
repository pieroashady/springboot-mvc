package com.aldi.springtest.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    final String defaultValue = "ALDI";

    public String value() default defaultValue;

    public String message() default "must start with " + defaultValue;

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
