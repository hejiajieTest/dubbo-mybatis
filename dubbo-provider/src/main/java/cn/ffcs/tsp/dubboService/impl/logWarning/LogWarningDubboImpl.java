package cn.ffcs.tsp.dubboService.impl.logWarning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.dubbo.config.annotation.Service;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.dubboservice.logWarning.ILogWarningDubboService;
import cn.ffcs.tsp.entity.logWarning.LogWarning;
import cn.ffcs.tsp.service.logWarning.ILogWarningService;

@Service
public class LogWarningDubboImpl implements ILogWarningDubboService{

	@Resource
	private ILogWarningService logWarningService ;
	@Override
	public List<LogWarning> findAll() {
		List<LogWarning> list = logWarningService.findAll() ;
		if(list == null || list.size() == 0){
			return new ArrayList<LogWarning>();
		}
		return list;
	}

	@Override
	public LogWarning findById(String id) {
		LogWarning logWarning = logWarningService.findById(id) ;
		return logWarning;
	}

	@Override
	public int save(LogWarning logWarning) {
		int i = 1 ;
		try {
			logWarningService.save(logWarning) ;
		} catch (Exception e) {
			i = 0 ;
			e.printStackTrace();
		}
		return i ;
	}

	@Override
	public int update(LogWarning logWarning) {
		int i = 1 ;
		try {
			logWarningService.update(logWarning);
		} catch (Exception e) {
			i = 0 ;
			e.printStackTrace();
		}
		return i ;
	}

	@Override
	public List<LogWarning> findByMap(Map<String, Object> map) {
		List<LogWarning> list = logWarningService.findByMap(map) ;
		if(list == null || list.size() == 0){
			return new ArrayList<LogWarning>();
		}
		return list;
	}

	@Override
	public List<LogWarning> findByPage(Page page, Map<String, Object> map) {
		List<LogWarning> list = logWarningService.findByMap(map) ;
		if(list == null || list.size() == 0){
			return new ArrayList<LogWarning>();
		}
		return list;
	}

	@Override
	public void saveList(List<LogWarning> list) {
		logWarningService.saveList(list) ;
	}

	@Override
	public List<LogWarning> findByIds(String[] ids) {
		List<LogWarning> list = logWarningService.findByIds(ids) ;
		if(list == null || list.size() == 0){
			return new ArrayList<LogWarning>();
		}
		return list;
	}

	@Override
	public void deleteByIds(List<Long> list) {
		logWarningService.deleteByIds(list);		
	}

	@Override
	public void updateByIds(List<String> list) {
		logWarningService.updateByIds(list);
	}

}
