package com.ring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	//회원목록리스트
	@RequestMapping(value = "/member/memberlist", method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("memberlist", ms.memberlist());
		return "member/memberlist";
	}
	//회원상세페이지
	@RequestMapping(value = "/member/memberdetail", method = RequestMethod.GET)
	public String detail(MemberVO member, Model model) {
		ms.memberdetail(member);
		model.addAttribute("memberdetail", ms.memberdetail(member));
		return "member/memberdetail";
	}
	//회원 정보 수정
	@RequestMapping(value = "/member/membermodify", method =RequestMethod.POST)
	public String modify(MemberVO member, RedirectAttributes rttr) {
		ms.membermodify(member);
		rttr.addAttribute("id", member.getId());
		return "redirect:/member/memberdetail";
	}
	//회원 탈퇴
	@RequestMapping(value="/member/resign", method=RequestMethod.POST)
	public String resign(MemberVO member) {
		ms.resign(member);
		return "redirect:/member/signup";	//탈퇴했으니까 회원가입으로 보내자
	}
}
