package io.adorapet.test.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.adorapet.test.jstl.model.JSTLFn;

@Controller
@RequestMapping("/jstlFn")
public class JSTLFnController {
	
	@GetMapping("/test01")
	public String test01(Model model) {
		List<JSTLFn> memberList = new ArrayList<>();

		JSTLFn member = new JSTLFn();
		member.setNo("1");
		member.setName("유비");
		member.setPhoneNumber("010-1234-5678");
		member.setEmail("youbee@gmail.com");
		member.setNationality("삼국시대 촉한");
		member.setIntroduce("저는 촉의 군주 유비입니다. 삼국통일을 위해 열심히 일하겠습니다.");
		memberList.add(member);

		member = new JSTLFn();
		member.setNo("2");
		member.setName("관우");
		member.setPhoneNumber("010-1234-5678");
		member.setEmail("woo@naver.com");
		member.setNationality("삼국시대 촉한");
		member.setIntroduce("관우에요. 저는 유비형님 보다 나이는 많지만 일단 아우입니다.");
		memberList.add(member);

		member = new JSTLFn();
		member.setNo("3");
		member.setName("장비");
		member.setPhoneNumber("02-111-3333");
		member.setNationality("삼국시대 촉한");
		member.setEmail("tools@gmail.com");
		member.setIntroduce("장비라우");
		memberList.add(member);

		member = new JSTLFn();
		member.setNo("4");
		member.setName("조조");
		member.setPhoneNumber("010-0987-4321");
		member.setNationality("삼국시대 위");
		member.setEmail("jojo@gmail.com");
		member.setIntroduce("이름은 조조 자는 맹덕이라 하오");
		memberList.add(member);

		member = new JSTLFn();
		member.setNo("5");
		member.setName("주유");
		member.setPhoneNumber("010-0000-1111");
		member.setNationality("삼국시대 오");
		member.setEmail("jooyou@kakao.com");
		member.setIntroduce("주유는 주유소에서 ㅋㅋ");
		memberList.add(member);

		member = new JSTLFn();
		member.setNo("6");
		member.setName("황충");
		member.setPhoneNumber("031-432-0000");
		member.setNationality("삼국시대 촉한");
		member.setEmail("yellowbug@naver.com");
		member.setIntroduce("내 수염 좀 멋있는 듯");
		memberList.add(member);
		
		model.addAttribute("memberList",memberList);
		
		return "jstl/jstlFnTest";
	}

}
