package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
/**
 * @author whg
 */
@Getter
@Setter
public class PersonInfo {
    /**
     * 用户的id
     */
    private Long userId;
    /**
     * 用户的姓名
     */
    private String name;
    /**
     * 用户头像的地址
     */
    private String profileImg;
    /**
     * 用户的邮箱
     */
    private String email;
    /**
     * 用户的性别
     */
    private String gender;
    /**
     * 用户的状态
     */
    private Integer enableStatus;
    /**
     * 用户的类型
     * 1 ---- 顾客
     * 2 ---- 店家
     * 3 ---- 管理员
     */
    private Integer userType;
    /**
     * 创建用户的时间
     */
    private Date createTime;
    /**
     * 最新修改的时间
     */
    private Date lastEditTime;
}
