package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		/*
		 * BeanFactory factory = new BeanFactory(); TV tv =
		 * (TV)factory.getBean(args[0]);
		 * 
		 * tv.powerOn(); tv.powerOff(); tv.volumeUp(); tv.volumeDown();
		 */
		
		//1. Spring 컨테이너를 구동한다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
 		//2 Spring 컨테이너로부터 필요한 객ㄹ=체를ㅇ헝헏
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp(); 
		tv.volumeDown(); 
		
		//3. Sprig 커테이너를 조욯한다
		factory.close();
	}

}
