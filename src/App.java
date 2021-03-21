public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        CargosManager cargosManager = new CargosManager();

        funcionario.setCargosManager(cargosManager);
        funcionario.buscarDados();
        cargosManager.acoesCargos(funcionario.getCargo());
        funcionario.calcularHoraExtra();
    }
}
