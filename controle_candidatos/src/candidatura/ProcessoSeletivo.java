package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        selecaoCandidatos();
    
        imprimirSelecionados();
    }
        static void imprimirSelecionados() {
        	String[] candidatos = {"Maria", "Felipe", "Lucas", "Joao", "Antonio"};
        	
        	System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        	
        	for(int indice=0; indice < candidatos.length;indice++) {
        		System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
        	}
        
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Maria", "Felipe", "Lucas", "Joao", "Antonio"};

        int candidatosSelecionados = 0; 
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("Candidato: " + candidato + " | Salário pretendido: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " selecionado para a próxima fase.");
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato " + candidato + " não selecionado.");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
