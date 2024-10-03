package Hw8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Train3 implements Comparable<Train3> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train3(int number, String type, String start, String dest, double price) {
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
		return number + " " + type + " " + start + " " + dest + " " + price;
	}

	@Override
	public int compareTo(Train3 other) {
		return Integer.compare(this.number, other.number);
	}

	public static void main(String[] args) {
		Train3 a = new Train3(202, "普悠瑪", "樹林", "花蓮", 400);
		Train3 b = new Train3(1254, "區間", "屏東", "基隆", 700);
		Train3 c = new Train3(118, "自強", "高雄", "台北", 500);
		Train3 d = new Train3(1288, "區間", "新竹", "基隆", 400);
		Train3 e = new Train3(122, "自強", "台中", "花蓮", 600);
		Train3 f = new Train3(1222, "區間", "樹林", "七堵", 300);
		Train3 g = new Train3(1254, "區間", "屏東", "基隆", 700);

		Set<Train3> set = new TreeSet<>(new Comparator<Train3>() {

			@Override
			public int compare(Train3 t1, Train3 t2) {
				int numberCompare = Integer.compare(t2.getNumber(), t1.getNumber());
				if (numberCompare != 0) {
					return numberCompare;
				}
				return t1.getType().compareTo(t2.getType());
			}
		});

		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);
		set.add(g);

		// literator
//	      Iterator<Train3> iterator = set.iterator();
//	      while (iterator.hasNext()) {
//	          System.out.println(iterator.next());
//	      }

		// for
		List<Train3> list = new ArrayList<>(set); // set 轉 list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// for-each
//		for (Train3 ctrain : set) {
//			System.out.println(ctrain);
//		}
	}
}
