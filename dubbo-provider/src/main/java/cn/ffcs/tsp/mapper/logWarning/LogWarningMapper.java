package cn.ffcs.tsp.mapper.logWarning;

import java.util.List;
import java.util.Map;

import cn.ffcs.tsp.entity.logWarning.LogWarning;


//@Repository//(继承了这个MapperScannerConfigurer，不需要重新声明bean)
public interface LogWarningMapper {

	public List<LogWarning> findAll();
	
	public LogWarning findById(String id);
	
	public void save(LogWarning logWarning);
	
	public void update(LogWarning logWarning);

	public List<LogWarning> findByMap(Map<String,Object> map);

	public List<LogWarning> findByPage(Map<String, Object> map);

	public void saveList(List<LogWarning> list);

	public List<LogWarning> findByIds(String[] ids);

	public void deleteByIds(List<Long> list);

	public void updateByIds(List<String> list);
}
