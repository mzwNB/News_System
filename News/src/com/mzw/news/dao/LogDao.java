package com.mzw.news.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mzw.news.entity.Log;


@Repository
public interface LogDao {
	public int add(Log log);
	public List<Log> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public int delete(String ids);
}
