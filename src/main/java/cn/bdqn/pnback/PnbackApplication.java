package cn.bdqn.pnback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableCaching
@SpringBootApplication
@MapperScan("cn.bdqn.pnback.dao")
@EnableTransactionManagement
public class PnbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnbackApplication.class, args);
	}

}
