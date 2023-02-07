package com.telekom.hackfest.rewardsystem.service.impl;

import com.telekom.hackfest.rewardsystem.dto.RewardsDto;
import com.telekom.hackfest.rewardsystem.dto.RewardsRequestDto;
import com.telekom.hackfest.rewardsystem.repository.UserRepository;
import com.telekom.hackfest.rewardsystem.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsServiceImpl implements RewardService {

    @Autowired
    UserRepository userRepository;
    public RewardsDto fetchRewards(String userId)
    {
        return null;
    }
    public RewardsDto updateRewards(String userId,String watchTime,String distinctVideos)
    {
        return null;
    }

    public String postCoins(RewardsRequestDto rewardsRequestDto)
    { boolean result = userRepository.updateCoins(rewardsRequestDto.userId,rewardsRequestDto.watchTime/10);

        return "success";
    }
}
