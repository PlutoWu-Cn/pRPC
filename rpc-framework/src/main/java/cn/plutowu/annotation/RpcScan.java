package cn.plutowu.annotation;

import cn.plutowu.spring.CustomScannerRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * rpc扫描
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Import(CustomScannerRegistrar.class)
@Documented
public @interface RpcScan {

    /**
     * 包地址
     *
     * @return {@link String[]}
     */
    String[] basePackage();

}
