package Hw8;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Train2 implements Comparable<Train2>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train2(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}
	
    @Override
    public String toString() {
        return number +" "+ type +" "+ start +" "+ dest +" "+ price;
    }
    
    @Override
    public int compareTo(Train2 other) {
        return Integer.compare(this.number, other.number);
    }

	public static void main(String[] args) {
		Train2 a = new Train2(202, "普悠瑪", "樹林", "花蓮", 400);
		Train2 b = new Train2(1254, "區間", "屏東", "基隆", 700);
		Train2 c = new Train2(118, "自強", "高雄", "台北", 500);
		Train2 d = new Train2(1288, "區間", "新竹", "基隆", 400);
		Train2 e = new Train2(122, "自強", "台中", "花蓮", 600);
		Train2 f = new Train2(1222, "區間", "樹林", "七堵", 300);
		Train2 g = new Train2(1254, "區間", "屏東", "基隆", 700); 

		List<Train2> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g); 
		
		Collections.sort(list, new Comparator<Train2>() {
			@Override
			public int compare(Train2 t1, Train2 t2) {
				int numberCompare = Integer.compare(t2.getNumber(), t1.getNumber());
				if (numberCompare != 0) {
					return numberCompare;
				}
				return t1.getType().compareTo(t2.getType());
			}
		});

		//literator
      Iterator<Train2> iterator = list.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
      
      //for
//      for (int i = 0; i < list.size(); i++) {
//      	  System.out.println(list.get(i));
//      }
      //for-each
//		for (Train2 train : list) {
//		    System.out.println(train);
//		}
	}
}
