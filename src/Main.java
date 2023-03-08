import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("nhập 1 để đổi ừ độ C->F");
            System.out.println("nhập 2 để đổi ừ độ F->C");
            input = scanner.nextInt();
            switch (input){
                case 1 :
                    System.out.println("nhập độ C: ");
                    Double c = scanner.nextDouble();
                    Double result1 = 1.8*c+32;
                    System.out.println("kết quả là : "+ result1);
                    break;
                case 2:
                    System.out.println("nhập độ F: ");
                    Double f = scanner.nextDouble();
                    Double result2 = (f-32)*5/9;
                    System.out.println("kết quả là : "+ result2);

                    break;
                default: break;
            }
        }while (input!=1 && input!=2);


    }
}