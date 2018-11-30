package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class LocalAuth {
    private Long localAuthId;
    private String username;
    private String password;
    private Date creatTime;
    private Date lastEditTime;
    private PersonInfo personInfo;
}