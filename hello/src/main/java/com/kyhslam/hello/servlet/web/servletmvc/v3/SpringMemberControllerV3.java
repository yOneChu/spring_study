package com.kyhslam.hello.servlet.web.servletmvc.v3;

import com.kyhslam.hello.servlet.domain.member.Member;
import com.kyhslam.hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    //@RequestMapping(value = "/new-form", method = RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm() {
        return "new-form";
    }

    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String save(
            @RequestParam("username") String username,
            @RequestParam("age") int age,
            Model model) {
        Member member = new Member(username, age);

        model.addAttribute("member", member);
        return "save-result";
    }

    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "members";
    }

}
