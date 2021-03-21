public class Vendedor extends Funcionario {
  private Double comissao;

  public void vender() {
    comissao = 10.0;
    System.out.println("Sua comissão é de: " + comissao);
  }
}
