import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static int length_PassScore=0;
//    public static int  special_charactersScore=0;
//    public static int  uppercase_lowercase_Score=0;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


//--------------------- Exercise 1 --------------------------------------------
        System.out.println("------- Exercise 1 -----------------------");
        String [] word={"cat","dog","red","is","am"};
       int length=0;
       for(String w:word){if(w.length()>length){length=w.length();}}//to find length of the long word
        for(String longwprd :word){
            if(longwprd.length()==length)
           System.out.print(longwprd+"\t");
        }
        System.out.println("");
////------------------------------Exercise 2------------------------------------
 System.out.println("------- Exercise 2 -----------------------");
///*Write a program that displays the number of occurrences of an element in the array.*/

//
        int [] original={1,1,1,3,3,5};
        int times=0,i;
        System.out.println("Enter num to display occurrences of an element in the array ");
        int appear=input.nextInt();
        for( i =0;i<original.length;i++){
            if(appear==original[i]){times+=1;}}

        System.out.print(Arrays.toString(original)+"\n"+appear+" occurs "+times+" times");
        System.out.println("");


        //-----------------------------------------Exercise 3----------------


        /*3.Write a program to find the k largest elements in a given array. Elements in the array can be in
any order.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
3 largest elements of the said array are:
100 25 17*/
//--------------------------Exercise 3--------------------------
        System.out.println("------- Exercise 3 -----------------------");

        int []largest={1, 4, 17, 7, 25, 3, 100};
        System.out.print(Arrays.toString(largest)+"\n");
        Arrays.sort(largest);//sort array from smallest to biggest
        System.out.println("Enter k to extract k largest number ");
        int k=input.nextInt();
        for(int re=largest.length-1;re>=largest.length-k;re--){//start with last element which big element there
            System.out.print(largest[re]+" ");//print k numbers
        }
               // just to check if sort it or not




        //------------------------------Exercise 4-----------------------------------

        /*. Create a method to reverse an array of integers. Implement the method without creating a new
//array.
}*/

//-----------------------------------------------------Exercise 4-----------------
        System.out.println("");
        System.out.println("------- Exercise 4 -----------------------");
                int [] resrve={5,4,3,2,1};
        for (int ree = 0; ree < resrve.length / 2; ree++) {//solving by swapping elements
            int temp = resrve[ree];
            resrve[ree] = resrve[resrve.length - 1 - ree];
            resrve[resrve.length - 1 - ree] = temp;}for(int print:resrve){
            System.out.print(print+"\t");}
        System.out.print("\n");

                /*. Write a menu driven Java program with following option: */

/*1. Accept elements of an array
2. Display elements of an array
3. Search the element within array
4. Sort the array
5. To Stop
the size of the array should be entered by the user*/
boolean check=true;
        System.out.println("------- Exercise 5 -----------------------");
        System.out.println("Enter size of list");
        int [] element=new int[input.nextInt()];
do{
    System.out.println("1. Accept elements of an array");
    System.out.println("2. Display elements of an array");
    System.out.println("3. Search the element within array");
    System.out.println("4. Sort the array");
    System.out.println("5. To Stop");

    switch (input.nextInt()){
        case 1:
            System.out.println("Fill array");
            for(int a=0;a<element.length;a++){
                System.out.println("Enter element"+(a+1));
                element[a]=input.nextInt();}
            System.out.println("Array is full");
            break;
        case 2:
            System.out.println(Arrays.toString(element));
        break;
        case 3:
            System.out.println("Search element");
            int search=input.nextInt();
            for(int s:element){
                if(s==search){
                    System.out.println("We found an element "+s);break;
                }
                else {System.out.println("We Not found an element "+s);break;}
            }
        break;
        case 4:
            Arrays.sort(element);
        break;
        case 5:check=false;
        break;
    }
}while(check);
//----------------------------------Exercise 6
        System.out.println("------- Exercise 6 -----------------------");


/*6. Create a method that generates a random number within a given range. Allow the user to
specify the range and call the method to display random numbers.
Hint: use Random class*/
        System.out.println("Enter the minimum value of the range:");
        int mine=input.nextInt();
        System.out.println("Enter the maximum value of the range:");
        int maxe=input.nextInt();
        System.out.println("Enter the number of random numbers to generate");
        int num=input.nextInt();
        generate(mine,maxe,num);
//--------------------------------------------------Exercise 7------------
        /*Write a program that checks the strength of a password. Create a method that evaluates a
password based on criteria like length, inclusion of special characters, and uppercase/lowercase
letters.
- We have three methods: checkLength, checkSpecialCharacters, and
checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
- The totalScore is calculated by adding the scores from these methods.
- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
based on the totalScore.
- The criteria for scoring:
• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
(3 points).
• Special characters: Absence (0 points), Presence (2 points).
• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
points).
*/        System.out.println("------- Exercise 7 -----------------------");

        System.out.println("Please Enter Password ");
        String pass=input.next();
        pass=pass.replace(" ","");
        int totalScore=checkLength(pass)+checkSpecialCharacters(pass)+checkUpperCaseLowerCase(pass);
        System.out.println(totalScore);
        if(totalScore>=8){System.out.println("Passwprd is Strong ");}
        else if(totalScore>=5){System.out.println("Passwprd is Moderately ");}
        else {System.out.println("Passwprd is weak ");}



//-----------------------------------------------Exercise 8--------------------
        System.out.println("------- Exercise 8 -----------------------");
        System.out.println("Enter the number of Fibonacci terms to generate:");
       Fibonacci(input.nextInt());



//        //-----------------------------------------------
    }
    public static void generate(int min,int max,int num){
        for(int n=1;n<=num;n++) {
            System.out.print((int) ((Math.random() * (max - min)) + min)+"\t");
    }
        System.out.println("");       }

    public static int  checkLength(String pass){
        int length_PassScore=0;
if (pass.length()<=5){ length_PassScore=0;}
else if (pass.length()==6||pass.length()==7){ length_PassScore+=2;}
else  {length_PassScore+=3;}
    return length_PassScore;}
//-------------------------------------------------
public static int checkSpecialCharacters(String pass){
int special_charactersScore=0;
    String pattern = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
    Pattern p = Pattern.compile(pattern);

    Matcher m=p.matcher(pass);
    if(m.matches()){return special_charactersScore+=2;}
    else {return 0;}
       // return special_charactersScore;
}
public static int checkUpperCaseLowerCase(String pass){
int uppercase_lowercase_Score=0;
int absence=0;
    for(int i=0;i<pass.length();i++){
       if(Character.isUpperCase(pass.charAt(i))||Character.isLowerCase(pass.charAt(i))){
         absence+=1;
       }}
    if(absence!=0){uppercase_lowercase_Score+=3;}
    else{return uppercase_lowercase_Score;}

return uppercase_lowercase_Score;}

//-----------------------------
    //*8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
    //Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
    //and each subsequent number in the sequence is the sum of the two preceding ones.*//
public static void Fibonacci(int f) {

    //int[] fib=new int[f];
    int numZero = 0,numOne = 1,num3;

    if(f<=1){System.out.println(1);}
   else{ for (int fibo = 3; fibo <= f; fibo++) {// start with 3 because 1 and 2 not count
        num3=numOne+numZero;
        numZero=numOne;
        numOne=num3;
        System.out.print(num3+"\t");
    }
    }
}



}