package cn.ffcs.tsp.dubboservice.manualInfo;

import java.util.List;
import java.util.Map;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.entity.manualInfo.ManualInfo;

public interface IManualInfoDubboService {

	List<ManualInfo> findAll() ;
	
	ManualInfo findById(String id) ;
	
	int save(ManualInfo manualInfo);

	int update(ManualInfo manualInfo);

	List<ManualInfo> findByMap(Map<String, Object> map);

	List<ManualInfo> findByPage(Page page, Map<String, Object> map);

	void saveList(List<ManualInfo> list);

	List<ManualInfo> findByIds(String[] ids);

	void deleteByIds(List<Long> list);

	void updateByIds(List<String> list);

}
