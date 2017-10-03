package com.mili.marketBackend.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mili.marketBackend.DAO.CategoryDAO;
import com.mili.marketBackend.DTO.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category>categories=new ArrayList<>();
	static {
	
		Category category=new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("Dell i5");
		category.setImageURL("Dell_1.jpg");
		
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Samsung S3");
		category.setImageURL("Samsung_1.jpg");
		
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		for(Category category :categories ) {
			if(category.getId()==id) {
				return category;
			}
		}
		return null;
	}

}
