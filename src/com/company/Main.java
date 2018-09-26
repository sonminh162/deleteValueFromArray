package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size,i,value,newLength,j=0;
        int[] array,newArray;
        Scanner scanner = new Scanner(System.in);
        //nhap kich co cua mang, nhap phan tu va in ra
        System.out.print("Khai bao kich co cua mang:");
        size = scanner.nextInt();
        array = new int[size];
        System.out.print("nhap vao gia tri cho cac phan tu:\n ");
        for(i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.print("danh sach cac phan tu cua mang:\t");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        //xoa gia tri trong mang
        newLength = array.length;
        System.out.print("nhap vao gia tri can xoa:");
        value = scanner.nextInt();
        newArray = new int[size-1];
        for(i=0;i<array.length;i++){
            if(value == array[i])
                continue;
            else
            {
                newArray[j]=array[i];
                j++;
            }
        }
        System.out.print("in ra mang sau khi xoa:\t");
        for(j=0;j<array.length-1;j++)
        {
            System.out.print(newArray[j]+"\t");
        }

    }
}
