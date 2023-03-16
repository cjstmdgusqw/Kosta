package com; // 클래스파일의 맨 위에 Package 선언

// 클래스 정의 위에 import 선언
import java.sql.Date;

import com.kosta.MyClass;
import com.kosta.YourClass;
//import com.kosta.*;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc2 = new MyClass();
		Date date = new Date(2023,3,8);
		java.util.Date date2 = new java.util.Date();
		
		YourClass yc1 = new YourClass();

	}

}
