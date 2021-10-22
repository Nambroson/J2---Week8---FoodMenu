package menu.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
@Entity
public class FoodItem {
	@Id
	@GeneratedValue
	private long id;
	private String category;
	private String name;
	@Autowired
	private PriceCalories priceCalories;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "Pancakes";
	}

	public FoodItem(String category, String name) {
		super();
		this.category = category;
		this.name = name;
	}

	public FoodItem(long id, String category, String name) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PriceCalories getPriceCalories() {
		return priceCalories;
	}

	public void setPriceCalories(PriceCalories priceCalories) {
		this.priceCalories = priceCalories;
	}

	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", category=" + category + ", name=" + name + ", priceCalories=" + priceCalories
				+ "]";
	}

}
