package cn.plutowu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 压缩类型的枚举
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@Getter
public enum CompressTypeEnum {

    GZIP((byte) 0x01, "gzip"),
    BZIP((byte) 0x02, "bzip");

    private final byte code;
    private final String name;

    /**
     * 获取压缩类型
     *
     * @param code 代码
     * @return {@link String}
     */
    public static String getName(byte code) {
        for (CompressTypeEnum c : CompressTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }

}
