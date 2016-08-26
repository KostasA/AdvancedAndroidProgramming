package com.grinkoan.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by grinkoan on 8/25/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo
{
	public enum Priority
	{
		LOW,MEDIUM,HIGH
	}

	Priority priority() default  Priority.MEDIUM;
	String[] tags() default "";
	String createdBy() default "Mkyong";
	String lastModified() default "03/01/2014";


}
