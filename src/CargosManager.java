public class CargosManager {
  public String vendedor = "1";
  public String gerente = "2";
  public String caixa = "3";

  public String selecionarCargos(String cargo) throws Exception {
    if (cargo.equals(vendedor)) {
      return "Vendedor";
    } else if (cargo.equals(gerente)) {
      return "Gerente";
    } else if (cargo.equals(caixa)) {
      return "Caixa";
    } else {
      throw new Exception();
    }
  }

  public void acoesCargos(String cargo) {
    if (cargo.equals("Vendedor")) {
      Vendedor vendedor = new Vendedor();
      vendedor.vender();

      return;
    } else if (cargo.equals("Gerente")) {
      Gerente gerente =  new Gerente();
      gerente.concederDesconto();

      return;
    } else if (cargo.equals("Caixa")) {
      Caixa caixa = new Caixa();
      caixa.fecharCaixa();

      return;
    }
  }
}
