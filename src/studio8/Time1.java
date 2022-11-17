package studio8;

import java.util.Objects;

public class Time1 {
	public Time1(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	private int hour;
	private int minute;
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time1 other = (Time1) obj;
		return hour == other.hour && minute == other.minute;
	}
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]";
	}
	public static void main(String[] args) {
		Time1 t1= new Time1 (21,9);
		System.out.println(t1);
	}
}