package edu.northeastern.priya.Question1;

public interface iBorrowable {


    public void setBorrowDate(int day);
    public void setReturnDate(int day);
    public boolean isAvailable(int day);
}
