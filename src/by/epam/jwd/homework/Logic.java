package by.epam.jwd.homework;

public class Logic {
    public boolean LogicTask1(int Number){
        double a = Number / (10 *10*10);
        double b = (Number / (10 * 10))%10;
        double c = (Number / 10) % 10;
        double d = Number % 10;
        boolean f = true;
        if(a + b == c + d){
            return f;
        }
        else{
            f = false;
            return f;
        }
    }

    public double LogicTask2(double [] Array) {
        double a = Array[0];
        double b = Array[1];
        double c = Array[2];
        double d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        return d;
    }

    public double [] LogicTask3(double [] Array) {
        double a = Array[0];
        double b = Array[1];
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double p = a+ b +c;
        double s = (a * b) / 2;
        double [] Array1 = new double[2];
        Array1[0] = p;
        Array1[1] = s;
        return Array1;
    }
    public boolean LogicTask4(int [] Array){
        int x = Array[0];
        int y = Array[1];
        boolean f = true;
        if(x >= -4 && x <=4 && y >= -3 && y <= 0){
            return f;
        } else if( x >= -2 && x<= 2 && y >=0 && y <= 4){
            return f;
        }
        else{
            f = false;
            return f;
        }
    }
}
