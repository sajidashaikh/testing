package com.zensar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import com.zensar.bean.Student;
import com.zensar.utility.DBUtil;

public class StudentRepository {
	public void addStudent(Student student) {
		Connection con = (Connection) DBUtil.getMySqlDbConnection();
		String sql = "insert into student values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setInt(1, student.getRollno());
			pst.setString(2,student.getName());
			pst.setString(3,student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5,student.getAge());
			pst.setString(6,student.getGender());
			pst.setString(7, student.getHometown());
			int result = pst.executeUpdate();
			if(result==0) {
				System.out.println("Database Operation Failed");
				
			}else {
				System.out.println("Database operation Successful");
			}
			
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e);
		}
	}
	public List<Student>getAllStudent(){
		List<Student>listOfAllStudent = new ArrayList<Student>();
		Connection con = (Connection) DBUtil.getMySqlDbConnection();
		String sql = "select * from student";
		try {
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int rollno = rs.getInt("roll_number");
				String studentName  =rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String hometown = rs.getString("hometown");
				Student student = new Student(rollno,studentName,course,duration,age,gender,hometown);
				listOfAllStudent.add(student);
			}
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e);
		}
		
		return listOfAllStudent;
		
	}
	 public void deleteStudent(int rollno) {
	    	Connection con=(Connection) DBUtil.getMySqlDbConnection();
	    	String sql = "delete from student where roll_number=?";
	    	try {
				PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
				pst.setInt(1, rollno);
				int result = pst.executeUpdate();
				if(result==0) {
					System.out.println("Deletion failed");
					
				}
				else {
					System.out.println("Deletion success");
				}
			} catch (SQLException e) {
				System.out.println("Exception Occurerd:" +e);
			}
	    	
	    }
	  public Student getStudent(int rollno) {
		  Student student = null;
	    	// jdbc code to connect to database and fetch employee details with this id
	    	Connection con = (Connection) DBUtil.getMySqlDbConnection();
	    	String sql = "select * from student where roll_number=?";
	    	try {
				PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
				pst.setInt(1, rollno);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					String Name= rs.getString("student_name");
					String Course = rs.getString("course");
					int Duration = rs.getInt("duration");
					int Age = rs.getInt("age");
					String gender = rs.getString("gender");
					String Hometown = rs.getString("hometown");
					student = new Student(rollno, Name, Course, Duration,Age, gender, Hometown);
				}
			} catch (SQLException e) {
				System.out.println("Exception Occured:" +e);
			}
	    	return student;
	  }
}
