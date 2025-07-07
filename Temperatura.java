import java.util.Scanner;
/*
Crie um programa que:
1.  Criar vetor com dias da semana.
2.  Solicite ao usuário que informe a temperatura média de cada dia da semana


#include <ctype.h>
#include <stdio.h>

int main() {
  float temperatura[7];

  for(int i = 0; i < 7; i++){
    printf("Digite o valor da temperatura do dia %d:", i +1);
    scanf("%f", &temperatura[i]);
  }
  for(int i = 0; i < 7; i++){
    printf("Temperatura do dia %d: %f", i + 1, temperatura[i])
  } 
}
*/
public class Temperatura {

  public static void main(String[] args) {

    int [] diasDaSemana = new int [7];
    Scanner scanner = new Scanner(System.in);
    int mediaDaSemana;

    System.out.println("Informe a temperatuda do dia 1 : ");
    diasDaSemana[0] = scanner.nextInt();

    int maior = diasDaSemana[0];
    int menor = diasDaSemana[0];
    int soma=0;
    
    for (int i = 1; i < 7; i++){
        System.out.println("Informe a temperatuda do dia "+(i+1)+" : ");
        diasDaSemana[i] = scanner.nextInt();
     
        if (diasDaSemana[i]>maior){
            maior = diasDaSemana[i];
        }if(diasDaSemana[i]<menor){
            menor = diasDaSemana[i];
        }

        soma = soma + diasDaSemana[i];
    }
        mediaDaSemana = soma / 7; 

        System.out.println("A tempertatura media da semana foi de : "+mediaDaSemana+" graus");
        System.out.println("O dia mais quente foi o qual registrou : "+maior+ " graus.");
        System.out.println("O dia menos quente foi o qual registrou : "+menor+ " graus.");



}}