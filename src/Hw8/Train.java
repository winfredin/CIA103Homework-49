package Hw8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

//    public int getNumber() {
//        return number;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public String getStart() {
//        return start;
//    }
//
//    public String getDest() {
//        return dest;
//    }
//
//    public double getPrice() {
//        return price;
//    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	@Override
	public int compareTo(Train o) {
		return Integer.compare(this.number, o.number)*-1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public String toString() {
		return number + " " + type + " " + start + " " + dest + " " + price;
	}

	public static void main(String[] args) {
		Train[] train = new Train[7];
		
		train [0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train [1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train [2] = new Train(118, "自強", "高雄", "台北", 500);
		train [3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train [4] = new Train(122, "自強", "台中", "花蓮", 600);
		train [5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train [6] = new Train(1254, "區間", "屏東", "基隆", 700);

//		請寫一隻程式,能印出不重複的Train物件
		
		Set<Train> set1=new LinkedHashSet();
		for (Train e:train) {
			set1.add(e);
		}
		for (Train t : set1) {
		    System.out.println(t);
		}
	    System.out.println();
	    


		// literator
//        Iterator<Train> iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//		// for
//		List<Train> list = new ArrayList<>(set); // 為了使用get方法 要把set轉list
//		for (int i = 0; i < list.size(); i++) {
		
//		}

//		 for-each
//        for (Train aTrain:set1) {
//		    System.out.println(aTrain);
		
//		請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		
		PriorityQueue<Train> pq1=new PriorityQueue<Train>();
		for (int j = 0; j < train.length; j++) {
			pq1.add(train[j]);
		}
		Train et;
		while ((et=pq1.poll())!=null) {
			System.out.print(et+"\n");
		}
	    System.out.println();
	
//		承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		Set<Train> set2=new TreeSet<>();
		List<Train> tl=Arrays.asList(train);
		for(Iterator<Train> i1=tl.iterator();i1.hasNext();) {
			set2.add(i1.next());
		}
		
		for (Train t : set2) {
		    System.out.println(t);
		}		
	}
}
