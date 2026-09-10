package br.edu.iftm.petvida.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iftm.petvida.model.Animal;
import br.edu.iftm.petvida.repository.AnimalRepository;

@Controller
public class ClinicaController {

    @Autowired
    private AnimalRepository animalRepository;

    private static final int NN = 16;

    @GetMapping("/ficha_16")
    public String ficha(Model model) {
        Animal animal = animalRepository.buscarPorId(100 + NN);
        model.addAttribute("nome", animal.getNome());
        model.addAttribute("especie", animal.getEspecie());
        model.addAttribute("idade", String.valueOf(animal.getIdade()));
        model.addAttribute("tutorNome", animal.getTutor().getNome());
        model.addAttribute("tutorTelefone", animal.getTutor().getTelefone());
        return "ficha";
    }

    @GetMapping("/tutor_16")
    public String tutor(Model model) {
        Animal animal = animalRepository.buscarPorId(100 + NN);
        int qtd = animalRepository.contarAnimaisDoTutor(animal.getTutor().getIdTutor());
        model.addAttribute("tutorNome", animal.getTutor().getNome());
        model.addAttribute("tutorTelefone", animal.getTutor().getTelefone());
        model.addAttribute("qtdAnimais", String.valueOf(qtd));
        return "tutor";
    }

    @GetMapping("/resumo_16")
    public String resumo(Model model) {
        model.addAttribute("totalAnimais", String.valueOf(animalRepository.contarAnimais()));
        model.addAttribute("mediaIdade", String.format("%.2f", animalRepository.mediaIdade()));
        model.addAttribute("maisVelho", animalRepository.animalMaisVelho());
        model.addAttribute("dataHora", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        return "resumo";
    }
}