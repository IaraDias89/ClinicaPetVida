package br.edu.iftm.petvida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iftm.petvida.repository.AnimalRepository;

@Controller                                            // ITEM 1: Adicionada anotação @Controller
public class ConsultaController {

    @Autowired
    AnimalRepository repository;

    @GetMapping("/consulta")                           //  ITEM 2: Adicionada a barra "/" antes de consulta
    public String consulta(Model model) {
        model.addAttribute("bicho", repository.buscarPorId(116)); // ITEM 3: ID 116 (100 + 16)
        return "consulta";                             // ITEM 4: Removida a extensão ".html"
    }
}
