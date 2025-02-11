class FreshJuice {
    FreshJuiceSize size;
    
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        
        System.out.println(juice.size);
    }
}