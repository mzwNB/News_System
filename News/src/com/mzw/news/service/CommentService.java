package com.mzw.news.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mzw.news.entity.Comment;


@Service
public interface CommentService {
	public int add(Comment comment);
	public int edit(Comment comment);
	public int delete(String ids);
	public List<Comment> findList(Map<String,Object> queryMap);
	public List<Comment> findAll();
	public int getTotal(Map<String,Object> queryMap);
}
