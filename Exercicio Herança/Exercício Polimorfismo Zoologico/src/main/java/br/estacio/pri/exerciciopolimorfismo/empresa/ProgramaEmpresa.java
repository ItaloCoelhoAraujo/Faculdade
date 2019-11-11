package br.estacio.pri.exerciciopolimorfismo.empresa;

public class ProgramaEmpresa {
    public static void main(String[] args) {
        Funcionario[] empresa = new Funcionario[10];

        preencherEmpresa(empresa);

        float custoTotalEmpresa = calcularCustoTotal(empresa);
        float custoBasicos = calcularCustoBasicos(empresa);
        float custoMedios = calcularCustoMedios(empresa);
        float custoGraduados = calcularCustoGraduados(empresa);

        System.out.print("Custo total da empresa: " + custoTotalEmpresa +
                         "\nCusto dos Funcionarios com ensino Basico: " + custoBasicos +
                         "\nCusto dos Funcionarios com ensino medio: " + custoMedios +
                         "\nCusto dos Funcionarios com gradduacao: " + custoGraduados + "\n");
    }

    public static void preencherEmpresa(Funcionario[] empresa){
        empresa[0] = new FuncionarioBasico("Claudio", 1, "Novo Mundo");
        empresa[1] = new FuncionarioBasico("Silvana", 2, "Globomax");
        empresa[2] = new FuncionarioBasico("Maria", 3, "Globomax");
        empresa[3] = new FuncionarioBasico("Marcos", 4, "Aldaci");
        empresa[4] = new FuncionarioMedio("Silvia", 5, "IFCE");
        empresa[5] = new FuncionarioMedio("Reginaldo", 6, "IFCE");
        empresa[6] = new FuncionarioMedio("Amanda", 7, "Adauto");
        empresa[7] = new FuncionarioMedio("Breno", 8, "Adauto");
        empresa[8] = new FuncionarioGraduado("Fernando", 9, "Estacio");
        empresa[9] = new FuncionarioGraduado("Glenda", 10, "UFC");
    }

    public static float calcularCustoTotal(Funcionario[] empresa){
        float total = 0;

        for (int i = 0; i < empresa.length; i++){
            total += empresa[i].calcularRenda();
        }

        return total;
    }

    public static float calcularCustoBasicos(Funcionario[] empresa){
        float total = 0;

        for(int i = 0; i < empresa.length; i++){
            if(empresa[i] instanceof FuncionarioBasico){
                total += empresa[i].calcularRenda();
            }
        }

        return total;
    }

    public static float calcularCustoMedios(Funcionario[] empresa){
        float total = 0;

        for(int i = 0; i < empresa.length; i++){
            if(empresa[i] instanceof FuncionarioMedio){
                total += empresa[i].calcularRenda();
            }
        }

        return total;
    }

    public static float calcularCustoGraduados(Funcionario[] empresa){
        float total = 0;

        for(int i = 0; i < empresa.length; i++){
            if(empresa[i] instanceof FuncionarioGraduado){
                total += empresa[i].calcularRenda();
            }
        }

        return total;
    }
}
