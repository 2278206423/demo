package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper") // 指定 Mapper 接口包路径
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
//		cs cs1 =new cs();
//		cs1.decrypt("s","s");
		cs2 cs=new cs2();
		cs.encode("1");

	}


}
