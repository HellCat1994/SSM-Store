package com.hellcat.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
	private Long productId;
	private String productName;
	private String productDesc;
	// 简略图
	private String imgAddr;
	private String normalPrice;
	private String promotionPrice;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private Integer enableStatus;
	private List<ProductImg> productImgList;
	private ProductCategory productCategory;
	private Shop shop;
}
