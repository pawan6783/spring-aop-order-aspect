package com.example.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;

public class MainAppDemo {
	public static void main(String []args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
		Account theAccount = new Account();
		theAccount.setName("max");
		theAccount.setLevel("200");
		theAccountDAO.addAccount(theAccount,true);
		theMembershipDAO.addAccount();
		
		theAccountDAO.setName("john");
		theAccountDAO.setServiceCode("200");
		
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		context.close();
	}
}
