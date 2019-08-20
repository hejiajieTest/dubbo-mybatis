package cn.ffcs.tsp.service.logWarning;

import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.container.page.Page;

import cn.ffcs.tsp.entity.logWarning.LogWarning;
import cn.ffcs.tsp.entity.manualInfo.ManualInfo;

public interface ILogWarningService {

	List<LogWarning> findAll() ;
	
	LogWarning findById(String id) ;
	
	void save(LogWarning LogWarning);

	void update(LogWarning LogWarning);

	List<LogWarning> findByMap(Map<String, Object> map);

	List<LogWarning> findByPage(Page page, Map<String, Object> map);

	void saveList(List<LogWarning> list);

	List<LogWarning> findByIds(String[] ids);

	void deleteByIds(List<Long> list);

	void updateByIds(List<String> list);
}
