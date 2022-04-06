package com.kyhslam.hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {

    }

    public Member(String usernaem, int age) {
        this.username = usernaem;
        this.age = age;
    }
}
