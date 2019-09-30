package com.admin.template.model.entity;

import lombok.Data;
import java.util.Date;

/**
 * 
 * @author zsw
 * @date 2019-09-30 10:41:59
 */
@Data
public class MovieDetailEntity{
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
    *电影id
	 */
    
	private Integer movieId;
	/**
    *名称
	 */
    
	private String name;
	/**
    *地址
	 */
    
	private String url;
	/**
    *类型
	 */
    
	private String type;
	

}
