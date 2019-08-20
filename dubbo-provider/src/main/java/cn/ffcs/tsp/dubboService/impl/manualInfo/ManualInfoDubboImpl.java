package cn.ffcs.tsp.dubboService.impl.manualInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.dubboservice.manualInfo.IManualInfoDubboService;
import cn.ffcs.tsp.entity.manualInfo.ManualInfo;
import cn.ffcs.tsp.service.manualInfo.IManualInfoService;

@Service
public class ManualInfoDubboImpl implements IManualInfoDubboService{

	@Resource
	private IManualInfoService manualInfoService ;
	@Override
	public List<ManualInfo> findAll() {
		List<ManualInfo> list = manualInfoService.findAll() ;
		if(list == null || list.size() == 0){
			return new ArrayList<ManualInfo>();
		}
		return list;
	}

	@Override
	public ManualInfo findById(String id) {
		ManualInfo manualInfo = manualInfoService.findById(id) ;
		return manualInfo;
	}

	@Override
	public int save(ManualInfo manualInfo) {
		int i = 1 ;
		try {
			manualInfoService.save(manualInfo) ;
		} catch (Exception e) {
			i = 0 ;
			e.printStackTrace();
		}
		return i ;
	}

	@Override
	public int update(ManualInfo manualInfo) {
		int i = 1 ;
		try {
			manualInfoService.update(manualInfo);
		} catch (Exception e) {
			i = 0 ;
			e.printStackTrace();
		}
		return i ;
	}

	@Override
	public List<ManualInfo> findByMap(Map<String, Object> map) {
		List<ManualInfo> list = manualInfoService.findByMap(map) ;
		if(list == null || list.size() == 0){
			return new ArrayList<ManualInfo>();
		}
		return list;
	}

	@Override
	public List<ManualInfo> findByPage(Page page, Map<String, Object> map) {
		List<ManualInfo> list = manualInfoService.findByMap(map) ;
		if(list == null || list.size() == 0){
			return new ArrayList<ManualInfo>();
		}
		return list;
	}

	@Override
	public void saveList(List<ManualInfo> list) {
		manualInfoService.saveList(list) ;
	}

	@Override
	public List<ManualInfo> findByIds(String[] ids) {
		List<ManualInfo> list = manualInfoService.findByIds(ids) ;
		if(list == null || list.size() == 0){
			return new ArrayList<ManualInfo>();
		}
		return list;
	}

	@Override
	public void deleteByIds(List<Long> list) {
		manualInfoService.deleteByIds(list);		
	}

	@Override
	public void updateByIds(List<String> list) {
		manualInfoService.updateByIds(list);
	}

}
