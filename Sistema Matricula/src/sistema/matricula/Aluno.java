package sistema.matricula;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    
    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    public String getMatricula() {
    	return matricula;
    }

    public void setMatricula(String matricula) {
    	this.matricula = matricula;
    }

    public int getIdade() {
    	return idade;
    }

    public void setIdade(int idade) {
    	this.idade = idade;
    }

    public boolean validarIdade() {
        return idade >= 16;
    }

    public boolean validarMatricula() {
        return matricula.length() >= 10;
    }
}
