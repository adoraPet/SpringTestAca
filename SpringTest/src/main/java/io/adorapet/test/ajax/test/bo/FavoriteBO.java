package io.adorapet.test.ajax.test.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.ajax.test.dao.FavoriteDAO;
import io.adorapet.test.ajax.test.model.Favorite;
@Service
public class FavoriteBO {

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	
	public int addFavorite(
			String name
			, String address
			) {
	
		return favoriteDAO.insertFavorite(
				name
				, address
				);
	}
	
	public List<Favorite> getFavoriteList() {
		return favoriteDAO.selectFavoriteList();
	}
	
	public boolean isDuplicateAddress(String address) {
		
		int count = favoriteDAO.selectCountAddress(address);
		
		if(count == 0) {
			//중복되지 않았다
			return false;
		} else { 
			//중복이 됐다
			return true;
		}
	}

}
