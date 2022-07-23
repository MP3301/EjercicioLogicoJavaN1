package course;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {






    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        System.out.println("GEOMETRIC FIGURES AREA CALCULATOR");
        System.out.println("SELECT A OPTION");
        System.out.println("1: CIRCLE");
        System.out.println("2: TRIANGLE");














        switch (in.nextInt()){
            case 1 : {
                System.out.println("WRITE CIRCLE RADIUS");
               int a =  in.nextInt();
                Double radio = Double.valueOf(a);

                Double area = (radio * radio) *  3.14159;
                System.out.println("THE AREA IS = "+ area);
                break;
            }

            case 2 : {
                System.out.println("WRITE BASE MEASURE");
                int b =  in.nextInt();
                Double base = Double.valueOf(b);

                System.out.println("WRITE HEIGHT MEASURE");
                int c =  in.nextInt();
                Double height = Double.valueOf(c);

                Double area = (base * height) / 2;
                System.out.println("THE AREA IS = "+ area);
                break;
            }

            default :  {
                System.out.println("NOT VALID OPTION");
            }

        }






    }














}
