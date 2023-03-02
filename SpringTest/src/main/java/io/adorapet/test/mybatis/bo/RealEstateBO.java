package io.adorapet.test.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.mybatis.dao.RealEstateDAO;
import io.adorapet.test.mybatis.model.RealEstate;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateDAO realEstateDAO;
	
	// 전달 받은 id와 일치하는 데이터 조회 리턴
	public RealEstate getRealEstate(int id) {
		
		RealEstate realEstate = realEstateDAO.selectRealEstate(id);
		
		return realEstate;
		
	}
	
	// 전달받은 정보들로 행을 추가하는
	
	public RealEstate addRealEstate(int realtor, String address, int area, String type, int price) {
		
		RealEstate realEstate = realEstateDAO.insertRealEstate(realtor, address, area, type, price);
		
		return realEstate;
	}

}
