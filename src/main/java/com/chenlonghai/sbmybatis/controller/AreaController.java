package com.chenlonghai.sbmybatis.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenlonghai.sbmybatis.entity.Area;
import com.chenlonghai.sbmybatis.service.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public Map<String, Object> listArea(){
		Map<String, Object>modelMap = new HashMap<>();
		List<Area>list = areaService.queryArea();
		modelMap.put("areaList", list);
		return modelMap;
	}
	
	@RequestMapping(value="/getareabyid",method = RequestMethod.GET)
	public Map<String, Object> getAreaById(Integer areaId){
		Map<String, Object>modelMap = new HashMap<>();
		Area area = areaService.queryAreaBy(areaId);
		modelMap.put("area", area);
		return modelMap;
	}

	
	@RequestMapping(value="/addarea",method = RequestMethod.POST)
	public Map<String, Object> addArea(@RequestBody Area area){
		Map<String, Object>modelMap = new HashMap<>();
		modelMap.put("success", areaService.insertArea(area));
		return modelMap;
	}
	
	@RequestMapping(value="/updateArea",method = RequestMethod.POST)
	public Map<String, Object> updateArea(@RequestBody Area area){
		Map<String, Object>modelMap = new HashMap<>();
		modelMap.put("success", areaService.updateArea(area));
		return modelMap;
	}
	
	@RequestMapping(value="/deleteArea",method = RequestMethod.GET)
	public Map<String, Object> updateArea(Integer areaId){
		Map<String, Object>modelMap = new HashMap<>();
		modelMap.put("success", areaService.deleteArea(areaId));
		return modelMap;
	}
}
