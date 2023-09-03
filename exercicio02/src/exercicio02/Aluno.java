package exercicio02;

public class Aluno {

	    private String nome;
	    private String materia;
	    private String siglaMateria;
	    private String periodo;
	    private String matricula;
	    private int idade;
	    

	    public Aluno(String nome, String materia, String siglaMateria, String periodo, int idade, String matricula) {
	        this.nome = nome;
	        this.materia = materia;
	        this.siglaMateria = siglaMateria;
	        this.periodo = periodo;
	        this.idade = idade;
	        this.matricula = matricula;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getMateria() {
	        return materia;
	    }

	    public void setMateria(String materia) {
	        this.materia = materia;
	    }

	    public String getSiglaMateria() {
	        return siglaMateria;
	    }

	    public void setSiglaMateria(String siglaMateria) {
	        this.siglaMateria = siglaMateria;
	    }

	    public String getPeriodo() {
	        return periodo;
	    }

	    public void setPeriodo(String periodo) {
	        this.periodo = periodo;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }
	    
}
