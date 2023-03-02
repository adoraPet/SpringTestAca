package io.adorapet.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.adorapet.test.jsp.bo.SellerBO;
import io.adorapet.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/test01")
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	@PostMapping("/add_seller")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
		, @RequestParam("profileImage") String profileImage
		, @RequestParam("temperature") double temperature) {
		
	int count = sellerBO.addSeller(nickname, profileImage, temperature);
	
	return "삽입결과 : " + count;
	}
	
	@GetMapping("/1")
	public String sellerInput() {
		return "/sellerInput";
	}
	
	@GetMapping("/lastSeller")
	public String lastSeller(Model model) {
		
		// 최근 등록된 사용자 조회
		Seller lastSeller = sellerBO.getLastSeller();
		
		// 조회된 결과를 jsp 에서 쓸수 있도록 셋팅
		model.addAttribute("seller", lastSeller);
		
		return "/lastSeller";
	}
	
	@GetMapping("/info")
	public String selectedSeller(
			Model model
			,@RequestParam(value="id", required=false) Integer id) {
		//id 파라미터가 입력될 경우와 입력되지 않을 경우 if문을 통해 작성
		//id 값이 있을떄
		if(id != null) {
			
			Seller seller = sellerBO.getSeller(id);
		
			model.addAttribute("seller", seller); //중복된 코드는 if문 바깥으로 빼서 한번에 관리 가능
		} else {//id 없을때
			
			Seller selectedSeller = sellerBO.getLastSeller();
		
			model.addAttribute("seller", selectedSeller);
		}
		
		return "/lastSeller";
	}
}
