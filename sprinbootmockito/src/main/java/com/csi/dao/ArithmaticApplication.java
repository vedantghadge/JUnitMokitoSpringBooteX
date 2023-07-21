package com.csi.dao;

public class ArithmaticApplication {

    public static void main(String[] args) {

        ArithmaticApplication arithmaticApplication=new  ArithmaticApplication();

        System.out.println("\n addition result "+arithmaticApplication.add(10,20));
        System.out.println("\n substraction result "+arithmaticApplication.sub(30,20));


    }

   public  int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {

        return n1 - n2;
    }


}
