package com.example.demo.controller;

import com.example.demo.dto.CommentDTO;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService service;

	//게시물별 댓글 목록 조회
	@ResponseBody // 리스트를 json형식으로 변환
	@GetMapping("/list")
	public List<CommentDTO> list(@RequestParam(name = "boardNo") int boardNo) {
		// 게시물 기준으로 댓글 목록 조회
		List<CommentDTO> commentlist = service.getListByBoardNo(boardNo);
		// 댓글 목록 반환
		return commentlist;
	}
	
	@ResponseBody
	@PostMapping("/register")
	public HashMap<String,Boolean> register(CommentDTO dto) {
		// 맵 객체 생성
		HashMap<String,Boolean> map = new HashMap<>();
		// 임시 아이디. 시큐리티 배운 후에 변경해야함.
		String id = "user1"; 
		dto.setWriter(id);
		// 새로운 댓글 등록
		service.register(dto);
		// 처리결과 반환
		map.put("success", true);
		return map;
	}
	
	@ResponseBody
	@GetMapping("/remove")
	public HashMap<String,Boolean> remove(@RequestParam(name = "commentNo") int commentNo) {
		// 맵 객체 생성
		HashMap<String,Boolean> map = new HashMap<>();
		// 댓글 삭제
		boolean result = service.remove(commentNo);
		// 처리결과 반환
		map.put("success", result);
		return map;
	}

}
