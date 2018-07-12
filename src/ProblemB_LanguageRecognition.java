import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB_LanguageRecognition {

    public static void main(String[] args) throws IOException{

        //for input getting
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //for output
        String outputString="";

        //get test case
        int test=Integer.parseInt(br.readLine());

        if(test<=10)
        {
            for(int i=0;i<test;i++)
            {
                //getting sheep language
                String sheepLanguage=br.readLine();

                //to count a's
                int count=0;

                //for final res
                boolean bChk=false;
                lb:
                for(int j=0;j<sheepLanguage.length();j++)
                {
                    //check current char is 'a' or not
                    if(sheepLanguage.charAt(j)=='a')
                    {
                        count++;
                    }

                    //when more than two
                    if(count>=2)
                    {
                        bChk=true;
                        break lb;
                    }
                }

                if(bChk)
                {
                    outputString+="Case "+(i+1)+":Accept, "+sheepLanguage+"\n";
                }
                else {

                    outputString+="Case "+(i+1)+":Reject"+"\n";
                }
            }

            //final output
            System.out.println(outputString);
        }
    }
}
