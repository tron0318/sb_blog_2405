package com.example.blog2.domain.member.entity;

import com.example.blog2.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member extends BaseEntity {
    @Comment("유저 아이디")
    @Column(unique = true)
    private String username;
    private String password;

    @Column(unique = true)
    private String nickname;
    private String email;

}