package com.alura.foroAlura.controller;

import com.alura.foroAlura.model.Usuario;
import com.alura.foroAlura.repisotory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private UserRepository repository;

	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/users")
	@ResponseBody
	private List<Usuario> getAll(){
		return repository.findAll();
	}

}
