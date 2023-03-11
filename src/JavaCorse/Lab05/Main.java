package JavaCorse.Lab05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String _longWord = "Самый длинный текст";  // 1 Задание
        System.out.println("1) " + _longWord + " - "+longWord(_longWord));


        String _palindrom = "Радар"; // 2 Задание
        System.out.println("2) " + _palindrom +" - "+ palindrom(_palindrom));


        String _replaceBadWord = "Бяка купила велосипед";  // 3 Задание
        System.out.println("3) " + _replaceBadWord + " - " + replaceBadWord(_replaceBadWord));


        String text1 = "Java это  язык программирования. У java есть свои преимущества.";   // 4 Задание
        String text2 = "java";
        int textCount = text1.toLowerCase().split(text2).length - 1;
        System.out.println("4) " + text1 + " / " + text2 +". Кол-во входов - " + textCount);

        String _invertString = "This is a test string";     // 5 Задание
        System.out.println("5) " + _invertString + " - " + invertString(_invertString));


    }

    public static String longWord(String str){  // Метод 1 задания
        String[] words = str.split(" ");
        int maxleng = 0;
        String word="";
        int index = -1;
        for(int i = 0; i < words.length;i++){
            if(words[i].length() > maxleng){
                index=i;
                word = words[i];
                maxleng=words[i].length();
            }
        }
        if(index != -1)
            return word;
        return "";
    }

    public static boolean palindrom(String str){    // Метод 2 задания
        str = str.toLowerCase();
        for(int i = 0 ; i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }

    public static String replaceBadWord(String str){    // Метод 3 задания.
        String[] words = str.split(" ");
        String normalStr="";
        for(int i = 0;i < words.length; i++){
            if(words[i].toLowerCase().equals("бяка")){
                words[i] = "[вырезано цензурой]";
            }
            normalStr = normalStr + words[i] + " ";
        }
        return normalStr;
    }

    public static String invertString(String str){  // Метод 5 задания
        String[] words = str.split(" ");

        String result="";
        for (int i = 0 ; i < words.length;i++){
            String word = "";
            for(int j = 0; j < words[i].length();j++){
                word = words[i].charAt(j) + word;
            }
            result = result + " " + word;
        }
        return result;
    }
}