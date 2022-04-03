package LabSession_9_9_2021;
import java.util.ArrayList;
public class ListExamples {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Jack");
		names.add("Jack");
		names.add("Jack");
		names.add("Jack");
		names.add("Jack");

		System.out.println(names);

		ArrayList<ArrayList<String>> nameOfObj = new ArrayList<ArrayList<String>>();


		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>()); nameOfObj.get(2).add("David");
		nameOfObj.get(2).add("Jack");

		nameOfObj.get(0).add("Ana");

		System.out.println(nameOfObj);

		}
		}
