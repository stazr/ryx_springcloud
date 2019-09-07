package com.ryx.serviceinterface.pojo;

/**
 * @program: ryx_springcloud
 *
 * @description:
 *
 * @author: renyuanxin
 *
 * @create: 2019-02-20 14:29
 **/
public class User {


    private Integer id;
    /**
     * 用户登陆名称
     */
    private String loginName;
    /**
     *用户姓名
     */
    private String name;

    /**
     *用户头像
     */
    private String avatar;

    /**
     *信息备注
     */
    private String memos;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
