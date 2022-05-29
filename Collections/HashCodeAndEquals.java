
package Collections;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code2 implements Comparable<Code2>{
	private String sectionNo;
	private String lectureNo;
	public Code2(String sectionNo, String lectureNo) {
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
		return "Code2 [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code2 o) {
		
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
		Code2 other = (Code2) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
}
public class HashCodeAndEquals {

	public static void main(String[] args) {
		Map<Code2,String> m1=new TreeMap<>();
		m1.put(new Code2("S01","L03"), "Generics");
		m1.put(new Code2("S01","L01"), "files under java");
		m1.put(new Code2("S02","L03"), "Network Programming");
		m1.put(new Code2("S01","L07"), "OOPS");
		m1.put(new Code2("S01","L05"), "Methods");
		m1.put(new Code2("S01","L03"), "Expressions");
		
		Code2 c1=new Code2("S01","L01");
		Code2 c2=new Code2("S01","L01");
		System.out.println("Hash C1: "+c1.hashCode()+" Hash C2: "+c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		
		
		//For finding Value from key;
		System.out.println("Finding Value from key: ");
		
		System.out.println(m1.get(new Code2("S02","L03")));
		
		//For finding Key from Value;
		System.out.println("Finding Key from Value: ");
		
		Code2 code=null;
		
		for(Map.Entry<Code2, String> e:m1.entrySet())
		{
			if(e.getValue().equals("OOPS"))
			{
				code=e.getKey();
			}
		}
		System.out.println("Key for OOPS is: "+code);
		
		

	}

}
