package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zensar.bean.Question;
import com.zensar.utility.DBUtil;

public class AdminRepository {
	public void updateQuestion(Question question){
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update question set question=?, option1=?, option2=?, option3=?, option4=?,answer=? where question_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, question.getQuestions());
			pst.setString(2, question.getOption1());
			pst.setString(3, question.getOption2());
			pst.setString(4, question.getOption3());
			pst.setString(5, question.getOption4());
			pst.setString(6, question.getAnswer());
			pst.setInt(7, question.getQid());
			pst.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e);
		}
		
	}
}
