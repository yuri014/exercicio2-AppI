import java.util.Scanner;

public class Funcionario {
  private String nome;
  private String matricula;
  private String cargo;
  private Double salario;
  private Double horasTrabalhadas;
  private CargosManager cargosManager;

  Scanner input = new Scanner(System.in);

  public String getNome() {
    return nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public Double getSalario() {
    return salario;
  }

  public Double getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public String getCargo() {
    return cargo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public void setHorasTrabalhadas(Double horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public CargosManager getCargosManager() {
    return cargosManager;
  }

  public void setCargosManager(CargosManager cargosManager) {
    this.cargosManager = cargosManager;
  }

  public void calcularHoraExtra() {
    Double novoSalario = salario;

    if (Double.compare(horasTrabalhadas, 200.0) > 0) {
      Double horasExtras = horasTrabalhadas - 200.0;
      Double valorPorHora = salario / 200;

      novoSalario = (valorPorHora * horasExtras) + salario;
    }

    System.out.println("Seu salário será de: " + novoSalario);
  };

  public void buscarDados() throws Exception {
    System.out.println("Digite o seu nome: ");
    nome = input.next();
    
    System.out.println("Digite a sua matrícula: ");
    matricula = input.next();

    System.out.println("Digite o seu salário: ");
    salario = input.nextDouble();

    System.out.println("Digite suas horas trabalhadas: ");
    horasTrabalhadas = input.nextDouble();

    System.out.println("Para o seu cargo, digite: ");
    System.out.println("[1] Para Vendedor");
    System.out.println("[2] Para Gerente");
    System.out.println("[3] Para Caixa");
    
    cargo = cargosManager.selecionarCargos(input.next());
  }
}
