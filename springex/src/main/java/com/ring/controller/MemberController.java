package com.ring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ring.model.MemberVO;

@Controller
public class MemberController {	
	//로그인
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}	
	//로그인 서버(insert)
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public void loginPost(MemberVO mvo) {
		System.out.println(mvo);
	}
	//회원가입
	@RequestMapping(value = "/member/signup", method = RequestMethod.GET)
	public String signup() {
		return "member/signup";
	}
	//회원관리
	@RequestMapping(value = "/member/manage", method = RequestMethod.GET)
	public String manage() {
		return "member/manage";
	}
}
