package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course2 {
	@Id
	private int cid;
	private String cname;
	private String cduration;

	@ManyToMany
	private List<Student2> student;

	public Course2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course2(int cid, String cname, String cduration, List<Student2> student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.student = student;
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

	public List<Student2> getStudent() {
		return student;
	}

	public void setStudent(List<Student2> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course2 [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + ", student=" + student + "]";
	}

}
