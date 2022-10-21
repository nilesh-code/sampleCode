import java.util.Arrays; 
 import java.util.*;
 import java.util.stream.*; 

public class TimeTask{

 public static void main(String args[]) {

LocalTime time= LocalTime.now();

String str= String.valueOf(time);

if(time.isAfter(LocalTime.of("12:00")) && time.isBefore(LocalTime.of("18:00")))
{  System.out.println("It's midday");}
else{ 
System.out.println("It's midnight");
}

Arrays.stream(str.split(":")).forEach(i>{

int first_digit Integer.valueOf(1).intValue()/10;
int second_digit Integer.valueOf(1).intValue()*10;

printNumbersInWords (first_digit, second_digit);});
}

public static void printNumbersInWords (int first_digit, int second_digit){

if (first_digit ==1){
switch(second_digit % 10) {

case 0: System.out.print(ten"); break; 
case 1: System.out.print(" eleven"); break;
case 2: System.out.print(" twelve"); break;

case 3: System.out.print(" thirteen"); break; 
case 4: System.out.print(" fourteen"); break;

case 5: System.out.print(" fifteen"); break; 
case 6: System.out.print(" sixteen"); break;

case 7: System.out.print(" seventeen"); break; 
case 8; System.out.print(" eighteen"); break;

case 9: System.out.print(" ninteen"); break;
}} 
else {

switch(first_digit % 10){
 case 1: System.out.print("ten"); break;
case 2: System.out.print(" twenty"); break;
case 3: System.out.print(" thirty"); break;
case 4: System.out.print(" forty"); break;
case 5: System.out.print(" fifty"); break; case 6: System.out.print(" sixty"); break;
case 7: System.out.print(" seventy"); break;
case 8: System.out.print(" eighty"); break;
case 9: System.out.print(" ninety"); break;
}
switch(second_digit %10){
case 1:System.out.print("eleven");break;
case 2: System.out.print("twelve"); break;
case 3: System.out.print(" thirteen"); break;
case 4: System.out.print(" fourteen"); break;
case 5: System.out.print(" fifteen"); break;
case 6: System.out.print( sixteen"); break;
case 7: System.out.print("seventeen");break; 
case 8: System.out.print( eighteen"); break;
case 9: System.out.print("ninteen"); break;
}
}
else{
switch(first_digit % 10) {
case 1: System.out.print(" ten"); break;
case 2: System.out.print(" twenty"); break; 
case 3: System.out.print(" thirty"); break;
case 4: System.out.print(" forty"); break;
case 5: System.out.print(" fifty"); break; 
case 6: System.out.print(" sixty"); break;
case 7: System.out.print(" seventy"); break;
case 8: System.out.print(" eighty"); break;
case 9: System.out.print(" ninety"); break;
}
switch(second digit % 10){
 case 0: break;
case 1: System.out.print("one"); break;
 case 2: System.out.print("two"); break;
case 3: System.out.print(" three"); break;
case 4: System.out.print("four"); break; 
case 5: System.out.print("five"); break;
case 6: System.out.print("six"); break;
case 7: System.out.print(" seven"); break; 
case 8: System.out.print("eight"); break;
case 9: System.out.print("nine"); break;
}
}
}
}
