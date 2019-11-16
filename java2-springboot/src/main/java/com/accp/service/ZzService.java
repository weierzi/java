package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Zz;
import com.accp.mapper.ZzMapper;

@Service
public class ZzService {

	@Autowired
	private ZzMapper zzmapper;
	
	
	public List<Zz> query(){
		return zzmapper.selectByExample(null);
	}
	
	
	public int del(int id) {
		return zzmapper.deleteByPrimaryKey(id);
	}
	
	public int add(Zz zz) {
		return zzmapper.insert(zz);
	}
	
	public Zz queryById(int id) {
		return zzmapper.selectByPrimaryKey(id);
	}
	
	public int upd(Zz zz) {
		return zzmapper.updateByPrimaryKey(zz);
	}
}
