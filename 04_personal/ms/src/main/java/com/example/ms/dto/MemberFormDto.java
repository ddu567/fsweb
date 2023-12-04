package com.example.ms.dto;

import com.example.ms.entity.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
@RequiredArgsConstructor
public class MemberFormDto {

    @NotBlank
    private String userId;

    @NotBlank
    @Length (min = 8, max = 12, message = "8자 이상 12자 이하로 입력해주세요.")
    private String userPassword;

    @NotBlank
    private String userName;

    @NotBlank
    @Email
    private String userEmail;


    public static MemberFormDto toMemberDto(Member member) {
        MemberFormDto memberFormDto = new MemberFormDto();
        memberFormDto.setUserId(member.getUserId());
        memberFormDto.setUserPassword(member.getUserPassword());
        memberFormDto.setUserName(member.getUserName());
        memberFormDto.setUserEmail(member.getUserEmail());
        return memberFormDto;
    }

}
