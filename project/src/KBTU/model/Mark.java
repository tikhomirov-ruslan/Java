package KBTU.model;//package java.KBTU.model;

import java.io.Serializable;

public class Mark implements Serializable {
	double att1;
	double att2;
	double finalExam;
	public Mark() {

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(att1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(att2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(finalExam);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		if (Double.doubleToLongBits(att1) != Double.doubleToLongBits(other.att1))
			return false;
		if (Double.doubleToLongBits(att2) != Double.doubleToLongBits(other.att2))
			return false;
		if (Double.doubleToLongBits(finalExam) != Double.doubleToLongBits(other.finalExam))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mark [att1=" + att1 + ", att2=" + att2 + ", finalExam=" + finalExam + "]";
	}
}
