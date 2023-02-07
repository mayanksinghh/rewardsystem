package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class VideoResponse {

    public int status;
    public String message;
    public List<Video> data;
}
