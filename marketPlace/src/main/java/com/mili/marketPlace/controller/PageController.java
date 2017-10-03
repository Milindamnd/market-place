package com.mili.marketPlace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mili.marketBackend.DAO.CategoryDAO;
import com.mili.marketBackend.DTO.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/" , "/index" , "/home"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("onClickHome",true);
		return mv;
		
	}
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("onClickAbout",true);
		return mv;
		
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("onClickContact",true);
		return mv;
		
	}
	@RequestMapping(value= {"/show/all/product"})
	public ModelAndView product() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","View Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("onClickAllProduct",true);
		return mv;
		
	}
	@RequestMapping(value= {"/show/category/{id}/product"})
	public ModelAndView filterCatagoryById(@PathVariable("id")int id) {
		ModelAndView mv=new ModelAndView("page");
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("title",category.getName());
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("onClickCategoryProduct",true);
		return mv;
		
	}
}
