package com.it.reggie.common;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result<T> {
        public static final Integer SUCCESS_CODE = 1;
        public static final Integer FAIL_CODE = 0;
        public static final String SUCCESS_MESSAGE = "success";
        public static final String FAIL_MESSAGE = "fail";
        /**
         * 返回状态码
         */
        private Integer code;
        /**
         * 返回信息
         */
        private String message;

        /**
         * 返回数据
         */
        private T data;

        private Map map = new HashMap();//动态数据？？？


        public static <T> Result<T> success(T t){
            Result<T> r = new Result<>();
            r.data=t;
            r.code=1;
            return r;
        }
        public static <T> Result<T> error(String message){
            Result<T> r = new Result<>();
            r.code=0;
            r.message=message;
            return r;
        }
        public Result<T> add(String key, Object value) {
            this.map.put(key, value);
            return this;
         }
}
