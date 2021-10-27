package edu.northeastern.priya;

class Printer{
    private static Printer single_instance =null;


    public void getConnection(){
        System.out.println("Your printer is Working");
    }


    public static Printer getInstance()
    {
        if (single_instance == null)
            single_instance = new Printer();

        return single_instance;
    }

}

class Main{

    public static void main(String args[]){
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();

        p1.getConnection();
    }
}