package com.example.gadgetzone;
public class insertionClass {
    String phone;
    String name;
    public insertionClass(String name, String phone) {
        this.name = name;

        this.phone = phone;
    }

    String movie; String seat;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}