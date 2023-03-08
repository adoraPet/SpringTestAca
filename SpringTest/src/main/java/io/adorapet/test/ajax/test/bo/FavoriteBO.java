package io.adorapet.test.ajax.test.bo;

import org.springframework.beans.factory.annotation.Autowired;

import io.adorapet.test.ajax.test.dao.FavoriteDAO;
import io.adorapet.test.jsp.dao.SellerDAO;
import io.adorapet.test.jsp.model.Seller;

public class FavoriteBO {

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public int insertFavorite(
			String name
			, String address
			) {
	
		return favoriteDAO.insertFavorite(
				name
				, address
				);
	}
	
	public Seller getFavorite() {
		return favoriteDAO.selectFavorite();
	}
	

}
