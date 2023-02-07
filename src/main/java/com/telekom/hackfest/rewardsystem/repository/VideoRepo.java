package com.telekom.hackfest.rewardsystem.repository;

import com.telekom.hackfest.rewardsystem.dto.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepo {

    public List<Video> getRecommendedVideos(String genre);

    public List<Video> getNonRecommendedVideos(String genre);
}
