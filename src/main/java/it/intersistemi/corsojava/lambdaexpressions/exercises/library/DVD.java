package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

public class DVD extends Library {

	private int minutesDuration;

	public DVD(String productTitle, int publicationYear, Data loanStartDate, Data loanEndDate, String firstNameUser, String lastNameUser, int minutesDuration) {
		super(productTitle, publicationYear, loanStartDate, loanEndDate, firstNameUser, lastNameUser);
		this.minutesDuration = minutesDuration;
	}

	public int getMinutesDuration() {
		return minutesDuration;
	}

	public void setMinutesDuration(int minutesDuration) {
		this.minutesDuration = minutesDuration;
	}

}


