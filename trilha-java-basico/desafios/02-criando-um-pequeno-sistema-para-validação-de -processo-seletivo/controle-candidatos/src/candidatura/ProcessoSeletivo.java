import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        imprimirSelecionados();
        selecaoCandidatos();

        */
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};  
        for(String candidato: candidatos){   
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            
            if (continuarTentando) {
                tentativasRealizadas++;                
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
            
        }while(continuarTentando && tentativasRealizadas <= 3);
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }else {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " , NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("IMPRIMINDO LISTA DE CANDIDATOS INFORMANDO O INDICE DO ELEMENTO");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O CANDIDATO DE Nº " + (indice+1) + " É O " + candidatos[indice]);
        }
        System.out.println("FORMA ABREVIADA DE INTERAÇÃO COM O FOR EACH");
        for (String candidato: candidatos){
            System.out.println("O CANDIDATO SELECIONADO FOI " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O CANDIDATO " + candidato + " SOLICITOU ESSE VALOR DE SALARIO " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO PARA A VAGA");
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato não foi selecionado");
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA OCANDIDATO COM CONTRA PROPOSTA");

        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMASI CANDIDATOS");
        }
    }
}
