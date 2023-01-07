import java.util.Scanner;

public class ejerciciojava{

    public static void main(String[] args) throws Exception {
        Scanner entrada =new Scanner (System.in);
        int n,cp,ci;
        n=1;
        cp=0;
        ci=0;

        do{
            System.out.println("Digite los numeros");
            n=entrada.nextInt();
            if(n%2==0){
              cp++;
            }else{
                ci++;
            }
        }while(n!=0);{
         System.out.println("La cantidad de numeros pares es : "+ cp);
         System.out.println("La cantidad de numeros impares es : "+ ci);
        }


    }

}


