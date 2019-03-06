package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryMapper {
	public void insertCategory(CategoryDTO cat);
	public List<?> selectCategoryList(Proxy pxy);
	public List<CategoryDTO> selectCategoryByName(CategoryDTO cat);
	public CategoryDTO selectCateory(CategoryDTO cat);
	public int countCategory(Proxy pxy);
	public boolean existsCategory(Proxy pxy);
	public void updateCategory(CategoryDTO cat);
	public void deleteCategory(CategoryDTO cat);
}
