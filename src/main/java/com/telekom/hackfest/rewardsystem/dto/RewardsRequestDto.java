package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;

@Data
public class RewardsRequestDto {
    public int watchTime;
    public int distinctVideos;
    public String userId;
}
