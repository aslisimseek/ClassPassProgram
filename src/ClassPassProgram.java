import java.util.Scanner;

public class ClassPassProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Math Note..     :");
        int mathNote = scanner.nextInt();


        System.out.print("Physics Note..  :");
        int physicsNote = scanner.nextInt();


        System.out.print("Chmistry Note..   :");
        int chmistryNote = scanner.nextInt();


        System.out.print("Music Note..       :");
        int musicNote = scanner.nextInt();

        int lessonCount=0;
        int total=0;
        if (mathNote>=0 && mathNote<=100){
            total+=mathNote;
            lessonCount+=1;
        }
        if (physicsNote>=0 && physicsNote<=100){
            total+=physicsNote;//Total =total+fizik not
            lessonCount+=1;
        }

        if (chmistryNote>=0 && chmistryNote<=100){
            total+=chmistryNote;
            lessonCount+=1;
        }

        if (musicNote>=0 && musicNote<=100){
            total+=musicNote;
            lessonCount+=1;
        }




        int avarage = total / lessonCount;
        System.out.println("Your Avarage..     :" + avarage);

        if (avarage >= 55) {
            System.out.println("Pass the class");
        } else
            System.out.println("Fail the class");



    }
}
