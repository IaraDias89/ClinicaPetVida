package br.edu.iftm.petvida.model;

public class Animal {
    private Integer idAnimal;
    private String nome;
    private String especie;
    private Integer idade;
    private Tutor tutor;

    public Animal() {}

    public Animal(Integer idAnimal, String nome, String especie, Integer idade, Tutor tutor) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.tutor = tutor;
    }

    public Integer getIdAnimal() { return idAnimal; }
    public void setIdAnimal(Integer idAnimal) { this.idAnimal = idAnimal; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Tutor getTutor() { return tutor; }
    public void setTutor(Tutor tutor) { this.tutor = tutor; }
}