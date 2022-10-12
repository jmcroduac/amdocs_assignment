package day15_assignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course_Table")
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="course_id")
    private int courseId;
    
    @Column(name="course_name")
    private String courseName;
    
    @Column(name="duration_weeks")
    private int duration;
    
    @Column(name="course_fee")
    private int courseFee;


	public Course() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public Course(String courseName, int duration, int courseFee) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getCourseFee() {
		return courseFee;
	}


	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

}


