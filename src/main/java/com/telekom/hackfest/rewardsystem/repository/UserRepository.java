package com.telekom.hackfest.rewardsystem.repository;

import com.telekom.hackfest.rewardsystem.dto.User;

public interface UserRepository {

    public User getUserDetails(String userId);

    public boolean updateCoins(String userId, int coins);
}
