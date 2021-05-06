package cn.plutowu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * rpc配置枚举
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@Getter
public enum RpcConfigEnum {

    RPC_CONFIG_PATH("rpc.properties"),
    ZK_ADDRESS("rpc.zookeeper.address");

    private final String propertyValue;

}
