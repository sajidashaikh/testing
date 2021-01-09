package New;

import java.util.*;

import day3.classattribute.assignday6.HashMapexam;


public class Example6 {
	public static void main(String[] args) {
		
		HashMapexam name1 = new HashMapexam(411001,"pune");
		HashMapexam name2 = new HashMapexam(412101,"Dehuroad");
		HashMapexam name3 = new HashMapexam(400030,"Mumbai");
	
		
		  Map<Integer,HashMapexam> restuarantMap=new HashMap<>();
		
		

	        HashMapexam.put(name1.getPincode(),name1);
	        HashMapexam.put(name2.getPincode(),name2);
	        HashMapexam.put(name3.getPincode(),name3);
	        
	
		
		  Set<Integer> set= HashMapexam.keySet();
		  
		  
		  for(Integer name:set)
	        {
	            HashMapexam restuarant=HashMapexam.get(name);
	            System.out.println("Pincode = "+HashMapexam.getPincode() + ", Bill Amt. = "+restuarant.getBillAmt());
	        }
		
		/*for(HashMapexam i:set) {
			System.out.println(codes);*/	
		}
		
		
		
	}
		
	

