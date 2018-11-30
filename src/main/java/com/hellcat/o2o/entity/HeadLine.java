package com.hellcat.o2o.entity;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Setter
@Getter
public class HeadLine {
	private Long lineId;
	private String lineName;
	private String lineLink;
	private String lineImg;
	private Integer priority;
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
}
