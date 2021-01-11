package com.glencconnect.conference.model;

import javax.validation.constraints.NotEmpty;

/**
 * Created by glenc on Jan 2021
 **/
public class Registration {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
