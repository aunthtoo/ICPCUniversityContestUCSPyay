import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC_SecretMessage {
    public static void main(String[] args) throws IOException {

        //for getting input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //input line
        String inputLine = br.readLine();

        //for output
        String outputString = "";

        while (!inputLine.equals("#")) {
            //key
            int key = Integer.parseInt(inputLine.split(":")[0]);

            //plaintext
            String plain = inputLine.split(":")[1];

            //check constraints
            if (key <= 1000000000 && plain.length() >= 1 && plain.length() <= 200) {

                //for encrypted String
                String encryptedStr="";

                for (int i = 0; i < plain.length(); i++) {
                    //for each character
                    int eachChar;

                    //check it is alpha
                    if (Character.isAlphabetic(plain.charAt(i))) {

                        //check lower case or upper
                        if (Character.isLowerCase(plain.charAt(i))) {

                            eachChar=plain.charAt(i)+key;

                            if(eachChar>'z')
                                eachChar=eachChar-'z'+('a'-1);
                            else if(eachChar<'a')
                                eachChar=('z'+1)-('a'-eachChar);

                        } else {

                            eachChar=plain.charAt(i)+key;

                            if(eachChar>'Z')
                                eachChar=eachChar-'Z'+('A'-1);
                            else if(eachChar<'A')
                                eachChar=('Z'+1)-('A'-eachChar);
                        }

                    }else if(Character.isDigit(plain.charAt(i))){

                        eachChar=plain.charAt(i)+key;

                        if(eachChar>'9')
                            eachChar=eachChar-'9'+('0'-1);
                        else if (eachChar<'0')
                            eachChar=('9'-1)-'0'-eachChar;

                    }else {

                        eachChar=plain.charAt(i);
                    }

                    encryptedStr+=(char)eachChar;

                }

                outputString+=encryptedStr+"\n";
            }


            inputLine = br.readLine();
        }

        System.out.println(outputString);


    }
}
