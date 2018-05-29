package com.chenlonghai.sbmybatis.service;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.chenlonghai.sbmybatis.config.dao.DataSourceConfiguration;
import com.chenlonghai.sbmybatis.config.dao.SessionFactoryConfiguration;
import com.chenlonghai.sbmybatis.dao.AreaDao;
import com.chenlonghai.sbmybatis.entity.Area;

public interface AreaService {

	  List<Area>queryArea();
	  Area queryAreaBy(int areaId);
	  boolean insertArea(Area area);
	  boolean updateArea(Area area);
	  boolean deleteArea(int areaId);
	
}
