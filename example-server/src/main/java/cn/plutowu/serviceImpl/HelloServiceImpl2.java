package cn.plutowu.serviceImpl;

import cn.plutowu.Hello;
import cn.plutowu.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author PlutoWu
 * @date 2021/04/24
 */
@Slf4j
public class HelloServiceImpl2 implements HelloService {

    static {
        System.out.println("HelloServiceImpl2被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl2收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl2返回: {}.", result);
        return result;
    }

}
