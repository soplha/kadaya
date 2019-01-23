package com.kedaya.seller.controller;

import java.util.List;
import java.util.Map;

import com.kedaya.entity.app.user.EqUserEntity;
import com.kedaya.seller.common.utils.PageUtils;
import com.kedaya.seller.common.utils.Query;
import com.kedaya.seller.common.utils.R;
import com.kedaya.seller.service.EqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author qiyurong
 * @email qiyurongde@gmail.com
 * @date 2019-01-23 14:52:54
 */
@RestController
@RequestMapping("equser")
public class EqUserController extends BaseController{

	@Autowired
	private EqUserService eqUserService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){

		Integer userId = getUserId(params.get("sessionId").toString());

		if (userId == null) {
			return R.error(500,"请登入");
		}

		//查询列表数据
        Query query = new Query(params);

		List<EqUserEntity> eqUserList = eqUserService.queryList(query);
		int total = eqUserService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(eqUserList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Integer id){
		EqUserEntity eqUser = eqUserService.queryObject(id);
		
		return R.ok().put("eqUser", eqUser);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody EqUserEntity eqUser){
		eqUserService.save(eqUser);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody EqUserEntity eqUser){
		eqUserService.update(eqUser);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Integer[] ids){
		eqUserService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
