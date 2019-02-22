package com.testjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Client")
@Table(name = "client")
public class Client extends BaseEntity {

    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
