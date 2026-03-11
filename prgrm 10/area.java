import java.util.Scanner;
class Area {
     double findArea (double r) {
      return 3.14 * r * r;
      }
      double findArea (double l,double b)  {
      return l * b;
      }
      double findArea (int b,int h)  {
      return 0.5* b * h;
      }
      double findArea (int s)  {
      return s * s;
      }
      }
      public class area {
         public static void main (String[] args)   {
         Scanner sc = new Scanner (System.in);
         Area obj = new Area();
         System.out.println("Area of circle r=5: "+ obj.findArea(5.0));
         System.out.println("Area of rectangle(3,4):"+obj.findArea(3.0,4.0));
         System.out.println("Area of triangle(4,3): "+obj.findArea(4,3));
         System.out.println("Area of square:"+obj.findArea(5));
         }
         }
         
      
