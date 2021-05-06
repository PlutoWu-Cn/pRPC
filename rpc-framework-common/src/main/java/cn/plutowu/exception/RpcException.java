package cn.plutowu.exception;

import cn.plutowu.enums.RpcErrorMessageEnum;

/**
 * rpc异常
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
public class RpcException extends RuntimeException {

    /**
     * @param rpcErrorMessageEnum rpc错误消息枚举
     * @param detail              描述
     */
    public RpcException(RpcErrorMessageEnum rpcErrorMessageEnum, String detail) {
        super(rpcErrorMessageEnum.getMessage() + ":" + detail);
    }

    /**
     * @param message 消息
     * @param cause   起因
     */
    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param rpcErrorMessageEnum rpc错误消息枚举
     */
    public RpcException(RpcErrorMessageEnum rpcErrorMessageEnum) {
        super(rpcErrorMessageEnum.getMessage());
    }

}
