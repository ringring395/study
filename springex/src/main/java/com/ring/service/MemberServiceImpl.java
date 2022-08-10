package com.ring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ring.mapper.MemberMapper;
import com.ring.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper mm;
	//회원가입
	public void signup(MemberVO member) {
		System.out.println("회원가입 "+member);
		mm.signup(member);
		
	}
	//회원정보리스트
	
	//회원상세내용보기/로그인(+session)
	
	//회원정보수정(개명,비밀번호변경
	
	//회원탈퇴

}
