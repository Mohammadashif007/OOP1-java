// ! find even and odd number

// class EvenOdd{
//     String checkEvenOdd(int number){
//         return (number % 2 == 0)? "Even": "Odd";
//     }
//     public static void main(String[] args) {
//         EvenOdd obj = new EvenOdd();
//         System.out.println(obj.checkEvenOdd(9));
//         System.out.println(obj.checkEvenOdd(10));
//     }
// }


//! calculate area of circle

// public class CircleArea {

//     double calculateCircleArea(double radius){
//         return Math.PI * radius * radius;
//     } 

//     public static void main(String[] args) {
//         CircleArea area = new CircleArea();
//         System.out.println(area.calculateCircleArea(2));
//     }
// }


// ! Find the maximum of two number


// class FindMax {
//     int maxNumber(int x, int y){
//         return (x > y)? x : y;
//     }
//     public static void main(String[] args) {
//         FindMax num = new FindMax();
//         System.out.println(num.maxNumber(58, 6));
//     }
    
// }

// ! Reverse String

// public class ReverseString {
//     String reverse(String str){
//         String reversed = "";
//         for(int i = str.length()-1; i >= 0; i--){
//             reversed= reversed + str.charAt(i);
//         }
//         return reversed;
//     }

//     public static void main(String[] args) {
//         ReverseString str = new ReverseString();
//         System.out.println("Reversed string:" + str.reverse("hello"));
       
//     }
    
// }

// ! method overloading ; calculate area

public class AreaCalculator{
    // ! area of squire
    double calculateArea(double side){
        return side * side;
    }

    // ! area of circle
    double calculateAreaCircle(double radius){
        return Math.PI * radius * radius;
    }

    //! area of rectangle
    double calculateArea(double side, double breadth){
        return side * breadth;
    }



    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();
        System.out.println("Area of squire "+ area.calculateArea(5));
        System.out.println("Area of Circle "+ area.calculateAreaCircle(5));
        System.out.println("Area of Rectangle "+ area.calculateArea(4, 5));
    }
}
