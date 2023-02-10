package com.alura.foroAlura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.foroAlura.controller.dto.TopicoDTO;
import com.alura.foroAlura.model.Curso;
import com.alura.foroAlura.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> listado() {
		Topico topico = new Topico("Título", "Mensaje", new Curso("Spring parte 1", "Desarrollo"));
		return TopicoDTO.convertir(Arrays.asList(topico, topico));
	}
}
