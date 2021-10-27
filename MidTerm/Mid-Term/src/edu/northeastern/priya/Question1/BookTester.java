package edu.northeastern.priya.Question1;

public class BookTester {

    public static void main(String args[])
    {
        Fiction fiction1=new Fiction("Frankenstein",2.0,"2018");
        System.out.println(fiction1.description());
        fiction1.setBorrowDate(9);
        fiction1.setReturnDate(11);
        System.out.println(fiction1.isAvailable(10));

        NonFiction nonFiction=new NonFiction("Anne Frank",4.0,"2016");
        System.out.println(nonFiction.description());
        nonFiction.setBorrowDate(9);
        nonFiction.setReturnDate(11);
        System.out.println(nonFiction.isAvailable(10));

        Reference reference=new Reference("World Maps", 6.0,"2014");
        reference.setCategory("Encylopedia");
        System.out.println(reference.description());
        System.out.println(reference.getCategory());


    }
}
