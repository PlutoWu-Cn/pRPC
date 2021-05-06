package cn.plutowu.entity;

import lombok.*;

/**
 * rpc服务属性
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class RpcServiceProperties {


    /** 服务版本 */
    private String version;

    /** 当接口有多个实现类时，按组分类 */
    private String group;
    private String serviceName;

    /**
     * rpc服务名称
     *
     * @return {@link String}
     */
    public String toRpcServiceName() {
        return this.getServiceName() + this.getGroup() + this.getServiceName();
    }

}
