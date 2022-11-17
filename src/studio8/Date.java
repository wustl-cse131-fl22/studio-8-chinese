package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int year;
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	private int month;
	private int day;

    @Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public static void main(String[] args) {
		Date d1= new Date (2021,1,1);
		Date d2= new Date (2021,1,1);
		Date d3= new Date (2022,1,1);
		Date d4= new Date (2022,1,2);
		Date d5= new Date (2023,3,1);
		Date d6= new Date (2024,1,1);
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		System.out.println(set);
    }

}
