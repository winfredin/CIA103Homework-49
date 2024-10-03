package Hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.math.BigInteger;

public class Hw8_1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Integer(10));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
//literator
		System.out.println(list);
		Iterator objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		
//for
		for (int i = 0; i < list.size(); i++) {
		Object obj = list.get(i);
		System.out.println(obj);
	}
		
//for-each
		for (Object  li : list) {
			System.out.println(li);
		}
		
		System.out.println();
		
//判斷是否為Number物件
		int i = 0;
		while (i < list.size()) {
            Object obj = list.get(i);
			if (!(obj  instanceof Number)) {
				list.remove(i);
			}else {
                i++;
            }
		}
//印出剩下的Number物件檢查
		for (Object  li : list) {
			System.out.println(li);
		}
	}
}
