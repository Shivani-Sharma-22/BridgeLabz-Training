public class MessageEncoder {

    public static void encodeMessage(String message) {

    	if(message==null) {
    		return;
    	}
        int length = message.length();

        
        if (length <= 4) {
            System.out.println("The string "+ message +" has minimum length");
            return;
        }
        if (message.contains(" ")) {
            System.out.println("The string " + message + " should not contain space");
            return;
        }
        String encoded = " ";
    	StringBuilder sb = new StringBuilder();
        for (char ch: message.toCharArray()) {


            sb.append((char)((ch-length)%256));
        }

        System.out.println("Encoded Message: " + sb);
    }
}
