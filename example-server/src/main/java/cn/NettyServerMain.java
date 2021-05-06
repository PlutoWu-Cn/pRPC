package cn;

import cn.plutowu.HelloService;
import cn.plutowu.annotation.RpcScan;
import cn.plutowu.entity.RpcServiceProperties;
import cn.plutowu.remoting.transport.netty.server.NettyRpcServer;
import cn.plutowu.serviceImpl.HelloServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author PlutoWu
 * @date 2021/04/24
 */
@RpcScan(basePackage = {"cn.plutowu"})
public class NettyServerMain {

    public static void main(String[] args) {
        // 通过注释注册服务
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyServerMain.class);
        NettyRpcServer nettyRpcServer = (NettyRpcServer) applicationContext.getBean("nettyRpcServer");
        // 手动注册服务
        HelloService helloService2 = new HelloServiceImpl2();
        RpcServiceProperties rpcServiceProperties = RpcServiceProperties.builder()
                .group("test2").version("version2").build();
        nettyRpcServer.registerService(helloService2, rpcServiceProperties);
        nettyRpcServer.start();
    }

}
