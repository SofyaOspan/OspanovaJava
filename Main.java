1) Task Make up an algorithm

public class Main {

    public static void main(String[] args) {
        helloWord();
        nameSearch();
        arraySearch();
    }

    // If the entered number is greater than 7, then print “Hello” 
    
    static void helloWord() {
        int num_1;
        if (num_1 > 7) {
            System.out.println("Hello");
        }
    }

   //If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name" 
    
   static void nameSearch() {
        String search_John;
        if (search_John.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }
    }

    //There is a numeric array at the input, it is necessary to output array elements that are multiples of 3 
    
    static void arraySearch() {
        int[] array_num;
        for (int i = 0; i < array_num.length; i++) {
            int num = array_num[i];
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}


2) Answer the questions:
Given bracket sequence: [((())()(())]]
Can this sequence be considered correct?
If the answer is “no”, then what needs to be changed in it to make it correct?


No, this sequence is not correct. Since there is a message from the compiler:
"Syntax error on token ')'", delete this token (Java error 1610612968).

Bug description: the sequence starts with one opening bracket `[` but ends with two closing brackets `]]`.

There are two ways to fix it:
a) Replace the last bracket `]` with `)`, resulting in [(())()(())]
b) Replace the first `(` with `[`, resulting in [[(())()(())]]


3) Bonus points:
+ the ability to run the received program
++ interactive input of values for processing and output of processed data (via the console)



import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        helloWord(scanner);
        nameSearch(scanner);
        arraySearch(scanner);

        scanner.close();

    }
 // If the entered number is greater than 7, then print “Hello”
static void helloWord(Scanner scanner){
    System.out.println("Необходимо ввести число (алгоритм сработает, если число > 7): ");
int num_1 = scanner.nextInt();
scanner.nextLine();
if (num_1 >7) {
    System.out.println("Hello");
}
    }

     // If the entered name matches “John”, then output “Hello, John”, else print "There is no such name"
static void nameSearch(Scanner scanner){  
 System.out.println("Необходимо ввести имя (алгоритм сработает, если имя будет John) ");
String search_John = scanner.nextLine();
    if (search_John.equals("John")) {
        System.out.println("Hello, John");
    } else {
        System.out.println("There is no such name");
    }
}
//There is a numeric array at the input, it is necessary to output array elements that are multiples of 3 
static void arraySearch(Scanner scanner){
    System.out.print("Необходимо ввести элемент массива (алгоритм сработает, если элемент будет кратен 3) ");
  int size = scanner.nextInt();
        int[] array_num = new int[size]; //new  - потому что массив

for (int i = 0; i < array_num.length; i++) { // заполнение массива цифрами, которые юзер вводит 
    array_num[i] = scanner.nextInt();
}


for (int i=0; i<array_num.length;i++) { //перебор цикла и вывод числа, который кратен 3
    int num = array_num[i];
if (num % 3 == 0) {
    System.out.println(num);
}}


}
}