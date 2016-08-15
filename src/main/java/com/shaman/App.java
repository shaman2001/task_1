package com.shaman;

import java.util.*;
import java.util.regex.Pattern;


public class App 
{
    public static void main( String[] args )
    {	String istr = new String ();
    	Scanner sc = new Scanner (System.in);
    	Pattern pattern1 = Pattern.compile("^\\d+(\\+|\\-|\\*|\\/)\\d+$"); //паттерн проверки введенной строки
    	Pattern pattern2 = Pattern.compile("\\+|\\-|\\*|\\/"); //паттерн наличия символов арифметических операций 
    	System.out.println( "Целочисленный калькулятор" );
        System.out.println( "Введите выражение для вычисления (например 11*24");
        if (sc.hasNext(pattern1)){ //ждет ввод строки примера и проверяет на соответствие паттерна1
        	istr = sc.next(); //присвоение введенной строки переменной
        } else {
        	System.out.println( "Вы ввели какую-то ерунду" ); //вывод сообщения об ошибке ввода
        	return;
        }
        String[] res = pattern2.split(istr); //разделение введенной строки на 2 подстроки по 
        Calculator calc = new Calculator(); //инициализация класса калькулятора
        calc.setA(Integer.valueOf(res[0])); //присвоение значений полям
        calc.setB(Integer.valueOf(res[1]));
        if (istr.contains("+")) { //проверка на арифм операцию (+-*/) и в зависимости вывод ответа на консоль
        	System.out.println( "Ответ:" + calc.getSum()); //логичнее через matcher (потом переделаю)
        } else if (istr.contains("-")) {					//вроде работает
        	System.out.println( "Ответ:" + calc.getDiff());
        } else if (istr.contains("*")) {
        	System.out.println( "Ответ:" + calc.getMult());
        } else if (istr.contains("/")) {
        	System.out.println( "Ответ:" + calc.getDiv());
        }
    }
}
