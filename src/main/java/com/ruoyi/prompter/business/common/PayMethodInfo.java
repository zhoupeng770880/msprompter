package com.ruoyi.prompter.business.common;

import java.util.HashMap;
import java.util.Map;

public class PayMethodInfo {
	
	public static final Map<String, String> payMethodMap  = new HashMap<String, String>();
	static {
		payMethodMap.put("1", "永久");
		payMethodMap.put("2", "按月付费");
		payMethodMap.put("3", "按季付费");
		payMethodMap.put("4", "按年付费");
		payMethodMap.put("5", "按月不自动续费");
		payMethodMap.put("6", "按季不自动续费");
		payMethodMap.put("7", "按年不自动续费");
	}
	
	public static final Map<String, String> moneyTypeMap  = new HashMap<String, String>();
	static {
		moneyTypeMap.put("1", "￥");
		moneyTypeMap.put("2", "$");
	}
	
}
