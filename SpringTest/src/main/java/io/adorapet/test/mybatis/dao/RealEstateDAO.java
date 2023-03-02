package io.adorapet.test.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.adorapet.test.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {

	public RealEstate selectRealEstate(@Param("id") int id);
	
	public RealEstate insertRealEstate(
			@Param("realtorId") int realtor
			,@Param("address") String address
			,@Param("area") int area
			,@Param("type") String type
			,@Param("price") int price);
}
