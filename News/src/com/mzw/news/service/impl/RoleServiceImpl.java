package com.mzw.news.service.impl;

import com.mzw.news.dao.RoleDao;
import com.mzw.news.entity.Role;
import com.mzw.news.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public int add(Role role) {

		return roleDao.add(role);
	}

	@Override
	public int edit(Role role) {

		return roleDao.edit(role);
	}

	@Override
	public int delete(Long id) {

		return roleDao.delete(id);
	}

	@Override
	public List<Role> findList(Map<String, Object> queryMap) {

		return roleDao.findList(queryMap);
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {

		return roleDao.getTotal(queryMap);
	}

	@Override
	public Role find(Long id) {

		return roleDao.find(id);
	}

}
