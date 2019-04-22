package com.mzw.news.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mzw.news.entity.Authority;


@Repository
public interface AuthorityDao {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
