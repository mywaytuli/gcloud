package com.tuli.gcloud.test.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
public class ManagerUserVO {
    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String email;

    private String job;

    private Date created;

    private Date updated;

    private String joinus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getJoinus() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy MM");

        return format.format(this.getCreated()).toString() + "加入公司";
    }

    public void setJoinus(String joinus) {
        this.joinus = joinus;
    }
}
