package com.nt.client;

import java.util.Locale;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;

public class I18nTest {

	public static void main(String[] args) {
		
		// read input from the end user
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the lang Code:");
		String lang=sc.next();
		System.out.println("Enter the Country Code:");
		String country=sc.next();
		
		//create locale object having lang & country
		Locale locale= new Locale(lang,country);
		System.out.println(locale);
		
		//create ioc container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//read the msg from properties file using ctx.getMesssage(-)
		String msg1=ctx.getMessage("wish.msg",new Object[]{}, locale);
		String msg2=ctx.getMessage("seeu.msg",new Object[]{}, locale);
		
		//display the message
		System.out.println(msg1+"--->"+msg2);
		//close the container
		ctx.close();
		
	}

}
