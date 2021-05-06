package cn.plutowu.remoting.dto;

import cn.plutowu.entity.RpcServiceProperties;
import lombok.*;

import java.io.Serializable;

/**
 * rpc请求
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class RpcRequest implements Serializable {

    private static final long serialVersionUID = 1905122041950251207L;
    private String requestId;
    private String interfaceName;
    private String methodName;
    private Object[] parameters;
    private Class<?>[] paramTypes;
    private String version;
    private String group;

    /**
     * rpc属性
     *
     * @return {@link RpcServiceProperties}
     */
    public RpcServiceProperties toRpcProperties() {
        return RpcServiceProperties.builder().serviceName(this.getInterfaceName())
                .version(this.getVersion())
                .group(this.getGroup()).build();
    }

}
