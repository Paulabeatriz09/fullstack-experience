import java.util.Scanner;

public class E01 {

    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        double n1=entrada.nextDouble();
        System.out.println("Insira o segundo número");
        double n2=entrada.nextDouble();

        double media=((n1*3.5)+(n2*7.5))/11;

        System.out.println("A media é "+media);


    }
    
}
