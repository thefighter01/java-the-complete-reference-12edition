package src;

public class VarDemo {
    public static void main(String[] args) {
        var avg = 10.0; // local variable type interface , we consider it as a datatype

        System.out.println(avg);
        int var = 1; // here we use it as an identifier
        System.out.println("the value of var is " + var);
        var k = -var;
        System.out.println("the value of k is " + k);


        /// to create an array we must don't use brackets because the java compiler inferred
        // var arr = new int[10];
        // when you use var as a datatype we must give it a value
        // var current ; // this is wrong
       // var myArray = {1 , 2 ,3}; // this wrong
        var myArray = new int[]{1,2,3,4,5}; // we can do it in this way
        System.out.println("the value of myArray is " + myArray);


        var myArr = new int [10];



    }
}
