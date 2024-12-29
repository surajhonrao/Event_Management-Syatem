package com.Suraj.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Suraj.entity.Form;
import com.Suraj.repository.FormRepo;
import com.Suraj.serviceInterface.FormService;

@Service
public class FormImplementation implements FormService {
	@Autowired
	FormRepo repo;

	@Override
	public int save(Form form) {
		return repo.save(form).getId();
	}

}
