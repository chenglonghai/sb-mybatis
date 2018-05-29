package com.chenlonghai.sbmybatis.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chenlonghai.sbmybatis.entity.Area;
import com.chenlonghai.sbmybatis.entity.Person;
import com.chenlonghai.sbmybatis.service.AreaService;

@RestController
public class HelloController {
	@Autowired
	private AreaService areaService;
	@Autowired
	private Person person;
	
	@Value("${testValue}")
	private String testValue;
	
	@RequestMapping(value= {"/hello","/hi"},method = RequestMethod.GET)
	public String hello() {
		List<Area>list = areaService.queryArea();
		System.out.println(list.size());
		return "hello==" +"age"+ person.getAge() +"name:"+person.getName() +"===="+testValue;
	}
	/** Controller的使用
	 * @PathVariable 获取url的数据
	 * @RequestParam 获取请求参数的值
	 *@GetMapping 组合注解
	 *
	 * */

	@RequestMapping(value= {"/{name}/say/{id}"},method = RequestMethod.GET)
	public String test(@PathVariable("id") Integer id,@PathVariable("name") String name) {

		return "PathVariable获取id-->"+id + "获取的name-->"+name;
	}
	
//	@RequestMapping(value= {"/say"},method = RequestMethod.GET)
//	@PostMapping
	@GetMapping(value="/say")
	public String test1(@RequestParam(value="id",required=false, defaultValue= "0") Integer id) {
//		(@RequestParam("id")
		return "RequestParam获取id-->"+id ;
	}
	
}
