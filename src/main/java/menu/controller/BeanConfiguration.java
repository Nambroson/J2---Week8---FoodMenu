package menu.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import menu.beans.FoodItem;
import menu.beans.PriceCalories;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public FoodItem foodItem() {
		FoodItem bean = new FoodItem();
		bean.setCategory("Breakfast");
		bean.setName("Scrambled Eggs");
		return bean;
	}
	
	@Bean
	public PriceCalories priceCalories() {
		PriceCalories bean = new PriceCalories(5.99, "95");
		return bean;
	}

}
