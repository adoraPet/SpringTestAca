package io.adorapet.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public List<User> getUserList(){
		
		return userDAO.selectUserList();
		
	}

}
