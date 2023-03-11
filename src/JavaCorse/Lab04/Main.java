package JavaCorse.Lab04;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {

        // 1 Часть
        for( int i = 1; i < 101;i++){   // 1 Задание
            if(i % 2 == 1){
                System.out.println(i);
            }
        }

        for( int i = 1; i < 101;i++){   // 2 Задание
            if(i % 3 == 0){
                System.out.println("Делится на 3: " + i);
            }
            if(i % 5 == 0){
                System.out.println("Делится на 5: " + i);
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Делится и на 3 и на 5: " + i);
            }

        }

        Scanner in = new Scanner(System.in); // 3 Задание
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int sum = in.nextInt();

        if(num1 + num2 == sum){
            System.out.println("Результат: true");
        }


        System.out.println("Введите первое число: ");// 4 Задание
        num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = in.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("Результат: true");
        }


        int[] arr = new int[]{3,-3,7,4,5,4,3};   //Задание 5
        System.out.println("Массив: " + Arrays.toString(arr));
        if(arr[0] == 3 || arr[arr.length-1]==3){
            System.out.println("true. Первый или последний элемент = 3 ");
        }

        for(int i = 0; i < arr.length;i++){  // Задание 6
            if(arr[i] == 1 || arr[i] == 3){
                System.out.println("Массив содержит число - " + arr[i]);
            }
        }

        // 2 Часть

        int[] array = new int[]{1,2,3,4,5,6,7,8};   // 1 Задание
        System.out.println("Массив: " + Arrays.toString(array));
        boolean status = true;
        for(int i = 0 ; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                status = false;
                break;
            }
        }
        if(status == true){
            System.out.println("OK");
        }else{
            System.out.println("Please, try again");
        }

        System.out.println("Array length: ");   // 2 Задание
        int arrLen = in.nextInt();
        int[] ints = new int[arrLen];
        for(int i = 0 ; i < ints.length; i++){
            ints[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ints));

        int[] arrChange = new int[]{5,6,7,2};   // 3 Задание
        System.out.println("Array 1: " + Arrays.toString(arrChange));
        int[] changedArr = ChangeArray(arrChange);
        System.out.println("Array 2: " + Arrays.toString(changedArr));


        int[] uniqe = new int[]{1,5,2,3,0,2,4,3,5,7,4,8};   // 4 Задание
        System.out.println("Массив уникальности: " + Arrays.toString(uniqe));

        for (int i = 0 ; i < uniqe.length; i++){
            boolean uniq = false;
            for(int j = 0 ; j < uniqe.length;j++){
                if(uniqe[i] == uniqe[j] && i != j){
                    uniq=false;
                    break;
                }
                uniq=true;
            }
            if(uniq == true){
                System.out.println("Уникальное число: " + uniqe[i]);
                break;
            }
        }
        Random random = new Random();   // 5 Задание
        int[] randArray = new int[10];
        for (int i = 0 ; i < randArray.length;i++){
            randArray[i] = random.nextInt(100);
        }
        System.out.println("Рандомный массив: " + Arrays.toString(randArray));
        int[] result = Sorting(randArray);
        System.out.println(Arrays.toString(result));
    }



    public static int[] ChangeArray(int[] arr){
        int c = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = c;
        return arr;
    }

    public static int[] Sorting(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        left = Sorting(left);
        right = Sorting(right);

        return Parts(left, right);


    }

    private static int[] Parts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }
}