package com.mkyong.user.bo.impl;

import java.io.Serializable;

import javax.inject.Named;

import com.mkyong.user.bo.UserBo;

@Named
public class UserBoImpl implements UserBo, Serializable{
 
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		
		return "JSF 2 + Spring Integration";
	
	}
 
}