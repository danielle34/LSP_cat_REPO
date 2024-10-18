package org.howard.edu.lsp.midterm.question1;

/**
 * The Book class represents a book in a library. It contains details such as the title, author, ISBN, and year published.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor for the Book class.
     *
     * @param title         the title of the book
     * @param author        the author of the book
     * @param ISBN          the ISBN number of the book (unique identifier)
     * @param yearPublished the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * This method returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the title of the book.
     *
     * @param title the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method eturns the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method sets the author of the book.
     *
     * @param author the author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method rreturns the ISBN number of the book.
     *
     * @return the ISBN number of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * This method sets the ISBN number of the book.
     *
     * @param ISBN the ISBN number of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * This method returns the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * This method sets the year the book was published.
     *
     * @param yearPublished the year the book was published
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * This method compares this book to another object. Two books are considered equal if they have the same ISBN and author.
     *
     * @param obj the object to compare this book to
     * @return true if the books have the same ISBN and author, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // checks if it is the same object
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
        }
        return false;
    }
    
    /**
     * This method returns a string rep of the book, including the title, author, ISBN, and year published.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}