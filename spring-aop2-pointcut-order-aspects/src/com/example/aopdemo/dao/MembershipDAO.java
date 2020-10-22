package com.example.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass()+" doing my DB work in MembershipDAO class");
	}
}
