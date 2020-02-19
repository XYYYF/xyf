package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private long id;
    private String email;
    private String mobile;
    private String username;
    private String role;
}
