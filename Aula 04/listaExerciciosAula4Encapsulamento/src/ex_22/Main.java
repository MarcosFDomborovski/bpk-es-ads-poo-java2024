package ex_22;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa", "123456789", 10);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
        empresa.contratarFuncionario();
        empresa.mostrarFuncionarios();
    }
}
