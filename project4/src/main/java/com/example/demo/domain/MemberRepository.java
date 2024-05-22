package com.example.demo.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 가상 리파지토리 만들기
* */
public class MemberRepository {

    static Map<Integer, Member> store = new HashMap<>();
    static int sequence = 0;

    public Member save(Member member) {
        member.setNo(++sequence);
        store.put(member.getNo(), member);
        return member;
    }
    
    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
