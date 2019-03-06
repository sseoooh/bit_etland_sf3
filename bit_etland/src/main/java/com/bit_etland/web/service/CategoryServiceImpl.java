package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public void registCategory(CategoryDTO cat) {
		
	}

	@Override
	public List<?> bringCategoryList(Proxy pxy) {
		return null;
	}

	@Override
	public List<CategoryDTO> retrieveCategoryByName(Proxy pxy) {
		return null;
	}

	@Override
	public CategoryDTO retrieveCategory(CategoryDTO cat) {
		return null;
	}

	@Override
	public int countCategory(Proxy pxy) {
		return 0;
	}

	@Override
	public boolean existsCategory(Proxy pxy) {
		return false;
	}

	@Override
	public void modifyCategory(CategoryDTO cat) {
		
	}

	@Override
	public void removeCategory(CategoryDTO cat) {
		
	}

}
