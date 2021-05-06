package cn.plutowu.annotation;

import java.lang.annotation.*;

/**
 * rpc服务
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface RpcService {

    /**
     * 服务版本，默认为空字符
     */
    String version() default "";

    /**
     * 组，默认为空字符
     */
    String group() default "";

}
