import java.util.Scanner;
public class laboratorio {
    public static void main(String[] args) {

        int amostrasDoDia;  //entrada
        double tempoDeProcessamento; //entrada
        int resultadosValidos; //entrada

        double tempoMedioAmostras; //saida
        double resultadoProcessadosMin; //saida

        System.out.println("Digite o quantidade de amostras:");
        Scanner entrada = new Scanner(System.in);
        amostrasDoDia = entrada.nextInt();
//primeira entrada do usuario

        System.out.println("Digite o tempo gasto para processar as amostras (em minutos):");    
        tempoDeProcessamento = entrada.nextDouble();
//segunda entrada

System.out.println("Digite o numero de resultados validos:");
        resultadosValidos = entrada.nextInt();
//terceira entrada

double razaoValidos = ((double)resultadosValidos / amostrasDoDia);
double percentualValidos1 = razaoValidos * 100;
//calculo para o resultado do percentual de resultados validos

        tempoMedioAmostras = amostrasDoDia / tempoDeProcessamento; 
        resultadoProcessadosMin = tempoMedioAmostras; //calculo para o resultado do tempo medio de amostras
        
System.out.println("Aqui estão os resultados do dia do laboratorio:");

        System.out.println("Amostras do dia: " + amostrasDoDia); //saida
        System.out.printf("Tempo de processamento: %.2f minutos%n", tempoDeProcessamento); //saida
        System.out.println("Resultados validos: " + resultadosValidos); //saida
        System.out.printf("Tempo medio de amostras processadas por minuto: %.2f%n", tempoMedioAmostras); //saida
        System.out.printf("Resultados processados por minuto: %.2f%n", resultadoProcessadosMin); //saida
        System.out.printf("Percentual de resultados validos: %.2f%%%n", percentualValidos1); //saida


        entrada.close(); //finalização do scanner
    }
}
