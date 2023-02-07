package com.telekom.hackfest.rewardsystem.mapper;

import com.telekom.hackfest.rewardsystem.dto.Video;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoRowMapper implements RowMapper<Video> {
    @Override
    public Video mapRow(ResultSet rs, int rowNum) throws SQLException {
        Video video = new Video();
        video.setId(rs.getInt("id"));
        video.setDuration(rs.getInt("duration"));
        video.setUrl(rs.getString("url"));
        video.setGenreId(rs.getString("genre"));
        video.setLikes(rs.getInt("likes"));
        video.setComments(rs.getInt("comments"));
        return video;
    }
}
