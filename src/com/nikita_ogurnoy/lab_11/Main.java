package com.nikita_ogurnoy.lab_11;

import com.nikita_ogurnoy.lab_11.RandomCreator.*;
import org.omg.CORBA.portable.IndirectionException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        RandString randWord = null;
        RandText randText = null;

        try{

        System.out.println("        ГЕНЕРАТОР СЛУЧАЙНОГО ТЕКСТА");

        System.out.println("Введите минимальное и максимаольное ЧИСЛА СЛОВ в строках через пробел:");
        int minWordInRow = scr.nextInt();
        if (minWordInRow < 0) throw new IncorrectRangeException(IncorrectRangeException.type.nonNaturalValue);
        int maxWordInrow = scr.nextInt();
        if(maxWordInrow<minWordInRow) throw new IncorrectRangeException(IncorrectRangeException.type.minGreaterMax);
        RandInt wordInRow = new RandInt(minWordInRow,maxWordInrow);

        System.out.println("Введите минимальное и максимаольное ЧИСЛА СИМВОЛОВ в словах через пробел:");
        int minCharInWord = scr.nextInt();
        if (minCharInWord < 0) throw new IncorrectRangeException(IncorrectRangeException.type.nonNaturalValue);
        int maxCharInWord = scr.nextInt();
        if(maxCharInWord < minCharInWord) throw new IncorrectRangeException(IncorrectRangeException.type.minGreaterMax);
        RandInt charInWord = new RandInt(minWordInRow,maxWordInrow);

        System.out.println("Введите начальный и конечный КОДЫ СИМВОЛОВ алфавита из диапазона для генерации слов:");
        char minChar = (char) scr.nextInt();
        if (minChar < 0) throw new IncorrectRangeException(IncorrectRangeException.type.nonNaturalValue);
        char maxChar = (char) scr.nextInt();
        if(maxChar < minChar) throw new IncorrectRangeException(IncorrectRangeException.type.minGreaterMax);
        RandInt charR = new RandInt(minWordInRow,maxWordInrow);

        randWord = new RandString(minChar,maxChar,minCharInWord,maxCharInWord);
        randText = new RandText(minWordInRow,maxWordInrow, randWord);

        }
        catch (InputMismatchException e){
            System.out.println("Ошибка при вводе числа!");
        }
        catch (IncorrectRangeException e){
            System.out.println(e);
        }

        while (true){
            System.out.println("Введите число строк генерируемого текста (0 - чтобы выйти):");
            int rowNum = scr.nextInt();
            if (rowNum == 0) break;
            String t = randText.nextText(rowNum);

            System.out.println("Случайно сгенерированный текст:");
            System.out.println(t);

        }
    }
}
