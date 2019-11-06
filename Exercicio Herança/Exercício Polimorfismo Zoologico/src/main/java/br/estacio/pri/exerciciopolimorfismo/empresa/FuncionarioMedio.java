package br.estacio.pri.exerciciopolimorfismo.empresa;

public class FuncionarioMedio extends Funcionario {
    private String escola;

    public FuncionarioMedio() {

    }

    public FuncionarioMedio(String nome, int codigo, String escola) {
        super(nome, codigo);
        this.setEscola(escola);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public float calcularRenda() {
        FuncionarioBasico func = new FuncionarioBasico();

        return (float) (func.calcularRenda() * 1.5);
    }
}
