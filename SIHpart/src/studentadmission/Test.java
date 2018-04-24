package studentadmission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
class Dog implements Comparable<Dog>{
	String color;
	int size;
 
	Dog(String c, int s) {
		color = c;
		size = s;
	}
 
	public String toString(){	
		return color + " dog";
	}
 
	@Override
	public int compareTo(Dog o) {
		return  (o.size>this.size)?1:0;
	}
}
public class Test {
	int t;
	Integer a;
	class B{
		int c;
	}
    
	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
	public static void main(String args[]) {
		List<Integer> li = new ArrayList<>();
		Vector v = new Vector();
		Collection c = new HashSet();
		Map<String,String>  mp = new HashMap<>();
		mp.put("1", "2");
		mp.put("1", "3");
		Set<Map.Entry<String, String>> m = mp.entrySet();
		for(Map.Entry<String,String> i : m) {
			System.out.println(i.getKey()+" "+i.getValue());
			Dog d1 = new Dog("red", 30);
			Dog d2 = new Dog("black", 20);
			Dog d3 = new Dog("white", 10);
			Dog d4 = new Dog("white", 10);
	 
			TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
			treeMap.put(d1, 10);
			treeMap.put(d2, 15);
			treeMap.put(d3, 5);
			treeMap.put(d4, 20);
	 
			for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		
	}
	

}
