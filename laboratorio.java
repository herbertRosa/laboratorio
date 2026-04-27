import java.util.Scanner;
public class laboratorio {
    public static void main(String[] args) {

        double amostrasDoDia;  //entrada
        double tempoDeProcessamento; //entrada
        double resultadosValidos; //entrada

        double tempoMedioAmostras; //saida
        double resultadoTotal; //saida

        System.out.println("Digite o quantidade de amostras:");
        Scanner entrada = new Scanner(System.in);
        amostrasDoDia = entrada.nextDouble();
//primeira entrada do usuario

        System.out.println("Digite o tempo gasto para processar as amostras (em minutos):");    
        tempoDeProcessamento = entrada.nextDouble();
//segunda entrada

System.out.println("Digite o numero de resultados validos:");
        resultadosValidos = entrada.nextDouble();
//terceira entrada


double percentualValidos1 = (resultadosValidos / amostrasDoDia) * 100; 
//calculo para o resultado do percentual de resultados validos

        tempoMedioAmostras = amostrasDoDia / tempoDeProcessamento; //calculo para o resultado do tempo medio de amostras
        resultadoTotal = tempoMedioAmostras;
        System.out.println("Resultados processados por minuto: " + resultadoTotal); //saida
        System.out.println("Percentual de resultados validos: " + percentualValidos1 + "%"); //saida


        entrada.close(); //finalização do scanner
    }
}
