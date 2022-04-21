package com.kyhslam.hello.servlet.web.servletmvc.v1;

import com.kyhslam.hello.servlet.domain.member.Member;
import com.kyhslam.hello.servlet.domain.member.MemberRepository;
import com.kyhslam.hello.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SpringMemberListControllerV1 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {
        List<Member> members = memberRepository.findAll();
        //ModelView mv = new ModelView("members");
        //mv.getModel().put("members", members);
        ModelAndView mv = new ModelAndView("members");
        mv.addObject("members", members);

        return mv;
    }
}
