package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date creatTime;
    /**
     * 与实体类作关联
     */
    private PersonInfo personInfo;
}
