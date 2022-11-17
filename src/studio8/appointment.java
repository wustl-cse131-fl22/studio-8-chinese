package studio8;

import java.util.HashSet;
import java.util.Objects;


public class appointment {
	public appointment(Date a, Time1 b) {
		super();
		this.a = a;
		this.b = b;
	}
	private Date a;
	private Time1 b;
	@Override
	public String toString() {
		return "appointment [a=" + a + ", b=" + b + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		appointment other = (appointment) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1= new Date (2021,1,1);
		Date d2= new Date (2021,1,1);
		Date d3= new Date (2022,1,1);
		Time1 t1= new Time1 (21,9);
		Time1 t2= new Time1 (20,9);
		Time1 t3= new Time1 (19,9);
		appointment a1=new appointment(d1,t1);
		appointment a2=new appointment(d2,t2);
		appointment a3=new appointment(d3,t3);
		HashSet<appointment> set = new HashSet<appointment>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		System.out.println(set);
	}
}
