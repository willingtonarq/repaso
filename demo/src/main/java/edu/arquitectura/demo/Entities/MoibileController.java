package edu.arquitectura.demo.Entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoibileController {

    @GetMapping("/solicitarAsistencia")
    public String solicitarAsistencia(@RequestParam String numeroPoliza){
        return new String("");
    }
}
