package io.adorapet.test.ajax;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	
	public List<User> selectUserList();

}
