package cn.plutowu.loadbalance;

import cn.plutowu.extension.SPI;

import java.util.List;

/**
 * 负载均衡接口
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@SPI
public interface LoadBalance {

    /**
     * 从列表中选择服务地址列表
     *
     * @param serviceAddresses 服务地址列表
     * @param rpcServiceName   rpc服务名称
     * @return {@link String} 目标服务地址
     */
    String selectServiceAddress(List<String> serviceAddresses, String rpcServiceName);

}
