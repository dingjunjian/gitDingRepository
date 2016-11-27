package com.project.ssi.userinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.ssi.userinfo.bean.UserInfo;
import com.project.ssi.userinfo.service.IUserInfoService;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"classpath*:applicationContextTest.xml"})
public class userInfoTest {

	@Autowired
	IUserInfoService userInfoService;
	
	@Test
	public void testUserInfoAdd(){
		System.out.println("start");
		UserInfo info = new UserInfo();
		info.setId("1003");
		info.setName("zhangsan");
		Integer intcount = userInfoService.AddUserInfo(info);
		System.out.println("测试" + intcount);
	}
	
	@Test
	public void testUserInfoFind(){
		System.out.println("start");
		List<UserInfo> userList = userInfoService.findAllUser();
		System.out.println("测试" + userList.get(0));
	}
	
	@Test
	public void testUserInfoDel(){
		System.out.println("start");
		Integer intcount = userInfoService.delteUser("1003");
		System.out.println("测试" + intcount);
	}
	
	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?user=root&password=mysql&useUnicode=true&characterEncoding=UTF8");
		    Statement s =  conn.createStatement();
		    System.out.println(conn.isClosed());
		} catch (Exception e) {
		     e.printStackTrace();
		}
	}
	
}
