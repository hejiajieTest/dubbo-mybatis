package cn.ffcs.tsp.service.impl.manualInfo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.page.Page;

import cn.ffcs.tsp.entity.manualInfo.ManualInfo;
import cn.ffcs.tsp.mapper.manualInfo.ManualInfoMapper;
import cn.ffcs.tsp.service.manualInfo.IManualInfoService;

@Service
public class ManualInfoImpl implements IManualInfoService{

	
	@Resource
	private ManualInfoMapper mapper ;
	
	@Override
	public List<ManualInfo> findAll() {
		return mapper.findAll() ;
	}

	@Override
	public ManualInfo findById(String id) {
		return mapper.findById(id) ;
	}

	@Override
	public void save(ManualInfo manualInfo) {
		mapper.save(manualInfo);
	}

	@Override
	public void update(ManualInfo manualInfo) {
		mapper.update(manualInfo);
	}

	@Override
	public List<ManualInfo> findByMap(Map<String, Object> map) {
		return mapper.findByMap(map);
	}

	@Override
	public List<ManualInfo> findByPage(Page page, Map<String, Object> map) {
		return mapper.findByPage(map);
	}

	@Override
	public void saveList(List<ManualInfo> list) {
		mapper.saveList(list);
	}

	@Override
	public List<ManualInfo> findByIds(String[] ids) {
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
