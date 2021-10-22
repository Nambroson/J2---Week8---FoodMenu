package menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import menu.beans.FoodItem;
import menu.beans.PriceCalories;
import menu.controller.BeanConfiguration;
import menu.repository.FoodItemRepository;

@SpringBootApplication
public class FoodMenuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodMenuApplication.class, args);
		
	}
	
	@Autowired
	FoodItemRepository repo;
	
	public void run(String... args) throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		FoodItem f = appContext.getBean("foodItem", FoodItem.class);
		f.setName("Cheeseburger");
		repo.save(f);
		
		FoodItem dinner = new FoodItem("Dinner", "Surf and Turf");
		PriceCalories pc = new PriceCalories(39.99, "850");
		dinner.setPriceCalories(pc);
		repo.save(dinner);
		
		List<FoodItem> allMyFoodItems = repo.findAll();
		for(FoodItem foods: allMyFoodItems) {
			System.out.println(foods.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
