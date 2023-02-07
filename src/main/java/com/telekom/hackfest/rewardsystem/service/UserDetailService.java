package com.telekom.hackfest.rewardsystem.service;

import com.telekom.hackfest.rewardsystem.dto.User;
import com.telekom.hackfest.rewardsystem.dto.UserDetailResponseDto;

public interface UserDetailService {
        UserDetailResponseDto userDetail(String userId);
}
