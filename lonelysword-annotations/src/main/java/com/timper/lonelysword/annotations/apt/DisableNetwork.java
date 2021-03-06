package com.timper.lonelysword.annotations.apt;

/**
 * User: tangpeng.yang
 * Date: 21/05/2018
 * Description:
 * FIXME
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Documented  @Target(METHOD) @Retention(CLASS)
public @interface DisableNetwork {
}
