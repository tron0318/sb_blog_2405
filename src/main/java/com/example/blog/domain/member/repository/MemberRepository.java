package com.example.blog.domain.member.repository;

import com.example.blog.domain.post.entity.Member;
import com.example.blog.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}