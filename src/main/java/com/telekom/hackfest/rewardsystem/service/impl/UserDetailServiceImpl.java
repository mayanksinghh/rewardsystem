package com.telekom.hackfest.rewardsystem.service.impl;

import com.telekom.hackfest.rewardsystem.dto.User;
import com.telekom.hackfest.rewardsystem.dto.UserDetailResponseDto;
import com.telekom.hackfest.rewardsystem.dto.Video;
import com.telekom.hackfest.rewardsystem.mapper.VideoRowMapper;
import com.telekom.hackfest.rewardsystem.repository.UserRepository;
import com.telekom.hackfest.rewardsystem.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    UserRepository userRepository;

    public UserDetailResponseDto userDetail(String userId)
    {
        UserDetailResponseDto userDetailResponseDto = new UserDetailResponseDto();
        userDetailResponseDto.setData(userRepository.getUserDetails(userId));
        userDetailResponseDto.setStatus(100);
        userDetailResponseDto.setMessage("Success");
        return userDetailResponseDto;
    }

}
