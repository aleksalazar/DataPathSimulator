package salazar.cs3354.txstate.edu.datapathsimulator;

public abstract class question {
    String question;
    int qID;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getqID() {
        return qID;
    }

    public void setqID(int qID) {
        this.qID = qID;
    }
}