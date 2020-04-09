package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book extends Library {

	private int chapterIndex = 0;
	private int chaptersNumber = 0;
	private String chapterTitle;
	private String chapterContent;
	private int pagesNumber;

	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	public Book(String productTitle, int publicationYear, Data loanStartDate, Data loanEndDate, String firstNameUser, String lastNameUser, int chapterIndex, int chaptersNumber, String chapterTitle, String chapterContent, int pagesNumber) {
		super(productTitle, publicationYear, loanStartDate, loanEndDate, firstNameUser, lastNameUser);
		this.chapterIndex = chapterIndex;
		this.chaptersNumber = chaptersNumber;
		this.chapterTitle = chapterTitle;
		this.chapterContent = chapterContent;
		this.pagesNumber = pagesNumber;
	}

	public int getChapterIndex() {
		return chapterIndex;
	}

	public void setChapterIndex(int chapterIndex) {
		this.chapterIndex = chapterIndex;
	}

	public int getChaptersNumber() {
		return chaptersNumber;
	}

	public void setChaptersNumber(int chaptersNumber) {
		this.chaptersNumber = chaptersNumber;
	}

	public String getChapterTitle() {
		return chapterTitle;
	}

	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}

	public String getChapterContent() {
		return chapterContent;
	}

	public void setChapterContent(String chapterContent) {
		this.chapterContent = chapterContent;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public void addChapter() throws IOException {
		String newChapterTitle;
		String newChapterContent;
		this.chapterIndex += 1;
		this.chaptersNumber += 1;
		newChapterTitle = ConsoleInputString.readString(console, "Insert chapter title: ");
		chapterTitle = newChapterTitle;
		newChapterContent = ConsoleInputString.readString(console, "Insert chapter content: ");
		chapterContent = newChapterContent;
	}

	@Override
	public String toString() {
		return "Book{" +
				"chapterIndex=" + chapterIndex +
				", chaptersNumber=" + chaptersNumber +
				", chapterTitle='" + chapterTitle + '\'' +
				", chapterContent='" + chapterContent + '\'' +
				", pagesNumber=" + pagesNumber +
				'}';
	}

	public static void main(String[] args) throws IOException {
		Book chapter = new Book(
				"Programmin Java Manual",
				2016,
				new Data(01, 01, 2019),
				new Data(01, 03, 2019),
				"firstNameUser",
				"lastNameUser",
				1,
				10,
				"OOP development",
				"Object oriented programming",
				500
		);

		for(int index = 0; index < 2; index++) {
			chapter.addChapter();
			System.out.println(chapter);
		}

	}
}
