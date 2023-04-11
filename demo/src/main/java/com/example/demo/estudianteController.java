package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estudianteController {
    @GetMapping("/estudiantes") 
                                
    public String getEstudiantes() {
        return "Lista de Estudiantes";
    }

    @PostMapping("/estudiantes")
    public Estudiante postEstudiantes(@RequestBody Estudiante estudiante) {
        estudiante.setAge(20);
        return estudiante; //Lo devuelve como un JSON a solas 
    }

}
