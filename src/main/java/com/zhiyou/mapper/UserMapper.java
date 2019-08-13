package com.zhiyou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zhiyou.model.User;

public interface UserMapper {
	@Insert("insert into user values(#{id},#{age},#{name},#{sex})")
	void save(User user);
	
	@Select("select * from user")
	List<User> selectAll();
	
	void delete(Integer id);
}
