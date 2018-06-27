package com.ywkj.pojo;

public class UserLoginsWithBLOBs extends UserLogins {
    private String browserinfo;

    private String osinfo;

    public String getBrowserinfo() {
        return browserinfo;
    }

    public void setBrowserinfo(String browserinfo) {
        this.browserinfo = browserinfo == null ? null : browserinfo.trim();
    }

    public String getOsinfo() {
        return osinfo;
    }

    public void setOsinfo(String osinfo) {
        this.osinfo = osinfo == null ? null : osinfo.trim();
    }
}