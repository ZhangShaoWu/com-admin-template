package com.admin.template.model.dao;

import com.admin.template.model.entity.MovieEntity;
import com.admin.framework.orm.support.BaseDao;
import org.apache.ibatis.annotations.Mapper;


/**
 * 电影表
 * @author zsw
 * @date 2019-09-30 10:41:58
 */
@Mapper
public interface MovieDao extends BaseDao<MovieEntity,Integer> {


}
