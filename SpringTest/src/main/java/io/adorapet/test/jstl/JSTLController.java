package io.adorapet.test.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLController {
	
	@GetMapping("/test01")
	public String test01(Model model) {
		
		 List<Map<String, Object>> musicList = new ArrayList<>();

		 Map<String, Object> musicMap = new HashMap<>();
	     musicMap.put("rank", 1);
	     musicMap.put("music", "강남스타일");
	     musicList.add(musicMap);
	     
	     musicMap = new HashMap<>();
	     musicMap.put("rank", 2);
	     musicMap.put("music", "거짓말");
	     musicList.add(musicMap);
	     
	     musicMap = new HashMap<>();
	     musicMap.put("rank", 3);
	     musicMap.put("music", "좋은날");
	     musicList.add(musicMap);
	     
	     musicMap = new HashMap<>();
	     musicMap.put("rank", 4);
	     musicMap.put("music", "벚꽃엔딩");
	     musicList.add(musicMap);
	     
	     musicMap = new HashMap<>();
	     musicMap.put("rank", 5);
	     musicMap.put("music", "hypeBoy");
	     musicList.add(musicMap);
	     
	     model.addAttribute("musicList", musicList);
	     

		return "jstl/test02";
		
	}

}
