package cn.plutowu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 序列化类型的枚举
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@AllArgsConstructor
@Getter
public enum SerializationTypeEnum {

    KYRO((byte) 0x01, "kyro"),
    PROTOSTUFF((byte) 0x02, "protostuff");;

    private final byte code;
    private final String name;

    /**
     * 获取序列化类型
     *
     * @param code 代码
     * @return {@link String}
     */
    public static String getName(byte code) {
        for (SerializationTypeEnum c : SerializationTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }

}
