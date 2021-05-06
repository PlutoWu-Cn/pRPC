package cn.plutowu.loadbalance;

import java.util.List;

/**
 * 抽象负载均衡
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
public abstract class AbstractLoadBalance implements LoadBalance {

    /**
     * 选择服务地址
     *
     * @param serviceAddresses 服务地址
     * @param rpcServiceName   rpc服务名称
     * @return {@link String}
     */
    @Override
    public String selectServiceAddress(List<String> serviceAddresses, String rpcServiceName) {
        if (serviceAddresses == null || serviceAddresses.size() == 0) {
            return null;
        }
        if (serviceAddresses.size() == 1) {
            return serviceAddresses.get(0);
        }
        return doSelect(serviceAddresses, rpcServiceName);
    }

    protected abstract String doSelect(List<String> serviceAddresses, String rpcServiceName);

}
