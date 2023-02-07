package com.telekom.hackfest.rewardsystem.repository.impl;

import com.telekom.hackfest.rewardsystem.dto.User;
import com.telekom.hackfest.rewardsystem.mapper.UserRowMapper;
import com.telekom.hackfest.rewardsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User getUserDetails(String userId) {
        User user = new User();
        String query = "select a.user_id,a.username,b.avatar_name from user a inner join avatar b " +
                "on a.avatar_id = b.avatar_id where user_id = '"+userId+"'";
        System.out.println(query);
        user = jdbcTemplate.queryForObject(query,new UserRowMapper());

        String coinQuery = "select balance_coin from rewards where user_id = '"+userId+"'";
        user.setBalanceCoins(jdbcTemplate.queryForObject(coinQuery,Integer.class));

        return user;
    }

    @Override
    public boolean updateCoins(String userId, int coins) {
        String query = "update rewards set balance_coin = balance_coin + "+coins+" where user_id = '"+userId+"'";
        int rows = jdbcTemplate.update(query);
        if(rows>0) return true;
        else return false;
    }
}
