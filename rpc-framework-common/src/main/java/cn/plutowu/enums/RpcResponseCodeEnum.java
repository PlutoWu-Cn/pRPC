package cn.plutowu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * rpc相应状态码
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@Getter
@ToString
public enum RpcResponseCodeEnum {

    SUCCESS(200, "远程通信成功"),
    FAIL(500, "远程通信失败");

    private final int code;

    private final String message;

}
