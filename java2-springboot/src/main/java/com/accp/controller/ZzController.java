package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Zz;
import com.accp.service.ZzService;

@Controller
public class ZzController {
	
	@Autowired
	ZzService zzService;
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("query")
	@ResponseBody
	public List<Zz> query(){
		return zzService.query();	
	}
	
	@RequestMapping("del")
	@ResponseBody
	public int del(int id) {
		zzService.del(id);
		return 000;
	}
	
	@RequestMapping("toadd")
	public String toadd() {
		return "add";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(@RequestBody Zz zz) {
		String name=zz.getName();
		zzService.add(zz);
		return name;
	}
	
	@RequestMapping("toupd")
	public String toupd(Model model,int id) {
		model.addAttribute("id",id);
		return "update";
	}
	
	
	@RequestMapping("queryById")
	@ResponseBody
	public Zz queryById(int id) {
		return zzService.queryById(id);
		
	}
	
	@RequestMapping("upd")
	@ResponseBody
	public int upd(@RequestBody Zz zz) {
		zzService.upd(zz);
		return 000;
	}
	

}
