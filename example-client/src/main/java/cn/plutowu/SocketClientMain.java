package cn.plutowu;

import cn.plutowu.entity.RpcServiceProperties;
import cn.plutowu.proxy.RpcClientProxy;
import cn.plutowu.remoting.transport.RpcRequestTransport;
import cn.plutowu.remoting.transport.socket.SocketRpcClient;

/**
 * @author PlutoWu
 * @date 2021/04/24
 */
public class SocketClientMain {

    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceProperties rpcServiceProperties = RpcServiceProperties.builder()
                .group("test2").version("version2").build();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceProperties);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        String hello = helloService.hello(new Hello("111", "222"));
        System.out.println(hello);
    }

}
