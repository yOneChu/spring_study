package com.kyhslam.hello.servlet.web.frontcontroller.v3.controller;

import com.kyhslam.hello.servlet.domain.member.Member;
import com.kyhslam.hello.servlet.domain.member.MemberRepository;
import com.kyhslam.hello.servlet.web.frontcontroller.ModelView;
import com.kyhslam.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = (String)paramMap.get("username");
        int age = Integer.parseInt((String) paramMap.get("age"));
        System.out.println("MemberSaveControllerV3  username = " + username);
        Member member = new Member(username, age);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
