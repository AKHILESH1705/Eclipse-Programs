import java.util.Scanner;

public class basic {
    
    public static void main(String[] args) {
     
        int basic_salary,gross_salary,HRA,DA,PF;
        Scanner s = new Scanner(System.in);
        basic_salary = s.nextInt();
        String str = s.next();
        char ch = str.charAt(0); 
        HRA = (basic_salary*20)/100;
        DA = (basic_salary*50)/100;
        PF = (basic_salary*11)/100;

        if(ch=='A'){
            
            System.out.println((basic_salary + HRA + DA + 1700)-PF);      
        }
        else if(ch=='B'){
            gross_salary = ((basic_salary + HRA + DA + 1500)-PF);
            System.out.println(gross_salary);
        }
        else if(ch>='C' && ch<='Z'){
            gross_salary = ((basic_salary + HRA + DA + 1300)-PF);
            System.out.println(gross_salary);

        }

    }
}