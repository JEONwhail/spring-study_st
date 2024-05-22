package com.example.demo.repository;

import com.example.demo.entity.Member;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Board;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional //JPA Query로 INSERT, UPDATE, DELETE를 사용시 선언 (commit 처리)
public interface BoardRepository extends JpaRepository<Board, Integer> {

    //작성자 필드를 기준으로 게시물을 삭제하는 메소드 추가
    @Modifying //@Query로 INSERT, UPDATE, DELETE를 작성시 선언
    @Query("delete from Board b where b.writer = :member")
    public void deleteWriter(@Param("member") Member member);

}
