package ke.co.safaricom.services;

public class Java_Spark {
    private String message;
    private int key;

    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Java_Spark() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt(){

        char[] message = this.getMessage().toUpperCase().toCharArray(); //Converting all inputs to upper case regardless of the user input
        String output = "";

        for( int i=0; i <message.length; i++){
            char c = message[i];

            if (Character.isLetter(c)) {
                int charPosition = this.alphabets.indexOf(c);
                int newPosition = (charPosition + this.getKey()) % 26;
                char newChar = this.alphabets.charAt(newPosition);

                output = output + newChar;

            } else {
                output = output + c;
            }

        }
        return output;

    }

    public String decrypt(){

        char[] message = this.getMessage().toUpperCase().toCharArray(); //Converting all inputs to upper case regardless of the user input
        String output = "";

        for( int i=0; i <message.length; i++){
            char c = message[i];

            if (Character.isLetter(c)) {
                int charPosition = this.alphabets.indexOf(c);
                int newPosition = (charPosition - this.getKey())%26 ;

                if (newPosition<0){
                    newPosition = alphabets.length() + newPosition;
                }
                char newChar = this.alphabets.charAt(newPosition);

                output = output + newChar;

            } else {
                output = output + c;
            }

        }
        return output;
    }
}