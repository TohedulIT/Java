public class gittest{
    public static void main(String[] args){
        int age = 25;
        double price = 10.2;
        char grade = 'A';
        boolean isJavaFun = true;
        String message = "Hello";
        //System.out.println("Age:  " + age + " | Price: " + price + " | Grade: " + grade + " | IsJavaFun: " + isJavaFun + " | Message: " + message);
        System.out.println(String.format("Age: %d | Price: %.2f | Grade: %c | Is Java Fun: %b | Message: %s ", age, price, grade, isJavaFun, message ));

    }
}
