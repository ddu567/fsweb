package com.example.ms.entity;

import com.example.ms.constant.Role;
import com.example.ms.dto.MemberFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "member")
@ToString // ?
public class Member {

    @Id
    @Column(name = "member_num")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @Column(unique = true)
    private String userId;

    @Column
    private String userPassword;

    @Column
    private String userName;

    @Column(unique = true)
    private String userEmail;

    private Role role;


    public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder) {
      Member member = new Member();
      member.setUserId(memberFormDto.getUserId());
      String password = passwordEncoder.encode(member.getUserPassword());
      member.setUserPassword(password);
      member.setUserName(memberFormDto.getUserName());
      member.setUserEmail(memberFormDto.getUserEmail());
      member.setRole(Role.ADMIN);
      return member;
    };
}
