package com.telekom.hackfest.rewardsystem.repository.impl;

import com.telekom.hackfest.rewardsystem.dto.Video;
import com.telekom.hackfest.rewardsystem.mapper.VideoRowMapper;
import com.telekom.hackfest.rewardsystem.repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoRepoImpl implements VideoRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Video> getRecommendedVideos(String genre) {
        String query = "select * from video a inner join genre b" +
                " on a.genre = b.id where b.name='"+genre+"' order by a.id";
        System.out.println(query);
        List<Video> videos = jdbcTemplate.query(query,new VideoRowMapper());
        System.out.println(videos.toString());
        return videos;
    }

    @Override
    public List<Video> getNonRecommendedVideos(String genre) {
        String query = "select * from video a inner join genre b" +
                " on a.genre = b.id where b.name!='"+genre+"' order by a.id";
        System.out.println(query);
        List<Video> videos = jdbcTemplate.query(query,new VideoRowMapper());
        System.out.println(videos.toString());
        return videos;
    }


}
