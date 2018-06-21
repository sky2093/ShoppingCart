package net.sky.shoppingbackend.dao;

import java.util.List;

import net.sky.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);

}
