package java8_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapClass {
	 public static void main(String[] args) {
		 
		        // TODO Auto-generated method stub
		        Map<Character, Runnable> m3 = new HashMap<Character, Runnable>();
		        m3.put('A',()-> System.out.print("Pass"));
		        m3.put('B', ()->System.out.print("out"));
		        m3.put('C', null);
		        while(true)
		        {
		            System.out.println("A  -> Apple");
		            System.out.println("B   -> Boy ");
		            System.out.println("c - > quit");
		       
		        char key = new Scanner(System.in).nextLine().charAt(0);
		        if (m3.containsKey(key))
		            m3.get(key).run();}
		 
		/*Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(200,"202not found");
		m.put(500,"some other err");
		m.put(501,"server_fault");
		m.put(404, "not found");m.put(null, "ABC");
		m.put(200,"ok");m.put(null, "AAA");m.put(111,null);
		System.out.println(m);
		Set<Integer> s = m.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			Integer s1 = it.next();
			String s2 = m.get(s1);
			System.out.println(s1 +"--->"+s2);
		}
		/*Set<Map.Entry<Integer,String>> e = m.entrySet();
		for(Map.Entry<Integer,String> e1: e)
			Integer code = e1.getKey();
			String value = e1.getValue();
			System.out.println(code + "" +value);*/
//		Set<Integer> s = m.;
//		Iterator<Integer> it = s.iterator();
//		while(it.hasNext()) {
//			Integer s1 = it.next();
//			String s2 = m.get(s1);
//			System.out.println(s1 +"--->"+s2);
//		}
		/*if(m.isEmpty()) {
			System.out.println("err");
			
		}else {
			System.out.println("no Err");
		}
		m.replace(200,"server ok");
		if(m.containsKey("404")) {
			System.out.println("http status 404");
		}
		String status = m.get(404);
		System.out.println("200 - "+status);
		Map<Integer,String> m1 = new HashMap<Integer,String>(m);
	 }*/
}
}
