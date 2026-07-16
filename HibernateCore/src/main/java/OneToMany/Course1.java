package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course1 {
	@Id
	private int cid;
	private String cname;
	private String cduration;

	@ManyToOne
	private Student1 student;

	
	public Course1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCduration() {
		return cduration;
	}


	public void setCduration(String cduration) {
		this.cduration = cduration;
	}


	public Student1 getStudent() {
		return student;
	}


	public void setStudent(Student1 student) {
		this.student = student;
	}


	public Course1(int cid, String cname, String cduration, Student1 student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.student = student;
	}


	@Override
	public String toString() {
		return "Course1 [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + ", student=" + student + "]";
	}

	
}
