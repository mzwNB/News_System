package com.mzw.news.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mzw.news.entity.Authority;


@Service
public interface AuthorityService {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
