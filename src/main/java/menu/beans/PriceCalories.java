package menu.beans;

import javax.persistence.Embeddable;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
@Embeddable
public class PriceCalories {
	
	private double price;
	private String calories;
	
	public PriceCalories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceCalories(double price, String calories) {
		super();
		this.price = price;
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "PriceCalories [price=" + price + ", calories=" + calories + "]";
	}

}
