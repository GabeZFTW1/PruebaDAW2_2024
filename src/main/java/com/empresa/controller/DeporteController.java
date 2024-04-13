package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Deporte;
import com.empresa.service.DeporteService;

@RestController
@RequestMapping("/url/deporte")
public class DeporteController {

	@Autowired
	private DeporteService deporteService;
	
	
	@GetMapping("/porNombreLike/{nombre}")
	public List<Deporte> listaDeportePorNombre(@PathVariable("nombre") String nombre){
		List<Deporte> lstSalida = deporteService.listaDeportePorNombreLike(nombre+"%");
		return lstSalida;
	}
	
	@GetMapping
	public List<Deporte> listaDeporte(){
		List<Deporte> lstSalida = deporteService.listaDeporte();
		return lstSalida;
	}
}






