package com.example.blog2.domain.post.entity;

import com.example.blog2.domain.member.entity.Member;
import com.example.blog2.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post extends BaseEntity {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    @ManyToOne
    private Member author;
}