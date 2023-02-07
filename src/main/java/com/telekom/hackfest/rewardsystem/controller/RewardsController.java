package com.telekom.hackfest.rewardsystem.controller;

import java.util.List;

import com.telekom.hackfest.rewardsystem.dto.RewardsRequestDto;
import com.telekom.hackfest.rewardsystem.dto.UserDetailResponseDto;
import com.telekom.hackfest.rewardsystem.service.RewardService;
import com.telekom.hackfest.rewardsystem.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import com.example.service.springbootrewards.model.Customer;
//import com.example.service.springbootrewards.model.MyTransaction;

@CrossOrigin(origins="*")
@RequestMapping("/rewards")
@RestController
public class RewardsController {
	@Autowired
	UserDetailService userDetailService;

	@Autowired
	RewardService rewardService;
	@GetMapping("/customers")
	public String findCustomerAll() {
		return "abc";
	}

	//get user detail
	@GetMapping("/user/detail/{userid}")
	public ResponseEntity<?> getUserRewardsDetail(@PathVariable String userid) {
		return ResponseEntity.ok()
				.body(userDetailService.userDetail(userid));
	}

	//post coin
	@PostMapping("/post/coins")
	public ResponseEntity<String> postCoins(@RequestBody RewardsRequestDto rewardsRequestDto) {
		return ResponseEntity.ok()
				.body(rewardService.postCoins(rewardsRequestDto));
	}

}
	