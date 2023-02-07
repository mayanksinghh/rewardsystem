package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;
import lombok.Getter;


@Data
public class RewardsDto {
    private String userId;
    private String rewardsId;
    private int points;
    private int distinctVideos;
    private int rewardPoints;
}
