package cn.plutowu.extension;

/**
 * @author PlutoWu
 * @date 2021/04/24
 */
public class Holder<T> {

    private volatile T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

}
