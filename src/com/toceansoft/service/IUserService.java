package com.toceansoft.service;

import java.util.List;

import com.toceansoft.entity.User;

public interface IUserService {
	public String add(User u);
	public List<User> login(String name);

}
