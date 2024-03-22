import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

  public static void main(String[] args) throws Exception {
    selecaoCandidatos();
  }

  static void selecaoCandidatos() {
    String[] candidatos = {
      "João",
      "Marcia",
      "Andre",
      "Luffytaro",
      "Zorojuro",
      "Nilson",
      "Dean",
      "John",
      "Dexter",
      "Debra",
      "Jim",
      "Morrison",
    };

    String[] candidatosSelecionados = new String[candidatos.length];
    int NumeroCandidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (
      NumeroCandidatosSelecionados < 5 && candidatoAtual < candidatos.length
    ) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println(
        "O candidato " +
        candidato +
        " solicitou este valor de salário: " +
        salarioPretendido
      );
      if (salarioBase >= salarioPretendido) {
        System.out.println(
          "O candidato " + candidato + " foi selecionado para a vaga"
        );
        NumeroCandidatosSelecionados++;
        candidatosSelecionados[NumeroCandidatosSelecionados] = candidato;
      }
      candidatoAtual++;
    }
    imprimirSelecionados(candidatosSelecionados);
  }

  static void imprimirSelecionados(String[] selecionados) {
    String ImpressaoCandidatosSelecionados = "Candidatos selecionados:\n";

    for (String candidatoSelecionado : selecionados) {
      if (candidatoSelecionado != null) {
        ImpressaoCandidatosSelecionados += candidatoSelecionado + "\n";
      }
    }

    System.out.println(ImpressaoCandidatosSelecionados);
  }

  static void analisarCandidato(Double salarioPretendido) {
    Double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato.");
    } else if (salarioBase < salarioPretendido) {
      System.out.println("Aguardando resultado demais candidatos.");
    } else {
      System.out.println("Ligar para o candidato com contra proposta.");
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
}
