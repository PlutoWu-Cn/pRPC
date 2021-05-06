package cn.plutowu.compress;

import cn.plutowu.extension.SPI;

/**
 * 压缩接口
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
@SPI
public interface Compress {

    /**
     * 压缩
     *
     * @param bytes 字节
     * @return {@link byte[]}
     */
    byte[] compress(byte[] bytes);


    /**
     * 解压缩
     *
     * @param bytes 字节
     * @return {@link byte[]}
     */
    byte[] decompress(byte[] bytes);

}
