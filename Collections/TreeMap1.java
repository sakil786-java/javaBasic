package Collections;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		
		String code1=sectionNo.concat(lectureNo);
		String code2=o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
}
public class TreeMap1 {

	public static void main(String[] args) {
		Map<Code,String> m1=new TreeMap<>();
		m1.put(new Code("S01","L03"), "Generics");
		m1.put(new Code("S01","L01"), "files under java");
		m1.put(new Code("S02","L03"), "Network Programming");
		m1.put(new Code("S01","L07"), "OOPS");
		m1.put(new Code("S01","L05"), "Methods");
		m1.put(new Code("S01","L03"), "Expressions");
		 
		for(Map.Entry<Code, String> e:m1.entrySet())
		{
			System.out.println("Key :"+e.getKey()+" Value : "+e.getValue());
		}

	}
	//In case of String .equals() works properly but in case of Custom object .equals not work;
	//String class override the .equals() method and hashCode()

}
