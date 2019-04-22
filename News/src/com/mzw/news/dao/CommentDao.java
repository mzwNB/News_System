package com.mzw.news.dao;

import java.util.List;
import java.util.Map;

import com.mzw.news.entity.Comment;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentDao {
	public int add(Comment comment);
	public int edit(Comment comment);
	public int delete(String ids);
	public List<Comment> findList(Map<String,Object> queryMap);
	public List<Comment> findAll();
	public int getTotal(Map<String,Object> queryMap);
}
