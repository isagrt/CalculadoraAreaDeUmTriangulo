import java.util.Scanner;

public class Comparandoarea {

  public static void main(String[] args) {

    double ax, bx, cx, ay, by, cy;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o lado A do triângulo X: ");
    ax = scanner.nextDouble();
    System.out.println("Digite o lado B do triângulo X: ");
    bx = scanner.nextDouble();
    System.out.println("Digite o lado C do triângulo X: ");
    cx = scanner.nextDouble();

    System.out.println("Digite o lado A do triângulo Y: ");
    ay = scanner.nextDouble();
    System.out.println("Digite o lado B do triângulo Y: ");
    by = scanner.nextDouble();
    System.out.println("Digite o lado C do triângulo Y: ");
    cy = scanner.nextDouble();
    
    
    double px = (ax + bx + cx)/ 2;
    double py = (ay + by + cy)/ 2;

    double areax = Math.sqrt(px*(px - ax)*(px - bx)*(px - cx));
    double areay = Math.sqrt(py*(py - ay)*(py - by)*(py - cy));


    System.out.println("Area total do triangulo X: "+areax);
    System.out.println("Area total do triangulo Y: "+areay);

    if(areax >= areay){
      System.out.println("Area do triangulo X é maior.");
    }

    else{
      System.out.println("Area do triangulo Y é maior.");
    }
  }


}
