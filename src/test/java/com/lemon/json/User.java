package com.lemon.json;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-23 20:46
 * @Desc：
 **/
public class User {
    //json 转换类
    //必须有空参构造（写了有参，必须把空参补上）
    //属性必须私有，属性必须有对应的get/set
    private int status;
    private int isVip;
    private String uid;
    private String info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsVip() {
        return isVip;
    }

    public void setIsVip(int isVip) {
        this.isVip = isVip;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "status=" + status +
                ", isVip=" + isVip +
                ", uid='" + uid + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
