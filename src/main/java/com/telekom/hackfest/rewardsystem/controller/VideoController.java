package com.telekom.hackfest.rewardsystem.controller;

import com.telekom.hackfest.rewardsystem.dto.Video;
import com.telekom.hackfest.rewardsystem.dto.VideoResponse;
import com.telekom.hackfest.rewardsystem.service.VideoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
public class VideoController {

    @Autowired
    VideoService videoService;

    @GetMapping("/recommendation/{genre}")
    public ResponseEntity<?> getRecommendedVideo(@PathVariable String genre) {
        VideoResponse videoResponse = videoService.getRecommendedVideo(genre);
//        System.out.println(videoList.toString());
        return new ResponseEntity<>(videoResponse,HttpStatus.OK);
    }
}
