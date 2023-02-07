package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;

@Data
public class UserDetailResponseDto {
    public int status;
    public String message;
    public User data;
}
