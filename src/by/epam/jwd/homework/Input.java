package by.epam.jwd.homework;

import java.util.Scanner;

public class Input {
    public int NumberTask1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Веедите натуральное число!");
            System.out.print("Введите четырёхзначное число: ");
        }
        int a = scanner.nextInt();
        return a;
    }

    public double [] NumbersTask2(){
        Scanner scanner = new Scanner(System.in);
        double [] Array = new double[3];
        for(int i = 0; i < Array.length; i++){
            System.out.print("Введите " + (i+1) + "-е" + " число: ");
            while(!scanner.hasNextDouble()){
                scanner.nextLine();
                System.out.print("Введите " + (i+1) + "-е" + " число: ");
            }
            Array[i] = scanner.nextDouble();
        }
        return Array;
    }
    public double [] NumbersTask3(){
        Scanner scanner = new Scanner(System.in);
        double [] Array = new double[2];
        for(int i = 0; i < Array.length; i++){
            System.out.print("Введите " + "катет " +"№" + (i+1) + " : ");
            while(!scanner.hasNextDouble()){
                scanner.nextLine();
                System.out.print("Введите " + "катет " +"№" + (i+1) + " : ");
            }
            Array[i] = scanner.nextDouble();
        }
        return Array;
    }
    public int [] NumbersTask4(){
        Scanner scanner = new Scanner(System.in);
        int [] Array = new int[2];
        int x;
        int y;
        System.out.print("Введите x: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Веедите натуральное число!");
            System.out.print("Введите x: ");
        }
        x = scanner.nextInt();
        System.out.print("Введите y: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Веедите натуральное число!");
            System.out.print("Введите y: ");
        }
        y = scanner.nextInt();
        Array[0] = x;
        Array[1] = y;
        return Array;
    }
}
