package cn.ffcs.tsp.dubboservice.logWarning;

import java.util.List;
import java.util.Map;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.entity.logWarning.LogWarning;

public interface ILogWarningDubboService {

	List<LogWarning> findAll() ;
	
	LogWarning findById(String id) ;
	
	int save(LogWarning logWarning);

	int update(LogWarning logWarning);

	List<LogWarning> findByMap(Map<String, Object> map);

	List<LogWarning> findByPage(Page page, Map<String, Object> map);

	void saveList(List<LogWarning> list);

	List<LogWarning> findByIds(String[] ids);

	void deleteByIds(List<Long> list);

	void updateByIds(List<String> list);

}
