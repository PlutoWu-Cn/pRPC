package cn.plutowu.registry;

import cn.plutowu.extension.SPI;

import java.net.InetSocketAddress;

/**
 * 服务发现
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@SPI
public interface ServiceDiscovery {

    /**
     * 通过rpc服务名查找服务
     *
     * @param rpcServiceName rpc服务名称
     * @return {@link InetSocketAddress}
     */
    InetSocketAddress lookupService(String rpcServiceName);

}
