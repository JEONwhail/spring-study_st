package com.example.demo.service;

import com.example.demo.dto.CommentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CommentServiceTest {

	@Autowired
	CommentService service;

	@Test
	public void 댓글등록() {

		// 테이블에 있는 게시물번호와 유저아이디 사용해야함
		CommentDTO dto = CommentDTO.builder()
				.content("댓글입니다~")
				.boardNo(1)
				.writer("user1")
				.build();

		service.register(dto);
	}


//	@Test
//	public void 목록조회() {
//		List<CommentDTO> list = service.getList();
//		for(CommentDTO dto : list) {
//			System.out.println(dto);
//		}
//	}
	
	@Test
	public void 게시물별_댓글목록조회() {
		List<CommentDTO> list = service.getListByBoardNo(3);
		for(CommentDTO dto : list) {
			System.out.println(dto);
		}
	}
	
//	@Test
//	public void 상세조회() {
//		CommentDTO dto = service.read(1);
//		System.out.println(dto);
//	}
	
//	@Test
//	public void 수정() {
//		CommentDTO dto = service.read(1);
//		dto.setContent("댓글이수정되었습니다~");
//		service.modify(dto);
//	}
	
	@Test
	public void 삭제() {
		service.remove(1);
	}
	
}
