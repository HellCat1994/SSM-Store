package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Setter
@Getter
public class ProductCategory {
	private Long productCategoryId;
	private Long shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;
}
