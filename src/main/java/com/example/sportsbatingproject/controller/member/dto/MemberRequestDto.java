package com.example.sportsbatingproject.controller.member.dto;

import com.example.sportsbatingproject.repository.member.entity.Member;
import com.example.sportsbatingproject.repository.member.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MemberRequestDto {
    private String email;
    private String password;
    private String name;
    private String contact;
    private String phoneNumber;
    private Role role;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .contact(contact)
                .phoneNumber(phoneNumber)
                .role(role)
                .build();
    }
}
