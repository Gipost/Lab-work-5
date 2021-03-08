package com.edu;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer> IntList = new ArrayList<Integer>();
        System.out.print("Enter N: \n");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Enter numbers: \n");
        for (int i = 0; i<N; i++)
        {
            IntList.add(0,in.nextInt());
        }
        double res = 1;
        result(res,0,N,IntList);
    }
    static void result(double res, int n, int N, ArrayList<Integer> Intlist)
    {
        if (n<N)
        {
            int num = Intlist.get(n);
            if (num % 3 == 0)
            {
                res *= num;
            }
            result(res,n+1,N,Intlist);
        }
        else System.out.println(res);
    }
}
