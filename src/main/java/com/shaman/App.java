package com.shaman;

import java.util.*;
import java.util.regex.Pattern;


public class App 
{
    public static void main( String[] args )
    {	String istr = new String ();
    	Scanner sc = new Scanner (System.in);
    	Pattern pattern1 = Pattern.compile("^\\d+(\\+|\\-|\\*|\\/)\\d+$"); //������� �������� ��������� ������
    	Pattern pattern2 = Pattern.compile("\\+|\\-|\\*|\\/"); //������� ������� �������� �������������� �������� 
    	System.out.println( "������������� �����������" );
        System.out.println( "������� ��������� ��� ���������� (�������� 11*24");
        if (sc.hasNext(pattern1)){ //���� ���� ������ ������� � ��������� �� ������������ ��������1
        	istr = sc.next(); //���������� ��������� ������ ����������
        } else {
        	System.out.println( "�� ����� �����-�� ������" ); //����� ��������� �� ������ �����
        	return;
        }
        String[] res = pattern2.split(istr); //���������� ��������� ������ �� 2 ��������� �� 
        Calculator calc = new Calculator(); //������������� ������ ������������
        calc.setA(Integer.valueOf(res[0])); //���������� �������� �����
        calc.setB(Integer.valueOf(res[1]));
        if (istr.contains("+")) { //�������� �� ����� �������� (+-*/) � � ����������� ����� ������ �� �������
        	System.out.println( "�����:" + calc.getSum()); //�������� ����� matcher (����� ���������)
        } else if (istr.contains("-")) {					//����� ��������
        	System.out.println( "�����:" + calc.getDiff());
        } else if (istr.contains("*")) {
        	System.out.println( "�����:" + calc.getMult());
        } else if (istr.contains("/")) {
        	System.out.println( "�����:" + calc.getDiv());
        }
    }
}
