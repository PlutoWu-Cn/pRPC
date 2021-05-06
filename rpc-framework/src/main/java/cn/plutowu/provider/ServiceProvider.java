package cn.plutowu.provider;

import cn.plutowu.entity.RpcServiceProperties;

/**
 * 服务提供者
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
public interface ServiceProvider {

    /**
     * 添加服务
     *
     * @param service              服务对象
     * @param serviceClass         类实现的服务实例对象的接口
     * @param rpcServiceProperties 服务相关属性
     */
    void addService(Object service, Class<?> serviceClass, RpcServiceProperties rpcServiceProperties);

    /**
     * 获得服务
     *
     * @param rpcServiceProperties 服务相关属性
     * @return 服务对象
     */
    Object getService(RpcServiceProperties rpcServiceProperties);

    /**
     * 发布服务
     *
     * @param service              服务对象
     * @param rpcServiceProperties 服务相关属性
     */
    void publishService(Object service, RpcServiceProperties rpcServiceProperties);

    /**
     * @param service 服务对象
     */
    void publishService(Object service);

}
