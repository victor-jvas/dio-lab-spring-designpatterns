package dio.lab.spring.ip.ipinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IpinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpinfoApplication.class, args);
	}

}
