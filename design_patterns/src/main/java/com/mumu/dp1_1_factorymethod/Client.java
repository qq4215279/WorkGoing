package com.mumu.dp1_1_factorymethod;

import com.mumu.dp1_1_factorymethod.core.Logger;
import com.mumu.dp1_1_factorymethod.core.LoggerFactory;

public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		// factory = new FileLoggerFactory(); // 可引入配置文件实现
		factory = (LoggerFactory)XMLUtil.getBean(); // getBean()的返回类型为Object，需要进行强制类型转换

		logger = factory.createLogger();
		logger.writeLog();
	}
}
