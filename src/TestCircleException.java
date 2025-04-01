public class TestCircleException {

    public static void main(String[] args){
        try{
            CircleException c1 = new CircleException(2);
            CircleException c2 = new CircleException(-2);
            CircleException c3 = new CircleException(3);
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception);
        }
    }
}
