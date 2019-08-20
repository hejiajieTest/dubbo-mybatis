package cn.ffcs.tsp.controller.manualInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.dubboservice.manualInfo.IManualInfoDubboService;
import cn.ffcs.tsp.entity.manualInfo.ManualInfo;
import cn.ffcs.tsp.util.bean.BeanConsumer;

@RequestMapping("/manualInfo")
//@Path
@Controller
public class ManualInfoController {

	@Reference
	private IManualInfoDubboService manualService ;
	
	/**
	 *如果是注解方式，此方法用不到
	 * @return
	 */
	public IManualInfoDubboService getBean(){
		
		return BeanConsumer.getManualInfoDubboBean() ;
	}
	@RequestMapping(value="/test.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> test(){
		System.out.println("========你好,mvc启动成功");
		Map<String,Object> map = new HashMap<String,Object>() ;
		map.put("result", "success") ;
		return map ;
	}
	/**
	 * 保存操作
	 * @param manualInfo
	 */
	@RequestMapping(value="/save.do", method = RequestMethod.POST)
	public void save(ManualInfo manualInfo){
		manualService.save(manualInfo);
	}
	
	/**
	 * 更新操作
	 * @param manualInfo
	 */
	@RequestMapping(value="/update.do", method = RequestMethod.POST)
	public void update(ManualInfo manualInfo){
		manualService.update(manualInfo);
	}
	
	
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping(value="/findAll.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ManualInfo> findAll(){
			return manualService.findAll();
	}
	
	
	/**
	 * 
	 * 根据id查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/findById.do", method = RequestMethod.POST)
	public ManualInfo findById(String id){
		return manualService.findById(id);
	}
	
	/**
	 * 
	 * 根据ids查询
	 */
	 @RequestMapping(value="/findByIds.do", method = RequestMethod.POST)
	 public List<ManualInfo> findByIds(String[] ids){
		 return manualService.findByIds(ids);
	 }
	 
	/**
	 * 
	 * 根据条件查询
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/findByMap.do", method = RequestMethod.POST)
	public List<ManualInfo> findByMap(Map<String,Object> map){
		return manualService.findByMap(map);
	}
	 
	/**
	 * 
	 * 分页查询
	 * @param page
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/findByPage.do", method = RequestMethod.POST)
	public List<ManualInfo> findByPage(Page page,Map<String,Object> map){
		map.put("startRowNum", page.getStartRowNum());
		map.put("pageSize", page.getPageSize());
		return manualService.findByPage(page,map);
	}
	
	/**
	 * 
	 * 批量保存
	 * @param list
	 */
	@RequestMapping(value="/saveList.do", method = RequestMethod.POST)
	public void saveList(List<ManualInfo> list){
		manualService.saveList(list);
	}
	
	@RequestMapping(value="/deleteByIds.do", method = RequestMethod.POST)
	public void deleteByIds(List<Long> list){
		manualService.deleteByIds(list);
	}
	
	/**
	 * 根据ids更新
	 */
	@RequestMapping(value="/updateByIds.do", method = RequestMethod.POST)
	public void updateByIds(List<String> list){
		manualService.updateByIds(list);
	}
}
