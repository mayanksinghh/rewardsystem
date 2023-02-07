package com.telekom.hackfest.rewardsystem.service;

import com.telekom.hackfest.rewardsystem.dto.RewardsDto;
import com.telekom.hackfest.rewardsystem.dto.RewardsRequestDto;

public interface RewardService {

     RewardsDto fetchRewards(String userId);
   RewardsDto updateRewards(String userId,String watchTime,String distinctVideos);
    String postCoins(RewardsRequestDto rewardsRequestDto);
}
