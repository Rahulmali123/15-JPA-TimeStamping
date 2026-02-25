package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		ProductRepo repo = run.getBean(ProductRepo.class);
		
		Product p1=new Product();
		
		// p1.setPid(103);
		p1.setPname("HDD");
		p1.setPrice(7500.00);
		
		repo.save(p1);
		
		
		
		
	}

}
