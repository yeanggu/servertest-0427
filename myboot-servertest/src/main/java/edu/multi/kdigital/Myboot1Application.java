package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = UploadController.class)
@ComponentScan(basePackageClasses = MemberMybatisController.class)
//@ComponentScan(basePackages= {"upload"})
@MapperScan(basePackageClasses = MemberDAO.class)
@ComponentScan(basePackages = "product")
@MapperScan(basePackageClasses = ProductDAO.class)


public class Myboot1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
	}

}
