package org.geekster;
import java .io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {




            Scanner sc = new Scanner(System.in);
            public static void carServiceCase(CarService carService , ArrayList<String> arr){

                while(true){
                    System.out.println("Select the type servicing code : ");
                    System.out.println("1:BS01");
                    System.out.println("2:EF01");
                    System.out.println("3:CF01");
                    System.out.println("4:BF01");
                    System.out.println("5:GF01");
                    System.out.println("6:Generate Bill");
                    System.out.println("7:Exit");

                    System.out.println("Enter your choice : ");
                    int serviceCode = sc.nextInt();
                    switch (serviceCode){
                        case 1 : {
                            arr.add("BS01");
                            break;
                        }
                        case 2 : {
                            arr.add("EF01");
                            break;
                        }
                        case 3 : {
                            arr.add("CF01");
                            break;
                        }
                        case 4 : {
                            arr.add("BF01");
                            break;
                        }
                        case 5 : {
                            arr.add("GF01");
                            break;
                        }
                        case 6 : {
                            Bill bill = new Bill(carService , arr);
                            int sum = bill.calculateBill();
                            System.out.println(bill);
                            return;
                        }
                        case 7 : {
                            return;
                        }
                        default:{
                            System.out.println("Enter valid service code");
                            break;
                        }
                    }
                }
            }
            public static void main(String[] args) {


                System.out.println("************************************* WELCOME TO CAR SERVICE STATTION ***************************************************");

                while(true) {
                    System.out.println("Select the options below to do particular Tasks : ");
                    System.out.println("1:To Select the Car : ");
                    System.out.println("2: Exit ");
                    System.out.print("Enter your choice : ");
                    int caseNo = sc.nextInt();
                    sc.nextLine();
                    switch (caseNo) {
                        case 1: {
                            System.out.println("Select the type of car for Servicing : ");
                            System.out.println("1:HatchBack");
                            System.out.println("2:SUV");
                            System.out.println("3:Sedan");
                            System.out.println("Enter your choice : ");
                            int carChoice = sc.nextInt();
                            ArrayList<String> arr = new ArrayList<>();
                            switch (carChoice){
                                case 1 : {
                                    CarService carService = new Hatchback();
                                    carServiceCase(carService , arr);
                                    break;
                                }

                                case 2 : {
                                    CarService carService = new SUV();
                                    carServiceCase(carService , arr);
                                    break;
                                }
                                case 3 : {
                                    CarService carService = new Sedan();
                                    carServiceCase(carService , arr);
                                    break;
                                }
                            }

                        }
                        case 2:{
                            return;
                        }
                        default:{
                            System.out.println("Select the suitable option : ");
                            break;
                        }
                    }
                }

            }
        }

}