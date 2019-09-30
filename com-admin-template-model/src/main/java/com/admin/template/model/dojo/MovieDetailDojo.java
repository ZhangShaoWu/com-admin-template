package com.admin.template.model.dojo;

import com.admin.template.model.entity.MovieDetailEntity;
import com.admin.template.model.dao.MovieDetailDao;
import com.admin.framework.orm.constant.ConditionExpressionEnum;
import com.admin.framework.orm.dojo.BaseDojo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author zsw
 * @date 2019-09-30 10:41:59
 */
@Component
public class MovieDetailDojo extends BaseDojo<MovieDetailEntity>{


    public MovieDetailDojo(){
        super(MovieDetailDao.class,MovieDetailEntity.class,"m");
    }

    
    public MovieDetailDojo idOrderAsc(){
        addSql("id", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo idOrderDesc(){
        addSql("id",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo idEqual(Integer id){
        addSql("id",ConditionExpressionEnum.EQUALS,id);
        return this;
    }

    public MovieDetailDojo idNotEqual(Integer id){
        addSql("id",ConditionExpressionEnum.NOT_EQUALS,id);
        return this;
    }

    public MovieDetailDojo idContain(Integer id){
        addSql("id",ConditionExpressionEnum.CONTAIN, id);
        return this;
    }

    public MovieDetailDojo idStart(String id){
        addSql("id",ConditionExpressionEnum.START, id);
        return this;
    }

    public MovieDetailDojo idEnd(Integer id){
        addSql("id",ConditionExpressionEnum.END, id);
        return this;
    }

    public MovieDetailDojo idGreat(Integer id){
        addSql("id", ConditionExpressionEnum.GREATER, id);
        return this;
    }

    public MovieDetailDojo idLess(Integer id){
        addSql("id",ConditionExpressionEnum.LESS, id);
        return this;
    }

    public MovieDetailDojo idGreatEqual(Integer id){
        addSql("id",ConditionExpressionEnum.GREATER_EQUALS, id);
        return this;
    }

    public MovieDetailDojo idLessEqual(Integer id){
        addSql("id",ConditionExpressionEnum.LESS_EQUALS, id);
        return this;
    }

    public MovieDetailDojo idBetween(String start, String end){
        addSql("id",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo idIsNull(){
        addSql("id",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo idIsNotNull(){
        addSql("id",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo createTimeOrderAsc(){
        addSql("createTime", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo createTimeOrderDesc(){
        addSql("createTime",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo createTimeEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.EQUALS,createTime);
        return this;
    }

    public MovieDetailDojo createTimeNotEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.NOT_EQUALS,createTime);
        return this;
    }

    public MovieDetailDojo createTimeContain(Date createTime){
        addSql("createTime",ConditionExpressionEnum.CONTAIN, createTime);
        return this;
    }

    public MovieDetailDojo createTimeStart(String createTime){
        addSql("createTime",ConditionExpressionEnum.START, createTime);
        return this;
    }

    public MovieDetailDojo createTimeEnd(Date createTime){
        addSql("createTime",ConditionExpressionEnum.END, createTime);
        return this;
    }

    public MovieDetailDojo createTimeGreat(Date createTime){
        addSql("createTime", ConditionExpressionEnum.GREATER, createTime);
        return this;
    }

    public MovieDetailDojo createTimeLess(Date createTime){
        addSql("createTime",ConditionExpressionEnum.LESS, createTime);
        return this;
    }

    public MovieDetailDojo createTimeGreatEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.GREATER_EQUALS, createTime);
        return this;
    }

    public MovieDetailDojo createTimeLessEqual(Date createTime){
        addSql("createTime",ConditionExpressionEnum.LESS_EQUALS, createTime);
        return this;
    }

    public MovieDetailDojo createTimeBetween(String start, String end){
        addSql("createTime",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo createTimeIsNull(){
        addSql("createTime",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo createTimeIsNotNull(){
        addSql("createTime",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo modifyTimeOrderAsc(){
        addSql("modifyTime", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo modifyTimeOrderDesc(){
        addSql("modifyTime",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo modifyTimeEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.EQUALS,modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeNotEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.NOT_EQUALS,modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeContain(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.CONTAIN, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeStart(String modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.START, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeEnd(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.END, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeGreat(Date modifyTime){
        addSql("modifyTime", ConditionExpressionEnum.GREATER, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeLess(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.LESS, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeGreatEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.GREATER_EQUALS, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeLessEqual(Date modifyTime){
        addSql("modifyTime",ConditionExpressionEnum.LESS_EQUALS, modifyTime);
        return this;
    }

    public MovieDetailDojo modifyTimeBetween(String start, String end){
        addSql("modifyTime",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo modifyTimeIsNull(){
        addSql("modifyTime",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo modifyTimeIsNotNull(){
        addSql("modifyTime",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo versionOrderAsc(){
        addSql("version", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo versionOrderDesc(){
        addSql("version",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo versionEqual(Integer version){
        addSql("version",ConditionExpressionEnum.EQUALS,version);
        return this;
    }

    public MovieDetailDojo versionNotEqual(Integer version){
        addSql("version",ConditionExpressionEnum.NOT_EQUALS,version);
        return this;
    }

    public MovieDetailDojo versionContain(Integer version){
        addSql("version",ConditionExpressionEnum.CONTAIN, version);
        return this;
    }

    public MovieDetailDojo versionStart(String version){
        addSql("version",ConditionExpressionEnum.START, version);
        return this;
    }

    public MovieDetailDojo versionEnd(Integer version){
        addSql("version",ConditionExpressionEnum.END, version);
        return this;
    }

    public MovieDetailDojo versionGreat(Integer version){
        addSql("version", ConditionExpressionEnum.GREATER, version);
        return this;
    }

    public MovieDetailDojo versionLess(Integer version){
        addSql("version",ConditionExpressionEnum.LESS, version);
        return this;
    }

    public MovieDetailDojo versionGreatEqual(Integer version){
        addSql("version",ConditionExpressionEnum.GREATER_EQUALS, version);
        return this;
    }

    public MovieDetailDojo versionLessEqual(Integer version){
        addSql("version",ConditionExpressionEnum.LESS_EQUALS, version);
        return this;
    }

    public MovieDetailDojo versionBetween(String start, String end){
        addSql("version",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo versionIsNull(){
        addSql("version",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo versionIsNotNull(){
        addSql("version",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo movieIdOrderAsc(){
        addSql("movieId", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo movieIdOrderDesc(){
        addSql("movieId",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo movieIdEqual(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.EQUALS,movieId);
        return this;
    }

    public MovieDetailDojo movieIdNotEqual(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.NOT_EQUALS,movieId);
        return this;
    }

    public MovieDetailDojo movieIdContain(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.CONTAIN, movieId);
        return this;
    }

    public MovieDetailDojo movieIdStart(String movieId){
        addSql("movieId",ConditionExpressionEnum.START, movieId);
        return this;
    }

    public MovieDetailDojo movieIdEnd(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.END, movieId);
        return this;
    }

    public MovieDetailDojo movieIdGreat(Integer movieId){
        addSql("movieId", ConditionExpressionEnum.GREATER, movieId);
        return this;
    }

    public MovieDetailDojo movieIdLess(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.LESS, movieId);
        return this;
    }

    public MovieDetailDojo movieIdGreatEqual(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.GREATER_EQUALS, movieId);
        return this;
    }

    public MovieDetailDojo movieIdLessEqual(Integer movieId){
        addSql("movieId",ConditionExpressionEnum.LESS_EQUALS, movieId);
        return this;
    }

    public MovieDetailDojo movieIdBetween(String start, String end){
        addSql("movieId",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo movieIdIsNull(){
        addSql("movieId",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo movieIdIsNotNull(){
        addSql("movieId",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo nameOrderAsc(){
        addSql("name", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo nameOrderDesc(){
        addSql("name",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo nameEqual(String name){
        addSql("name",ConditionExpressionEnum.EQUALS,name);
        return this;
    }

    public MovieDetailDojo nameNotEqual(String name){
        addSql("name",ConditionExpressionEnum.NOT_EQUALS,name);
        return this;
    }

    public MovieDetailDojo nameContain(String name){
        addSql("name",ConditionExpressionEnum.CONTAIN, name);
        return this;
    }

    public MovieDetailDojo nameStart(String name){
        addSql("name",ConditionExpressionEnum.START, name);
        return this;
    }

    public MovieDetailDojo nameEnd(String name){
        addSql("name",ConditionExpressionEnum.END, name);
        return this;
    }

    public MovieDetailDojo nameGreat(String name){
        addSql("name", ConditionExpressionEnum.GREATER, name);
        return this;
    }

    public MovieDetailDojo nameLess(String name){
        addSql("name",ConditionExpressionEnum.LESS, name);
        return this;
    }

    public MovieDetailDojo nameGreatEqual(String name){
        addSql("name",ConditionExpressionEnum.GREATER_EQUALS, name);
        return this;
    }

    public MovieDetailDojo nameLessEqual(String name){
        addSql("name",ConditionExpressionEnum.LESS_EQUALS, name);
        return this;
    }

    public MovieDetailDojo nameBetween(String start, String end){
        addSql("name",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo nameIsNull(){
        addSql("name",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo nameIsNotNull(){
        addSql("name",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo urlOrderAsc(){
        addSql("url", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo urlOrderDesc(){
        addSql("url",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo urlEqual(String url){
        addSql("url",ConditionExpressionEnum.EQUALS,url);
        return this;
    }

    public MovieDetailDojo urlNotEqual(String url){
        addSql("url",ConditionExpressionEnum.NOT_EQUALS,url);
        return this;
    }

    public MovieDetailDojo urlContain(String url){
        addSql("url",ConditionExpressionEnum.CONTAIN, url);
        return this;
    }

    public MovieDetailDojo urlStart(String url){
        addSql("url",ConditionExpressionEnum.START, url);
        return this;
    }

    public MovieDetailDojo urlEnd(String url){
        addSql("url",ConditionExpressionEnum.END, url);
        return this;
    }

    public MovieDetailDojo urlGreat(String url){
        addSql("url", ConditionExpressionEnum.GREATER, url);
        return this;
    }

    public MovieDetailDojo urlLess(String url){
        addSql("url",ConditionExpressionEnum.LESS, url);
        return this;
    }

    public MovieDetailDojo urlGreatEqual(String url){
        addSql("url",ConditionExpressionEnum.GREATER_EQUALS, url);
        return this;
    }

    public MovieDetailDojo urlLessEqual(String url){
        addSql("url",ConditionExpressionEnum.LESS_EQUALS, url);
        return this;
    }

    public MovieDetailDojo urlBetween(String start, String end){
        addSql("url",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo urlIsNull(){
        addSql("url",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo urlIsNotNull(){
        addSql("url",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    
    public MovieDetailDojo typeOrderAsc(){
        addSql("type", ConditionExpressionEnum.ORDER_ASC);
        return this;
    }

    public MovieDetailDojo typeOrderDesc(){
        addSql("type",ConditionExpressionEnum.ORDER_DESC);
        return this;
    }

    public MovieDetailDojo typeEqual(String type){
        addSql("type",ConditionExpressionEnum.EQUALS,type);
        return this;
    }

    public MovieDetailDojo typeNotEqual(String type){
        addSql("type",ConditionExpressionEnum.NOT_EQUALS,type);
        return this;
    }

    public MovieDetailDojo typeContain(String type){
        addSql("type",ConditionExpressionEnum.CONTAIN, type);
        return this;
    }

    public MovieDetailDojo typeStart(String type){
        addSql("type",ConditionExpressionEnum.START, type);
        return this;
    }

    public MovieDetailDojo typeEnd(String type){
        addSql("type",ConditionExpressionEnum.END, type);
        return this;
    }

    public MovieDetailDojo typeGreat(String type){
        addSql("type", ConditionExpressionEnum.GREATER, type);
        return this;
    }

    public MovieDetailDojo typeLess(String type){
        addSql("type",ConditionExpressionEnum.LESS, type);
        return this;
    }

    public MovieDetailDojo typeGreatEqual(String type){
        addSql("type",ConditionExpressionEnum.GREATER_EQUALS, type);
        return this;
    }

    public MovieDetailDojo typeLessEqual(String type){
        addSql("type",ConditionExpressionEnum.LESS_EQUALS, type);
        return this;
    }

    public MovieDetailDojo typeBetween(String start, String end){
        addSql("type",ConditionExpressionEnum.BETWEEN, start, end);
        return this;
    }

    public MovieDetailDojo typeIsNull(){
        addSql("type",ConditionExpressionEnum.NULL);
        return this;
    }

    public MovieDetailDojo typeIsNotNull(){
        addSql("type",ConditionExpressionEnum.NOT_NULL);
        return this;
    }
    }
