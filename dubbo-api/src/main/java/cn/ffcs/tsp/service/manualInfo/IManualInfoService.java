package cn.ffcs.tsp.service.manualInfo;

import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.container.page.Page;

import cn.ffcs.tsp.entity.manualInfo.ManualInfo;

public interface IManualInfoService {

	List<ManualInfo> findAll() ;
	
	ManualInfo findById(String id) ;
	
	void save(ManualInfo manualInfo);

	void update(ManualInfo manualInfo);

	List<ManualInfo> findByMap(Map<String, Object> map);

	List<ManualInfo> findByPage(Page page, Map<String, Object> map);

	void saveList(List<ManualInfo> list);

	List<ManualInfo> findByIds(String[] ids);

	void deleteByIds(List<Long> list);

	void updateByIds(List<String> list);
}
