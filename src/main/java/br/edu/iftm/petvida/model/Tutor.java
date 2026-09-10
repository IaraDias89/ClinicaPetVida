package br.edu.iftm.petvida.model;

public class Tutor {
    private Integer idTutor;
    private String nome;
    private String telefone;

    public Tutor() {}

    public Tutor(Integer idTutor, String nome, String telefone) {
        this.idTutor = idTutor;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getIdTutor() { return idTutor; }
    public void setIdTutor(Integer idTutor) { this.idTutor = idTutor; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}