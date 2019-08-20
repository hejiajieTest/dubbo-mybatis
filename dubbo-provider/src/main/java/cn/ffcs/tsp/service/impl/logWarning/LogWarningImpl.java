package cn.ffcs.tsp.service.impl.logWarning;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.page.Page;

import cn.ffcs.tsp.entity.logWarning.LogWarning;
import cn.ffcs.tsp.mapper.logWarning.LogWarningMapper;
import cn.ffcs.tsp.service.logWarning.ILogWarningService;

@Service
public class LogWarningImpl implements ILogWarningService{

	
	@Resource
	private LogWarningMapper mapper ;
	
	@Override
	public List<LogWarning> findAll() {
		return mapper.findAll() ;
	}

	@Override
	public LogWarning findById(String id) {
		return mapper.findById(id) ;
	}

	@Override
	public void save(LogWarning logWarning) {
		mapper.save(logWarning);
	}

	@Override
	public void update(LogWarning logWarning) {
		mapper.update(logWarning);
	}

	@Override
	public List<LogWarning> findByMap(Map<String, Object> map) {
		return mapper.findByMap(map);
	}

	@Override
	public List<LogWarning> findByPage(Page page, Map<String, Object> map) {
		return mapper.findByPage(map);
	}

	@Override
	public void saveList(List<LogWarning> list) {
		mapper.saveList(list);
	}

	@Override
	public List<LogWarning> findByIds(String[] ids) {
		return mapper.findByIds(ids);
	}

	@Override
	public void deleteByIds(List<Long> list) {
		mapper.deleteByIds(list);
	}

	@Override
	public void updateByIds(List<String> list) {
		mapper.updateByIds(list);
	}

}
