package cn.plutowu.registry;

import cn.plutowu.extension.SPI;

import java.net.InetSocketAddress;

/**
 * 服务注册中心
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@SPI
public interface ServiceRegistry {

    /**
     * 注册服务
     *
     * @param rpcServiceName    rpc服务名称
     * @param inetSocketAddress inet套接字地址
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
