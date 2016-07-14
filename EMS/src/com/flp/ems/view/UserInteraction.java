package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.util.Validate;

public class UserInteraction {
	

Validate valid=new Validate();
public HashMap AddEmployee()
	{	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Name:");
		boolean flag=true;
		
		while(flag!=true){
			String name1=sc.nextLine();
		 flag=valid.validateName(name1);
		 if(flag==false)
			 System.out.println("wrong input....ReEnter the valid name");
		 
		}
		System.out.println("Enter the Address:");
		String ad=sc.nextLine();
		System.out.println("Enter the EmailId:");
		String emailid=sc.nextLine();
		System.out.println("Enter Phn no");
		int phn=sc.nextInt();
		System.out.println("Enter DOB");
		String dob=sc.nextLine();
		System.out.println("enter DOJ");
		String doj=sc.nextLine();
		System.out.println("Department list");
		String[] str={"FS","NFS"};
		System.out.println("FS,NFS");
		System.out.println("enter 1 for FS,enter 2 for NFS");
		int i=sc.nextInt();
		String departname = null;
		String description1 = null;
			switch(i){
		
		case 1:
			departname=str[0];
			description1="Financial Sevice";
			break;
		case 2:
			departname=str[1];
			description1="NonFinancial Service";
			break;
			default:
				System.out.println("wrong input");
		}
		System.out.println("Enter projectname");
		Scanner sc2 = new Scanner(System.in);
		String projname=sc2.nextLine();
		System.out.println("Enter Rolename");
		String rolename=sc2.nextLine();
		HashMap hm=new HashMap();
		hm.put(1,name1);
		hm.put(2, ad);
		hm.put(3, emailid);
		hm.put(4,phn);
		hm.put(5,dob);
		hm.put(6,doj);
		hm.put(7,departname);
		hm.put(8,description1);
		hm.put(9,projname);
		hm.put(10,rolename);
		return hm;
	}

public void SearchEmployee() 
	{
		
	}

public void ModifyEmployee() 
    {
	
	}

public void RemoveEmployee() 
	{
	
	}

public void getAllEmployee() 
	{
	
	}
}
