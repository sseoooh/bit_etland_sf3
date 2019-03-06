package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.EmployeeDTO;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void registEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public List<EmployeeDTO> bringEmployeeList() {
		return null;
	}

	@Override
	public List<EmployeeDTO> retrieveEmployeesByName(String SearchWord) {
		return null;
	}

	@Override
	public EmployeeDTO retrieveEmployee(String SearchWord) {
		return null;
	}

	@Override
	public int countEmployees() {
		return 0;
	}

	@Override
	public boolean existsEmployee(EmployeeDTO emp) {
		return false;
	}

	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public void removeEmployee(EmployeeDTO emp) {
		
	}

}
