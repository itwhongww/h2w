package com.wax.h2w.config.vo;

public class Constants {
    public static class Code{
        public static final String OK = "0";//通信成功
        public static final String ERROR = "-100";//通信失败
		public static final String FAIL = "99";//业务失败
    }

    public static class Msg{
        public static final String FAIL = "网络超时...";
        public static final String SUCCESS = "成功";
		public static final String NULL_PARAM = "参数不能为空";
		public static final String WRONG_PARAM = "参数有误";
    }

}
