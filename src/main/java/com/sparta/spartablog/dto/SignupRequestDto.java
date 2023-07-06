package com.sparta.spartablog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    @Pattern(regexp = "^[a-z0-9]{4,10}$",message = "알파벳 소문자 및 숫자 포함 최소 4자이상 10자 이하여야 합니다.")
    private String username;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{8,16}$",message = "알파벳 대소문자 및 숫자 포함 최소 8자이상 16자 이하여야 합니다.")
    private String password;
    @Email
    @NotBlank
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}