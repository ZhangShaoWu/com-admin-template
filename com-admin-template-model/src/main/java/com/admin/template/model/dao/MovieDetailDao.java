package com.admin.template.model.dao;

import com.admin.template.model.entity.MovieDetailEntity;
import com.admin.framework.orm.support.BaseDao;
import org.apache.ibatis.annotations.Mapper;


/**
 * 
 * @author zsw
 * @date 2019-09-30 10:41:59
 */
@Mapper
public interface MovieDetailDao extends BaseDao<MovieDetailEntity,Integer> {


}
