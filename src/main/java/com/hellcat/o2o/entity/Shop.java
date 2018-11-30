package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class Shop {
	private Long shopId;
	private Long ownerId;
	private Long shopCategoryId;
	private String shopName;
	private String shopDesc;
	private String shopAddr;
	private String phone;
	private String shopImg;
	private Double longitude;
	private Double latitude;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private Integer enableStatus;
	private String advice;

	private Area area;
	private PersonInfo owner;
	private ShopCategory shopCategory;
}
