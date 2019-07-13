public class Android extends Mobile{
    @Override
    public void call(String message) {
        if(message.length()<10){
            System.out.println("<Android>Message : [your input message]"+message);
        }else {
            System.out.println("<Android> Message cannot be sent");
        }
    }
}
