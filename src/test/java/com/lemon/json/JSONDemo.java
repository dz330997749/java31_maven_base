package com.lemon.json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-23 20:34
 * @Desc：
 **/
public class JSONDemo {
    public static void main(String[] args) {
        //Fastjson
        // json字符串 -> Java对象
//        String json = "{\"status\":1,\"isVip\":0,\"uid\":\"MDAwMDAwMDAwM\",\"info\":\"success\"}";
        //User类  Map类
        //parseObject(json字符串，你要转成的java类.class)
//        HashMap<String, Object> map = JSONObject.parseObject(json, HashMap.class);
//        System.out.println(map);
//        System.out.println(map.get("isVip"));
//        System.out.println(map.get("isVip").equals(0));
//        User user = JSONObject.parseObject(json, User.class);
//        System.out.println(user);
//        System.out.println(user.getIsVip());
//        System.out.println(user.getIsVip() == 0);
        // json字符串 -> Java集合

        String json = "[{\"status\":1,\"isVip\":0,\"uid\":\"MD\",\"info\":\"success\"}," +
                "{\"status\":1,\"isVip\":0,\"uid\":\"MA\",\"info\":\"success\"}]";
        //parseArray(json字符串，你要转成的java类.class)
//        List<HashMap> list = JSONObject.parseArray(json, HashMap.class);
//        for(HashMap<String,Object> map : list) {
//            System.out.println(map);
//        }
        List<User> users = JSONObject.parseArray(json, User.class);
        for(User user : users) {
            System.out.println(user);
            System.out.println(JSONObject.toJSONString(user));
        }
        //Java对象 ->  json字符串 toJSONString(任意java对象)
        System.out.println(JSONObject.toJSONString(users));


    }
}
