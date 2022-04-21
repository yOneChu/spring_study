package com.kyhslam.hello.servlet.web.servletmvc.v1;

import com.kyhslam.hello.servlet.domain.member.Member;
import com.kyhslam.hello.servlet.domain.member.MemberRepository;
import com.kyhslam.hello.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class SpringMemberSaveControllerV1 {
    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members/save")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) {
        String username = (String)request.getParameter("username");
        int age = Integer.parseInt((String) request.getParameter("age"));
        System.out.println("MemberSaveControllerV3  username = " + username);
        Member member = new Member(username, age);

        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member", member);
        return mv;
    }
}
