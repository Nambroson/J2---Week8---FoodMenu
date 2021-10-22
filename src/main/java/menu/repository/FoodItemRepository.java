package menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import menu.beans.FoodItem;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long>{

}