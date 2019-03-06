package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;


@Component
public interface CategoryService {
	//C
	public void registCategory(CategoryDTO cat);
	//R
	public List<?> bringCategoryList(Proxy pxy);
	public List<CategoryDTO> retrieveCategoryByName(Proxy pxy);
	public CategoryDTO retrieveCategory(CategoryDTO cat);
	public int countCategory(Proxy pxy);
	public boolean existsCategory(Proxy pxy);
	//U
	public void modifyCategory(CategoryDTO cat);
	//D
	public void removeCategory(CategoryDTO cat);
}
