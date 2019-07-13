public class Iphone extends Mobile {
    @Override
    public void call(String message) {
        if(message.length()>10){
            System.out.println("<iPhone>Message : [your input message]"+message);
        }else {
            System.out.println("<iPhone> Message cannot be sent");
        }
    }
}
