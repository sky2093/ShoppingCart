package net.sky.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sky.shoppingbackend.dao.CategoryDAO;
import net.sky.shoppingbackend.dto.Category;


 							//categoryDAO is same as object name in pageCOntroller from frontend 
                           //since to implement autowiring in frontend , it needs to show that
                           //it uses spring mvc and for that this DAOimpl class needs to get
                           //Repository annotation for linking to frontend.
@Repository("categoryDAO")						   
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		//adding first category
		
		category.setId(1);
		category.setName("Telivision");
		category.setDesscription("This is TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDesscription("This is Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDesscription("This is Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	
	
	
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}






	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		//enhanced for loop
		for(Category category:categories) {
			if(category.getId() == id) {
				return category;
			}
		}
			
		return null;
	}

}
