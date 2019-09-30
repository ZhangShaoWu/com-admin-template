package com.admin.template.model.entity;

import lombok.Data;
import java.util.Date;

/**
 * 电影表
 * @author zsw
 * @date 2019-09-30 10:41:58
 */
@Data
public class MovieEntity{
/**
    *
	 */
    
	private Integer id;
	/**
    *
	 */
    
	private Date createTime;
	/**
    *
	 */
    
	private Date modifyTime;
	/**
    *
	 */
    
	private Integer version;
	/**
    *图片
	 */
    
	private String image;
	/**
    *名称
	 */
    
	private String name;
	

}
