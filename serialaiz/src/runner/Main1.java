package runner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import serialaiz.Student;

public class Main1 {

	public static void main(String[] args) {
		
		//byte resultArray[] = null;
		
		//ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//FileOutputStream fos = new FileOutputStream("c:\\D\\object.txt");	
		//ObjectOutputStream oss = null;
		Student st1 = new Student("Student1",20);
		st1.setGender(true);
		st1.id = 1;
		Student st2 = new Student("Student1",21);
		
		st2.setGender(true);
		st2.id = 2;
		ArrayList list = new ArrayList();
		list.add(st1);
		list.add(st2);
		
				try(FileOutputStream fos = new FileOutputStream("c:\\D\\object.txt");
						ObjectOutputStream oss = new ObjectOutputStream(fos)) {
		//oss = new ObjectOutputStream(bos);		
		//byte[] array = bos.toByteArray();
		//printResult(array);
					
				oss.writeObject(st);
				
				
				}catch (IOException e) {
					e.printStackTrace();
				}/* finally {
					try	{if
						(oss!=null) {
						oss.close();
						}
					}*/
			}
	
				
			public static void printResult(byte[] array) {
				if(array != null) {
					for (byte b: array) {
						//System.out.println("byte"+ b + "char" + (char) b);
						System.out.println((char) b);
					}
				}else {
					System.out.println("array is null");
				}
			}
		}

