package com.yaoyx.common;

/**
 * 返回工具类
 *
 * @author Augus
 */
public class ResultUtils {
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }
}
