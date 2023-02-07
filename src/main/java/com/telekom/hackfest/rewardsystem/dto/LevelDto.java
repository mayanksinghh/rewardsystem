package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;

@Data
public class LevelDto {
    public int minimumWatchTime;
    public int distinctVideos;
    public String levelId;
    public String levelName;
}
