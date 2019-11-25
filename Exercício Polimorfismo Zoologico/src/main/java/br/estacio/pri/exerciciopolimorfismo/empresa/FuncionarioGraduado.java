package br.estacio.pri.exerciciopolimorfismo.empresa;

public class FuncionarioGraduado extends Funcionario {
    private String faculdade;

    public FuncionarioGraduado() {

    }

    public FuncionarioGraduado(String nome, int codigo, String faculdade) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setFaculdade(faculdade);
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public float calcularRenda() {
        FuncionarioMedio func = new FuncionarioMedio();

        return (float) (func.calcularRenda() * 2);
    }
}
