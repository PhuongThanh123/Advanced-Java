package main;

import java.util.ArrayList;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:21 AM
 */
public class ScoreFinal {

	private String commentHomeroom;
	private String commentTeacher;
	private double scorePractic;
	private double scoreQuiz;
	public ArrayList<Scorelesson> m_Scorelesson;

	public ArrayList<Scorelesson> getM_Scorelesson() {
		return m_Scorelesson;
	}

	public void setM_Scorelesson(ArrayList<Scorelesson> m_Scorelesson) {
		this.m_Scorelesson = m_Scorelesson;
	}

	public ScoreFinal() {

	}

	public double calTotalFinalSubject() {
		double total = 0;
		total = calTotalPersonalScore() * 0.3 + scoreQuiz * 0.4 + scorePractic
				* 0.3;
		return total;

	}

	/**
	 * @return total final subject of trainee
	 */
	public double calTotalPersonalScore() {
		double total = 0;
		for (int i = 0; i < m_Scorelesson.size(); i++) {
			total += m_Scorelesson.get(i).calTotalScoreLesson();
		}
		return total / m_Scorelesson.size();
	}

	public String getCommentHomeroom() {
		return commentHomeroom;
	}

	public void setCommentHomeroom(String commentHomeroom) {
		this.commentHomeroom = commentHomeroom;
	}

	public String getCommentTeacher() {
		return commentTeacher;
	}

	public void setCommentTeacher(String commentTeacher) {
		this.commentTeacher = commentTeacher;
	}

	public double getScorePractic() {
		return scorePractic;
	}

	public void setScorePractic(double scorePractic) {
		this.scorePractic = scorePractic;
	}

	public double getScoreQuiz() {
		return scoreQuiz;
	}

	public void setScoreQuiz(double scoreQuiz) {
		this.scoreQuiz = scoreQuiz;
	}

	public ScoreFinal(String commentHomeroom, String commentTeacher,
			double scorePractic, double scoreQuiz,
			ArrayList<Scorelesson> m_Scorelesson) {
		super();
		this.commentHomeroom = commentHomeroom;
		this.commentTeacher = commentTeacher;
		this.scorePractic = scorePractic;
		this.scoreQuiz = scoreQuiz;
		this.m_Scorelesson = m_Scorelesson;
	}

	@Override
	public String toString() {
		String s = "\n-----------Detail Score of Trainee of Subject-----------\n";
		// s+=trainee.toString();
		s += "\tComment of Homeroom: " + commentHomeroom
				+ "\n\tComment of Teacher: " + commentTeacher
				+ "\n\tScore Quiz: " + scoreQuiz + "\n\tScore Practic:"
				+ scorePractic;
		s += "\n--------Total PersonalScore: " + calTotalPersonalScore()
				+ "----------";

		return s;
	}

}