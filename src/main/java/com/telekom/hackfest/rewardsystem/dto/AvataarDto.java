package com.telekom.hackfest.rewardsystem.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class AvataarDto {
    private String minimumLevelId;
    private String avtaarId;
    private String avtaarName;
    private Date lastDate;
}
