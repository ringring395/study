package com.ring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ring.model.MemberVO;
import com.ring.service.MemberService;

@Controller
public class MemberController {	
	//상속선언
	@Autowired
	MemberService ms;
	
	//로그인
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	//로그인 서버(insert)
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public void loginPost(MemberVO member) {
		System.out.println(member);
	}
	
	//회원가입
	@RequestMapping(value = "/member/signup", method = RequestMethod.GET)
	public String signup(MemberVO member) {
		return "member/signup";
	}
	
	//회원가입(insert이뤄짐)
	@RequestMapping(value = "/member/signup", method = RequestMethod.POST)
	public String signupPost(MemberVO member) {
		ms.signup(member);
		return "redirect:/member/login";

	}
	//회원관리
	@RequestMapping(value = "/member/manage", method = RequestMethod.GET)
	public String manage() {
		return "member/manage";
	}
}
