package cn.ffcs.tsp.controller.logWarning;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.ffcs.tsp.common.Page;
import cn.ffcs.tsp.dubboservice.logWarning.ILogWarningDubboService;
import cn.ffcs.tsp.entity.logWarning.LogWarning;
import cn.ffcs.tsp.util.bean.BeanConsumer;

@RequestMapping("/logWarning")
@Controller
public class LogWarningController {

	@Reference
	private ILogWarningDubboService logWarningService ;
	
	public ILogWarningDubboService getBean(){
		
		return BeanConsumer.getLogWarningBean() ;
	}
	/**
	 * 保存操作
	 * @param manualInfo
	 */
	@RequestMapping("/save.do")
	public void save(){
		System.out.println("1111");
//		logWarningService.save(logWarning);
	}
	
	/**
	 * 更新操作
	 * @param manualInfo
	 */
	public void update(LogWarning logWarning){
		logWarningService.update(logWarning);
	}
	
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<LogWarning> findAll(){
		return logWarningService.findAll();
	}
	
	
	/**
	 * 
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public LogWarning findById(String id){
		return logWarningService.findById(id);
	}
	
	/**
	 * 
	 * 根据ids查询
	 */
	
	 public List<LogWarning> findByIds(String[] ids){
		 return logWarningService.findByIds(ids);
	 }
	 
	/**
	 * 
	 * 根据条件查询
	 * @param map
	 * @return
	 */
	public List<LogWarning> findByMap(Map<String,Object> map){
		return logWarningService.findByMap(map);
	}
	 
	/**
	 * 
	 * 分页查询
	 * @param page
	 * @param map
	 * @return
	 */
	public List<LogWarning> findByPage(Page page,Map<String,Object> map){
		map.put("startRowNum", page.getStartRowNum());
		map.put("pageSize", page.getPageSize());
		return logWarningService.findByPage(page,map);
	}
	
	/**
	 * 
	 * 批量保存
	 * @param list
	 */
	public void saveList(List<LogWarning> list){
		logWarningService.saveList(list);
	}
	
	public void deleteByIds(List<Long> list){
		logWarningService.deleteByIds(list);
	}
	
	/**
	 * 根据ids更新
	 */
	public void updateByIds(List<String> list){
		logWarningService.updateByIds(list);
	}
}
