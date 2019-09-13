package cn.bdqn.pnback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.pnback.dao")
public class PnbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnbackApplication.class, args);
	}

}
