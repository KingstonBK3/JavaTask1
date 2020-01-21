/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 * 
 */
public class Task1 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int[][] Weather = new int[12][];
        Random rnd = new Random();
        Weather[0] =  new int[31]; // Январь
        Weather[1] =  new int[29]; // Феварль
        Weather[2] =  new int[31]; // Март
        Weather[3] =  new int[30]; // Апрель
        Weather[4] =  new int[31]; // Май
        Weather[5] =  new int[30]; // Июнь
        Weather[6] =  new int[31]; // Июль
        Weather[7] =  new int[31]; // Август
        Weather[8] =  new int[30]; // Сентябрь
        Weather[9] =  new int[31]; // Октябрь 
        Weather[10] =  new int[30]; // Ноябрь
        Weather[11] =  new int[31]; // Декабрь
        
        
        int max =0 ,min = 0, maxNumber = 0, minNumber = 0, sum = 0, element = 0;
        
        for(int i = 1; i < Weather.length; i++){
            for(int j = 1; j < Weather[i].length; j++){
                if(i == 0 || i == 1 || i == 11){ // Январь  Феварль  Декабрь
                    min = -30;
                    max = -5;
                }
                if (i == 2 || i == 3 || i == 4){ // Март Апрель Май
                    min = -5;
                    max = 10;
                }
                if(i == 5 || i == 6 || i == 7){ // Июнь Июль Август
                    min = 10;
                    max = 25;
                }
                if(i == 8 || i == 9 || i == 10){ // Сентябрь Октябрь  Ноябрь
                    min = -5;
                    max = 15;
                }
                   Weather[i][j] = rnd.nextInt(max - min + 1) + min; 
                   //System.out.printf("%-5d",Weather[i][j]);//Полный вывод всего массива для проверки
                   if (i == 0 && j == 0){
                      minNumber = Weather[i][j];
                   }
                   if (Weather[i][j]< minNumber) {
                        minNumber =  Weather[i][j];
                   }
                   if (Weather[i][j]>maxNumber) {
                       maxNumber = Weather[i][j];
                   }
                   sum += Weather[i][j];
                   element++;
            }
           
        }   
        
        
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        
        System.out.println("Температура: " + Weather[month-1][day-1]);
        
        int maxtemp = 0;
        int mintemp = 100;        
        for(int i = 0; i < Weather.length; i++){
            if(i == month){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(Weather[i][j] > maxtemp){
                            maxtemp = Weather[i][j];
                        }
                        if(Weather[i][j] < mintemp){
                            mintemp = Weather[i][j];
                        }
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(Weather[i][j] > maxtemp){
                            maxtemp = Weather[i][j];
                        }
                        if(Weather[i][j] < mintemp){
                            mintemp = Weather[i][j];
                        }
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(Weather[i][j] > maxtemp){
                            maxtemp = Weather[i][j];
                        }
                        if(Weather[i][j] < mintemp){
                            mintemp = Weather[i][j];
                        }
                    } 
                }  
            }
        }  
        
        System.out.println("Самая высокая температура: " + maxtemp);
        System.out.println("Самая низкая температура: " + mintemp);
        
        int avg = 0;
        for(int i = 0; i < Weather.length; i++){
            System.out.println("Месяц: " + i);
            if(Weather[i].length == 30){
                for(int j = 0; j < 30; j++){
                    avg = avg + Weather[i][j];
                }   
                avg = avg / 30;
                System.out.println("Среднее значение температуры: " + avg); 
            }else if(Weather[i].length == 29){
                for(int j = 0; j < 29; j++){
                    avg = avg + Weather[i][j];
                }
                avg = avg / 29;
                System.out.println("Среднее значение температуры: " + avg);
            }else if(Weather[i].length == 31){
                for(int j = 0; j < 31; j++){
                    avg = avg + Weather[i][j]; 
                } 
                avg = avg / 31;
                System.out.println("Среднее значение температуры: " + avg);
            }
        }
        
    }
}
