package com.chenlonghai.sbmybatis.service.impl;

import static org.mockito.Mockito.never;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chenlonghai.sbmybatis.dao.AreaDao;
import com.chenlonghai.sbmybatis.entity.Area;
import com.chenlonghai.sbmybatis.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> queryArea() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}

	@Override
	public Area queryAreaBy(int areaId) {
		// TODO Auto-generated method stub
		return areaDao.queryAreaBy(areaId);
	}

	@Transactional
	@Override
	public boolean insertArea(Area area) {
		// TODO Auto-generated method stub
		
		if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());
			try {
				int effectedNum = areaDao.insertArea(area);
				if (effectedNum > 0) {
					return true;	
				}else {
					return false;
				}
			} catch (Exception e) {
				return false;
				// TODO: handle exception
			}
		}
		
		return false;
	}

	@Override
	public boolean updateArea(Area area) {
		
		if (area.getAreaId() != null && area.getAreaId() > 0) {
			area.setLastEditTime(new Date());
			try {
				
				int effectedNum = areaDao.updateArea(area);
				if (effectedNum > 0) {
					return true;	
				}else {
					return false;
				}
			} catch (Exception e) {
				return false;
				// TODO: handle exception
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteArea(int areaId) {
		
		if (areaId > 0) {

			try {
				
				int effectedNum = areaDao.deleteArea(areaId);
				if (effectedNum > 0) {
					return true;	
				}else {
					return false;
				}
			} catch (Exception e) {
				return false;
				// TODO: handle exception
			}
		}
		
		return false;
	}

}
