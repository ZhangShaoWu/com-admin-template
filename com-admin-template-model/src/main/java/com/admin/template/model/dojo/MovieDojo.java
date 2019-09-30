package com.admin.template.model.dojo;

import com.admin.template.model.entity.MovieEntity;
import com.admin.template.model.dao.MovieDao;
import com.admin.framework.orm.constant.ConditionExpressionEnum;
import com.admin.framework.orm.dojo.BaseDojo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 电影表
 * @author zsw
 * @date 2019-09-30 10:41:58
 */
@Component
public class MovieDojo extends BaseDojo<MovieEntity>{


    public MovieDojo(){
        super(MovieDao.class,MovieEntity.class,"m");
    }

    
    public MovieDojo idOrderAsc(){
        addSql("id", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo idOrderDesc(){
        addSql("id",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo idEqual(Integer id){
        addSql("id",ConditionExpressionEnum.EQUALS,id);
        return this;
    }

    public MovieDojo idNotEqual(Integer id){
        addSql("id",ConditionExpressionEnum.NOT_EQUALS,id);
        return this;
    }

    public MovieDojo idContain(Integer id){
        addSql("id",ConditionExpressionEnum.CONTAIN, id);
        return this;
    }

    public MovieDojo idStart(String id){
        addSql("id",ConditionExpressionEnum.START, id);
        return this;
    }

    public MovieDojo idEnd(Integer id){
        addSql("id",ConditionExpressionEnum.END, id);
        return this;
    }

    public MovieDojo idGreat(Integer id){
        addSql("id", ConditionExpressionEnum.GREATER, id);
        return this;
    }

    public MovieDojo idLess(Integer id){
        addSql("id",ConditionExpressionEnum.LESS, id);
        return this;
    }

    public MovieDojo idGreatEqual(Integer id){
        addSql("id",ConditionExpressionEnum.GREATER_EQUALS, id);
        return this;
    }

    public MovieDojo idLessEqual(Integer id){
        addSql("id",ConditionExpressionEnum.LESS_EQUALS, id);
        return this;
    }

    public MovieDojo idBetween(String start, String end){
        addSql("id",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo idIsNull(){
        addSql("id",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo idIsNotNull(){
        addSql("id",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDojo createTimeOrderAsc(){
        addSql("createTime", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo createTimeOrderDesc(){
        addSql("createTime",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo createTimeEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.EQUALS,createTime);
        return this;
    }

    public MovieDojo createTimeNotEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.NOT_EQUALS,createTime);
        return this;
    }

    public MovieDojo createTimeContain(Date createTime){
        addSql("createTime",ConditionExpressionEnum.CONTAIN, createTime);
        return this;
    }

    public MovieDojo createTimeStart(String createTime){
        addSql("createTime",ConditionExpressionEnum.START, createTime);
        return this;
    }

    public MovieDojo createTimeEnd(Date createTime){
        addSql("createTime",ConditionExpressionEnum.END, createTime);
        return this;
    }

    public MovieDojo createTimeGreat(Date createTime){
        addSql("createTime", ConditionExpressionEnum.GREATER, createTime);
        return this;
    }

    public MovieDojo createTimeLess(Date createTime){
        addSql("createTime",ConditionExpressionEnum.LESS, createTime);
        return this;
    }

    public MovieDojo createTimeGreatEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.GREATER_EQUALS, createTime);
        return this;
    }

    public MovieDojo createTimeLessEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.LESS_EQUALS, createTime);
        return this;
    }

    public MovieDojo createTimeBetween(String start, String end){
        addSql("createTime",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo createTimeIsNull(){
        addSql("createTime",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo createTimeIsNotNull(){
        addSql("createTime",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDojo modifyTimeOrderAsc(){
        addSql("modifyTime", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo modifyTimeOrderDesc(){
        addSql("modifyTime",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo modifyTimeEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.EQUALS,modifyTime);
        return this;
    }

    public MovieDojo modifyTimeNotEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.NOT_EQUALS,modifyTime);
        return this;
    }

    public MovieDojo modifyTimeContain(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.CONTAIN, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeStart(String modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.START, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeEnd(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.END, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeGreat(Date modifyTime){
        addSql("modifyTime", ConditionExpressionEnum.GREATER, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeLess(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.LESS, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeGreatEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.GREATER_EQUALS, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeLessEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.LESS_EQUALS, modifyTime);
        return this;
    }

    public MovieDojo modifyTimeBetween(String start, String end){
        addSql("modifyTime",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo modifyTimeIsNull(){
        addSql("modifyTime",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo modifyTimeIsNotNull(){
        addSql("modifyTime",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDojo versionOrderAsc(){
        addSql("version", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo versionOrderDesc(){
        addSql("version",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo versionEqual(Integer version){
        addSql("version",ConditionExpressionEnum.EQUALS,version);
        return this;
    }

    public MovieDojo versionNotEqual(Integer version){
        addSql("version",ConditionExpressionEnum.NOT_EQUALS,version);
        return this;
    }

    public MovieDojo versionContain(Integer version){
        addSql("version",ConditionExpressionEnum.CONTAIN, version);
        return this;
    }

    public MovieDojo versionStart(String version){
        addSql("version",ConditionExpressionEnum.START, version);
        return this;
    }

    public MovieDojo versionEnd(Integer version){
        addSql("version",ConditionExpressionEnum.END, version);
        return this;
    }

    public MovieDojo versionGreat(Integer version){
        addSql("version", ConditionExpressionEnum.GREATER, version);
        return this;
    }

    public MovieDojo versionLess(Integer version){
        addSql("version",ConditionExpressionEnum.LESS, version);
        return this;
    }

    public MovieDojo versionGreatEqual(Integer version){
        addSql("version",ConditionExpressionEnum.GREATER_EQUALS, version);
        return this;
    }

    public MovieDojo versionLessEqual(Integer version){
        addSql("version",ConditionExpressionEnum.LESS_EQUALS, version);
        return this;
    }

    public MovieDojo versionBetween(String start, String end){
        addSql("version",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo versionIsNull(){
        addSql("version",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo versionIsNotNull(){
        addSql("version",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDojo imageOrderAsc(){
        addSql("image", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo imageOrderDesc(){
        addSql("image",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo imageEqual(String image){
        addSql("image",ConditionExpressionEnum.EQUALS,image);
        return this;
    }

    public MovieDojo imageNotEqual(String image){
        addSql("image",ConditionExpressionEnum.NOT_EQUALS,image);
        return this;
    }

    public MovieDojo imageContain(String image){
        addSql("image",ConditionExpressionEnum.CONTAIN, image);
        return this;
    }

    public MovieDojo imageStart(String image){
        addSql("image",ConditionExpressionEnum.START, image);
        return this;
    }

    public MovieDojo imageEnd(String image){
        addSql("image",ConditionExpressionEnum.END, image);
        return this;
    }

    public MovieDojo imageGreat(String image){
        addSql("image", ConditionExpressionEnum.GREATER, image);
        return this;
    }

    public MovieDojo imageLess(String image){
        addSql("image",ConditionExpressionEnum.LESS, image);
        return this;
    }

    public MovieDojo imageGreatEqual(String image){
        addSql("image",ConditionExpressionEnum.GREATER_EQUALS, image);
        return this;
    }

    public MovieDojo imageLessEqual(String image){
        addSql("image",ConditionExpressionEnum.LESS_EQUALS, image);
        return this;
    }

    public MovieDojo imageBetween(String start, String end){
        addSql("image",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo imageIsNull(){
        addSql("image",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo imageIsNotNull(){
        addSql("image",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDojo nameOrderAsc(){
        addSql("name", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDojo nameOrderDesc(){
        addSql("name",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDojo nameEqual(String name){
        addSql("name",ConditionExpressionEnum.EQUALS,name);
        return this;
    }

    public MovieDojo nameNotEqual(String name){
        addSql("name",ConditionExpressionEnum.NOT_EQUALS,name);
        return this;
    }

    public MovieDojo nameContain(String name){
        addSql("name",ConditionExpressionEnum.CONTAIN, name);
        return this;
    }

    public MovieDojo nameStart(String name){
        addSql("name",ConditionExpressionEnum.START, name);
        return this;
    }

    public MovieDojo nameEnd(String name){
        addSql("name",ConditionExpressionEnum.END, name);
        return this;
    }

    public MovieDojo nameGreat(String name){
        addSql("name", ConditionExpressionEnum.GREATER, name);
        return this;
    }

    public MovieDojo nameLess(String name){
        addSql("name",ConditionExpressionEnum.LESS, name);
        return this;
    }

    public MovieDojo nameGreatEqual(String name){
        addSql("name",ConditionExpressionEnum.GREATER_EQUALS, name);
        return this;
    }

    public MovieDojo nameLessEqual(String name){
        addSql("name",ConditionExpressionEnum.LESS_EQUALS, name);
        return this;
    }

    public MovieDojo nameBetween(String start, String end){
        addSql("name",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDojo nameIsNull(){
        addSql("name",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDojo nameIsNotNull(){
        addSql("name",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    }
