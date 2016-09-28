package xiaopangzi.wechart.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xiaopangzi.wechart.shop.mapper.UserMapper;
import xiaopangzi.wechart.shop.modal.User;
import xiaopangzi.wechart.shop.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		System.out.println(userMapper);
		return userMapper.selectByPrimaryKey(1);
	}

}
