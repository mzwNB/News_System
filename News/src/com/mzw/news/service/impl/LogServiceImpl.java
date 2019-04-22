package com.mzw.news.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.mzw.news.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzw.news.entity.Log;
import com.mzw.news.service.LogService;
@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogDao logDao;

	@Override
	public int add(Log log) {
		System.out.println(log.getContent());
		// TODO Auto-generated method stub
		return logDao.add(log);
	}

	@Override
	public List<Log> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return logDao.findList(queryMap);
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return logDao.getTotal(queryMap);
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return logDao.delete(ids);
	}

	@Override
	public int add(String content) {
		// TODO Auto-generated method stub
		System.out.println(content);
		Log log = new Log();
		log.setContent(content);
		log.setCreateTime(new Date());
		return logDao.add(log);
	}
	
	

}
