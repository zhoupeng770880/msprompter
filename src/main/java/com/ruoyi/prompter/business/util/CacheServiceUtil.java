package com.ruoyi.prompter.business.util;
//package com.pateo.qingcloud.qep.ecologymgmt.util;
//
//
//import com.alibaba.fastjson.JSON;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
///**
// * Redis缓存工具类
// *
// * @author Administrator
// * @date 2019年10月14日17:57:18
// */
//@Slf4j
//@Service
//public class CacheServiceUtil {
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    /**
//     * 增加缓存(Object)
//     * @param key key
//     * @param value value
//     */
//    public void setObject(String key, Object value) {
//        stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(value));
//    }
//
//    /**
//     * 增加缓存并设置时间(Object)
//     * @param key key
//     * @param value value
//     * @param time 过期时间
//     */
//    public void setObject(String key, Object value, Long time) {
//        stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(value),time, TimeUnit.MILLISECONDS);
//    }
//
//    /**
//     * 增加缓存(String)
//     * @param key
//     * @param value
//     * @param timeout
//     */
//	public void setString(String key, String value, long timeout) {
//		stringRedisTemplate.opsForValue().set(key, value,timeout,TimeUnit.SECONDS);
//	}
//
//    /**
//     * 获取缓存(String)
//     * @param key key
//     * @return
//     */
//    public String get(String key) {
//        return stringRedisTemplate.opsForValue().get(key);
//    }
//
//    /**
//     * 获取
//     * @param key
//     * @return
//     */
//    public Set<Object> getHashKeys(String key) {
//        return stringRedisTemplate.opsForHash().keys(key);
//    }
//
//    public Object getHashValue(String key,String hashKey) {
//        return stringRedisTemplate.opsForHash().get(key, hashKey);
//    }
//
//    public String getHashOps(String key,String hashKey) {
//        if (stringRedisTemplate.boundHashOps(key) != null) {
//            Object hashObj = stringRedisTemplate.boundHashOps(key).get(hashKey);
//            if (hashObj != null) {
//                return hashObj.toString().replace("\"", "");
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 删除key
//     * @param key
//     */
//    public void del(String key){
//        stringRedisTemplate.delete(key);
//    }
//    /**
//     * 判断是否有对应的key
//     * @param key key
//     * @return ture-有 false-没有
//     */
//    public boolean hasKey(String key) {
//        try {
//            return stringRedisTemplate.hasKey(key);
//        } catch (Exception e) {
//            log.error(e.getMessage());
//            return false;
//        }
//    }
//
//}
