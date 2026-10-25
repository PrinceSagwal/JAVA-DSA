import java.util.*;

public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        name = sc.next();//Prints only first name
        name=sc.nextLine();//Print whole line or name

        System.out.println(name);

        sc.close();
    }
}


