import java.util.Scanner;
public class Number2 {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        String sentence = main.nextLine();
        String newSentence="";
        int length = sentence.length();
            String[] sentence1 = new String [length];
            for(int m =0;m<length;m++){
                char a = sentence.charAt(m);
                sentence1[m] = ""+a;
                if(m%2!=0){
                    int b = Character.codePointAt(sentence,m);
                    sentence1[m] = ""+b;
                }
                newSentence = newSentence+sentence1[m] ;
            }System.out.println(newSentence);
            double x = (double)newSentence.length()/16;
            int y = newSentence.length()/16;
            int devided = y;
            if(x>y){
            devided = y+1;


            }
            int difference = devided*16 - newSentence.length();
            String sentence3[] = new String[newSentence.length()+difference];
            String newSentence3 = "";
            if(newSentence.length()<devided*16){
                for(int m = 0;m<sentence3.length;m++){
                    if(m<newSentence.length()){
                        sentence3[m] = "" + newSentence.charAt(m);
                    }else{
                        sentence3[m] = "?";
                    }

                }
            }
                for(int m = 0;m<sentence3.length;m++){
                    newSentence3 = newSentence3 + sentence3[m];
                }



            String sentence2[]= new String [newSentence3.length()];
            String newSentence2 ="";
            for(int m = 0;m<sentence2.length;m++){
                char d = newSentence3.charAt(m);
                sentence2[m] = ""+d;
                if(m%devided==0 && m>0 ){
                    sentence2[m] ="-"+ newSentence3.charAt(m);
                }
                newSentence2 = newSentence2 + sentence2[m];
            }
            String [] a = newSentence2.split("-");
           
        String [][] matrix = new String [4][4];
        int n = 0;
        for(int m = 0;m<4;m++){
            for(int j = 0;j<4;j++){
                matrix[m][j] = a[n];
                n++;
            }
        }
        for(int m = 0;m<4;m++){
            for(int j = 0;j<4;j++){
                System.out.printf(matrix[m][j]+ "\t");
            }System.out.println();
        }

        }
    }



