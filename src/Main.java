import java.util.Scanner;
import java.lang.Math;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args)
    {
        System.out.printf("Данная программа находит такую точку заданного на плоскости множества точек, сумма расстояний от которой до остальных минимальна.\n");
        Scanner sn = new Scanner(System.in);
        System.out.printf("Введите количество точек: ");
        int n = sn.nextInt();
        double[] dotsX = new double[n];
        double[] dotsY = new double[n];
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Введите координату x точки номер " + (i + 1) + ": ");
            dotsX[i] = sn.nextInt();
            System.out.printf("Введите координату y точки номер " + (i + 1) + ": ");
            dotsY[i] = sn.nextInt();
        }
        /*int minDot = 9999999;
        double minlength = 9999999;
        *//*for(int i = 0; i < n; i++)
        {
            double length = 0;
            for(int j = 0; j < n; j++)
            {
                length += Math.pow((Math.pow(dotsX[j] - dotsX[i], 2)) + (Math.pow(dotsY[j] - dotsY[i], 2)), 0.5);
            }
            if (length < minlength)
            {
                minlength = length;
                minDot = i;
            }
        }*/
        double xMid = DoubleStream.of(dotsX).sum() / n;
        double yMid = DoubleStream.of(dotsY).sum() / n;
        System.out.printf("Точкой имеющей наименьшее расстояние до остальных является: [" + xMid + ", " + yMid + "]\n");

    }
}