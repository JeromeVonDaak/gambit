package com.gambit.Gambit.dtos;

import com.gambit.Gambit.models.UserRole;

// dtos/SignUpDto.java
public record SignUpDto(
    String login,
    String password,
    UserRole role) {
}
