package io.adorapet.test.ajax.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.adorapet.test.ajax.test.model.Favorite;

@Repository
public interface FavoriteDAO {
	
	public int insertFavorite(
			@Param("name") String name
			, @Param("address") String address);
	
	public List<Favorite> selectFavoriteList();

	public int selectCountAddress(@Param("address") String address);
	

}
