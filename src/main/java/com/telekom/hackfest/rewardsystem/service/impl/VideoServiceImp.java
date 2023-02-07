package com.telekom.hackfest.rewardsystem.service.impl;

import com.telekom.hackfest.rewardsystem.dto.Video;
import com.telekom.hackfest.rewardsystem.dto.VideoResponse;
import com.telekom.hackfest.rewardsystem.repository.VideoRepo;
import com.telekom.hackfest.rewardsystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImp implements VideoService {

    @Autowired
    VideoRepo videoRepo;
    @Override
    public VideoResponse getRecommendedVideo(String genre) {
        List<Video> videos = videoRepo.getRecommendedVideos(genre);
        videos.addAll(videoRepo.getNonRecommendedVideos(genre));
        VideoResponse videoResponse = new VideoResponse();
        videoResponse.setData(videos);
        videoResponse.setStatus(100);
        videoResponse.setMessage("Success");
        return videoResponse;
    }
}
