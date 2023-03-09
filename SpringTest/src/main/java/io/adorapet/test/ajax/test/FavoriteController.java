package io.adorapet.test.ajax.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.adorapet.test.ajax.test.bo.FavoriteBO;
import io.adorapet.test.ajax.test.model.Favorite;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {
	
	@Autowired
	private FavoriteBO favoriteBO;
	
	@GetMapping("/list")
	public String FavoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteBO.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favorite/page";
	}
	

	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> favoriteInput( //이거는 이제 api
			@RequestParam("name") String name
			, @RequestParam("address") String address
			){
		
		int count = favoriteBO.addFavorite(name, address);
		
		//성공여부 전달 - json
		//성공 : {"result":"success"}
		//실패 : {"result":"fail"}
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
		
	}
	
	@GetMapping("/input")
	public String inputFavorite() {
		
		return "ajax/favorite/input";
	}
	
	//주소를 전달 받고, 중복 여부를 확인한다
	//중복 여부 결과를 response로 전달한다.
	@GetMapping("/is_duplicate")
	@ResponseBody
	public Map<String, Boolean> isDuplicateAddrss(@RequestParam("address") String address) {
		Map<String, Boolean> resultMap = new HashMap<>();
		if(favoriteBO.isDuplicateAddress(address)) {
			//중복된 경우
			resultMap.put("is_duplicate", true);
		} else {
			//중복되지 않은 경우
			resultMap.put("is_duplicate", false);
		}
		
		return resultMap;
		
		
		
	}
}
