package com.telekom.hackfest.rewardsystem.service;

import com.telekom.hackfest.rewardsystem.dto.Video;
import com.telekom.hackfest.rewardsystem.dto.VideoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VideoService {

    public VideoResponse getRecommendedVideo(String genre);
}
