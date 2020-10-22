package com.example.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.example.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getServiceCode() {
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}


	public void addAccount(Account theAccount,boolean flag) {
		System.out.println(getClass()+" doing my DB work");
	}
}
