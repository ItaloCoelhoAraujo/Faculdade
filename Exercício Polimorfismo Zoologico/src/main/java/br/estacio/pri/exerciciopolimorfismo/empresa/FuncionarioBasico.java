package br.estacio.pri.exerciciopolimorfismo.empresa;

public class FuncionarioBasico extends Funcionario {
    private String escola;

    public FuncionarioBasico() {

    }

    public FuncionarioBasico(String nome, int codigo, String escola) {
        super(nome, codigo);
        this.setEscola(escola);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public float calcularRenda(){
        return (float) (super.calcularRenda() * 1.1);
    }
}
