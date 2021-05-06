package cn;

import cn.plutowu.HelloService;
import cn.plutowu.entity.RpcServiceProperties;
import cn.plutowu.remoting.transport.socket.SocketRpcServer;
import cn.plutowu.serviceImpl.HelloServiceImpl;

/**
 * @author PlutoWu
 * @date 2021/04/24
 */
public class SocketServerMain {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceProperties rpcServiceProperties = RpcServiceProperties.builder()
                .group("test2").version("version2").build();
        socketRpcServer.registerService(helloService, rpcServiceProperties);
        socketRpcServer.start();
    }

}
