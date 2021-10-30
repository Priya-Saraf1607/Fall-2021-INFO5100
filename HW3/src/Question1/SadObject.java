package Question1;

public class SadObject extends MoodyObject{
    @Override
    String getMood() {
        return "sad";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’ ");

    }
    @Override
    public String toString(){
        return "Subject cries a lot ";
    }
}
