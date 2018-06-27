package com.ywkj.pojo;

import java.util.Date;

public class UserLogins {
    private Integer id;

    private String loginname;

    private Date logintime;

    private String loginip;

    private String loginremark;

    private String loginstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public String getLoginremark() {
        return loginremark;
    }

    public void setLoginremark(String loginremark) {
        this.loginremark = loginremark == null ? null : loginremark.trim();
    }

    public String getLoginstate() {
        return loginstate;
    }

    public void setLoginstate(String loginstate) {
        this.loginstate = loginstate == null ? null : loginstate.trim();
    }
}