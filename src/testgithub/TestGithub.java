/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgithub;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class TestGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();
        int sum;
        sum = a + b +c;
        System.out.println("tổng 3 số là: " + sum);

    }

}
