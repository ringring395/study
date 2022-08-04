package com.ring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ring.model.BoardVO;

//controller역할을 부여해주자 @활용
@Controller
public class BoardController {
	//게시판 목록 리스트
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list() {
		return "board/list";
	}
	//게시판 글쓰기 페이지(화면)
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	//게시판 글쓰기 페이지(insert이루어짐)
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public void writePost(BoardVO bvo) {
		System.out.println(bvo);
	}	
	//게시판 상세 페이지
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public String detail() {
		return "board/detail";
	}	
	//게시판 수정 페이지(update이루어짐)
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public String modify() {
		return "board/modify";
	}
	//게시판 삭제 페이지(delete이루어짐)
	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public String delete() {
		return "board/delete";
	}
}
