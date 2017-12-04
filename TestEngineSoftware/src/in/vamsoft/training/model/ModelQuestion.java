package in.vamsoft.training.model;

import java.io.Serializable;

public class ModelQuestion implements Serializable {
 private int  QuestionNo ;
 private String Question;
 private String Option1;
 private String Option2;
 private String Option3;
 private String Option4;
 private String CorrectAnswer;
public int getQuestionNo() {
  return QuestionNo;
}
public void setQuestionNo(int questionNo) {
  QuestionNo = questionNo;
}
public String getQuestion() {
  return Question;
}
public void setQuestion(String question) {
  Question = question;
}
public String getOption1() {
  return Option1;
}
public void setOption1(String option1) {
  Option1 = option1;
}
public String getOption2() {
  return Option2;
}
public void setOption2(String option2) {
  Option2 = option2;
}
public String getOption3() {
  return Option3;
}
public void setOption3(String option3) {
  Option3 = option3;
}
public String getOption4() {
  return Option4;
}
public void setOption4(String option4) {
  Option4 = option4;
}
public String getCorrectAnswer() {
  return CorrectAnswer;
}
public void setCorrectAnswer(String correctAnswer) {
  CorrectAnswer = correctAnswer;
}
public ModelQuestion(int questionNo, String question, String option1, String option2, String option3, String option4,
    String correctAnswer) {
  super();
  QuestionNo = questionNo;
  Question = question;
  Option1 = option1;
  Option2 = option2;
  Option3 = option3;
  Option4 = option4;
  CorrectAnswer = correctAnswer;
}
public ModelQuestion() {
  super();
  // TODO Auto-generated constructor stub
}
@Override
public String toString() {
  return "ModelQuestion [QuestionNo=" + QuestionNo + ", Question=" + Question + ", Option1=" + Option1 + ", Option2="
      + Option2 + ", Option3=" + Option3 + ", Option4=" + Option4 + ", CorrectAnswer=" + CorrectAnswer + "]";
}
}
