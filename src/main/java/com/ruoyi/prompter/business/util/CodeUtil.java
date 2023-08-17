package com.ruoyi.prompter.business.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 唯一业务编码生成工具类
 * @author jie.li
 * @date 2020年3月2日16:43:26
 */
public class CodeUtil {

    /**
     * 生成唯一业务编码
     * @param bussinessCode
     * @return
     */
    public static String uniqueCode(String bussinessCode){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String date = simpleDateFormat.format(new Date());
        String randomNum = String.format("%04d",new Random().nextInt(9999));
        return bussinessCode + randomNum + date;
    }
    
    public static String primaryKey() {
    	return UUID.randomUUID().toString().replaceAll("-","");
    }
    
}
