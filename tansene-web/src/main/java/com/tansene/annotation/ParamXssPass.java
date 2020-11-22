package com.tansene.annotation;


import java.lang.annotation.*;

/**
 *  在Controller方法上加入该注解不会转义参数，
 *  如果不加该注解则会：<script>alert(1)</script> --> &lt;script&gt;alert(1)&lt;script&gt;
 * @author tansene
 * @since on 2020/11/20.
 */
@Target( { ElementType.METHOD } )
@Retention( RetentionPolicy.RUNTIME )
@Documented
public @interface ParamXssPass {
}
