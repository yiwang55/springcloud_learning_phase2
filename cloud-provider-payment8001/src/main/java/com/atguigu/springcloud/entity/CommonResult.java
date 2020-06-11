package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private Object data;

    public CommonResult(int code, String message) {
        new CommonResult<>(code, message, null);
    }
}
