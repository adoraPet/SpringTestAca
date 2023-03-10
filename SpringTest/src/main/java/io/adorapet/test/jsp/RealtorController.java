package io.adorapet.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.adorapet.test.jsp.bo.RealtorBO;
import io.adorapet.test.jsp.model.Realtor;

@Controller
@RequestMapping("/jsp/test02")
public class RealtorController {
	
	
	@Autowired
	private RealtorBO realtorBO;
	
	@PostMapping("/add_realtor")
	public String addRealtor(
//			@RequestParam("office") String office
//		, @RequestParam("phoneNumber") String phoneNumber
//		, @RequestParam("address") String address
//		, @RequestParam("grade") String grade  @ModelAttribute를 이용한것과 동일
		@ModelAttribute Realtor realtor //객체를 통해 한번에 입력가능 코드 간결화
		, Model model) {
		
//		realtor = new Realtor();
//		realtor.setOffice(office);
//		realtor.setPhoneNumber(phoneNumber);
//		realtor.setAddress(address);
//		realtor.setGrade(grade);
		
		int count = realtorBO.addRealtorByObject(realtor);
		model.addAttribute("realtor", realtor);
		
		return "/realtorPage";
	}
	
	@GetMapping("/1")
	public String realtorInput() {
		return "/realtorinput";
	}
	

}
