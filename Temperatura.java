import java.util.Scanner;
/*
Crie um programa que:
1.  Criar vetor com dias da semana.
2.  Solicite ao usuário que informe a temperatura média de cada dia da semana
3. Veja a media da semana, a maior e menor temperatura.
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