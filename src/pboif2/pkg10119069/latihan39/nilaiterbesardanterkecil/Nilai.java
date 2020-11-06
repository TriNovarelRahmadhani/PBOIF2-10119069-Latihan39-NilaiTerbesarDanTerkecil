/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Nilai {
    Scanner scanner = new Scanner(System.in);
    int[]nilai = new int [10];
    int n;
    int max = 0;
    int min = 0;

    public int inputBanyakNilai(){
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        n = scanner.nextInt();
        return n;
    }
    public void inputNilai(){
        for(int i=1; i<=n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " = ");
            nilai[i] = scanner.nextInt();
        }
    }

    public void outputNilai(){
        for(int i=1; i<=n; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    public int max (){
        max=nilai[1];
        for (int i =1; i <=n; i++){
            if (nilai[i] > max) {
                max= nilai[i];
            }
        }
        return max;
    }

    public int min (){
        min=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] < min) {
                min=nilai[i];
            }
        }
        return min;
    }
}
