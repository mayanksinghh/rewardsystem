package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Video {

    private int id;
    private String url;
    private String genreId;
    private int duration;
    private int views;
    private int likes;
    private int comments;
}
