package cn.plutowu.remoting.transport;

import cn.plutowu.extension.SPI;
import cn.plutowu.remoting.dto.RpcRequest;

/**
 * 发送rpc请求
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@SPI
public interface RpcRequestTransport {

    /**
     * 发送rpc请求至服务端并获取结果
     *
     * @param rpcRequest 请求体
     * @return {@link Object} 服务数据
     */
    Object sendRpcRequest(RpcRequest rpcRequest);

}
