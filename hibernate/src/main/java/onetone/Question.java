package onetone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Question {
@Id
private int qid;
private String qname;

@OneToOne
@JoinColumn(name="aid")
private Answer ans;
public Question(int qid, String qname, Answer ans) {
	super();
	this.qid = qid;
	this.qname = qname;
	this.ans = ans;
}
public Answer getAns() {
	return ans;
}
public void setAns(Answer ans) {
	this.ans = ans;
}
public int getQid() {
	return qid;
}
public Question() {
	super();
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public Question(int qid, String qname) {
	super();
	this.qid = qid;
	this.qname = qname;
}
}