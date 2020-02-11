package com.bagevent.pojo;

import java.sql.Timestamp;

public class Userloginlog {
    private int login_id;
    private int user_id;
    private Timestamp login_time;
    private String login_ip;

    @Override
    public String toString() {
        return "Userloginlog{" +
                "login_id=" + login_id +
                ", user_id=" + user_id +
                ", login_time=" + login_time +
                ", login_ip='" + login_ip + '\'' +
                '}';
    }

    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Timestamp getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }
}
