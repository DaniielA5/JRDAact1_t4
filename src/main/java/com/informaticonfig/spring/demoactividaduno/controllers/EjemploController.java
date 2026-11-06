package com.informaticonfig.spring.demoactividaduno.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Map<String, Object> modelo) {
        modelo.put("Titulo","Servidor en linea");
        modelo.put("Servidor", "InformaticConfig");
        modelo.put("Ip", "192.168.1.1");

        return "detalles_info";
    }
}
