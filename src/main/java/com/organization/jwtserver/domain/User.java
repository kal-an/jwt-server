package com.organization.jwtserver.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class User {

    private String login;
    private String password;
    private String firstname;
    private String lastname;
}
