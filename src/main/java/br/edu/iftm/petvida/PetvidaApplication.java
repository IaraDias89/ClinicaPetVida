package br.edu.iftm.petvida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.petvida.model.Animal;
import br.edu.iftm.petvida.model.Tutor;
import br.edu.iftm.petvida.repository.AnimalRepository;
import br.edu.iftm.petvida.repository.TutorRepository;

@SpringBootApplication
public class PetvidaApplication implements CommandLineRunner {

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private AnimalRepository animalRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetvidaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tutor t1 = new Tutor(1, "Marina Alves", "34 99101-0001");
        Tutor t2 = new Tutor(2, "Carlos Prado", "34 99101-0002");
        tutorRepository.salvar(t1);
        tutorRepository.salvar(t2);

        animalRepository.salvar(new Animal(1, "Rex", "cao", 5, t1));
        animalRepository.salvar(new Animal(2, "Mimi", "gato", 3, t1));
        animalRepository.salvar(new Animal(3, "Thor", "cao", 1, t2));
        animalRepository.salvar(new Animal(4, "Lila", "gato", 11, t2));

        int nn = 16;
        Tutor seuTutor = new Tutor(100 + nn, "Iara", "34 91616-1616");
        tutorRepository.salvar(seuTutor);

        Animal seuAnimal = new Animal(100 + nn, "Pet_" + nn, "cao", nn, seuTutor);
        animalRepository.salvar(seuAnimal);
    }
}