/**
* O(n) time, O(n) space.
*/
public class Bhaveek_CountAndSay {

    public String countAndSay(int n) {

         String answer = "1";



        for(int i=1; i<n; i++) {

            //replace triplets

            answer = answer.replace("111", "cA");

            answer = answer.replace("222", "cB");

            answer = answer.replace("333", "cC");



            //replace doubles

            answer = answer.replace("11", "bA");

            answer = answer.replace("22", "bB");

            answer = answer.replace("33", "bC");



            //replace singles

            answer = answer.replace("1", "aA");

            answer = answer.replace("2", "aB");

            answer = answer.replace("3", "aC");



            //decode

            answer = answer.replace("a", "1");

            answer = answer.replace("b", "2");

            answer = answer.replace("c", "3");

            answer = answer.replace("A", "1");

            answer = answer.replace("B", "2");

            answer = answer.replace("C", "3");



        }



        return answer;

    }

}
