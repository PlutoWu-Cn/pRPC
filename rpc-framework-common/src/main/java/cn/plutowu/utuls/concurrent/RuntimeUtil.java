package cn.plutowu.utuls.concurrent;

/**
 * 运行工具
 *
 * @author PlutoWu
 * @date 2021/04/24
 */
public class RuntimeUtil {

    /**
     * 获取cpu核心数
     *
     * @return int
     */
    public static int cpus() {
        return Runtime.getRuntime().availableProcessors();
    }

}
