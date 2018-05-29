package com.chenlonghai.sbmybatis.dao;

import java.util.List;

import com.chenlonghai.sbmybatis.entity.Area;

public interface AreaDao {
  List<Area>queryArea();
  Area queryAreaBy(int areaId);
  int insertArea(Area area);
  int updateArea(Area area);
  int deleteArea(int areaId);
}
