package com.mzw.news.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mzw.news.entity.User;


@Repository
public interface UserDao {
	public User findByUsername(String username);
	public int add(User user);
	public int edit(User user);
	public int editPassword(User user);
	public int delete(String ids);
	public List<User> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
}