import java.util.*;
public static void main(string[]args) {
Random random = new Random(Scannerystem.in);
int randomnumber = random.nextInt(100)+1;
for(a=0; a<=5; a++){
    System.out.println("Enter your guess number:");
    Scanner sc=new Scanner();
    int guess=sc.nextInt();
    if(a<1 || a>100) {
        System.out.println("invalid");
    }
    else if(a==randomnumber){
    System.out.println("great");
    }
    else if(a<randomnumber){
        System.out.println("too low");
    }
    else if(a>randomnumber){
        System.out.println("too high");
    }

    
}


}
