package com.yaoyx;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Augus
 */
@SpringBootApplication
@MapperScan("com.yaoyx.mapper")
public class YaoUserCenterBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(YaoUserCenterBackendApplication.class, args);
  }
}
