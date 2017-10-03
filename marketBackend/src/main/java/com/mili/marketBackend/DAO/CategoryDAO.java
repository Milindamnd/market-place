package com.mili.marketBackend.DAO;

import java.util.List;

import com.mili.marketBackend.DTO.Category;

public interface CategoryDAO {

	List<Category>list();

	Category get(int id);
	
}
