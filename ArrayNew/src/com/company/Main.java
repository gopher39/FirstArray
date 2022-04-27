package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();   //задаем размер массива
    int[] mass = new int[n];

    for (int i = 0; i < n; i++)
        mass[i] = sc.nextInt(); //вводим массив с n количеством элементов

     int a = sc.nextInt();   //какой элемент масиива
     int b = sc.nextInt();  //на какой нужно заменить
     int c = mass[a];   // для замены воспользуемся аккумулятором
     mass[a] = mass[b]; //практика из Ассемблера
     mass[b] = c;

    for (int i =0; i < n; i++)
    System.out.println(mass[i]);  //выводим на печать измененный массив
    }
    }
