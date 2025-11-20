
class Rectangle {
    public double width;
    public double height;
}
class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.width = 5.0;
        rect1.height = 3.0;
        rect2.width = 7.5;
        rect2.height = 4.2;    
        double area1 = rect1.width * rect1.height;
        double area2 = rect2.width * rect2.height;      
        System.out.println("aire du rectangle 1 : " + area1);
        System.out.println("aire du rectangle 2 : " + area2);     
        System.out.printf("aire du rectangle 1 : %.2f%n", area1);
        System.out.printf("aire du rectangle 2 : %.2f%n", area2);
    }
}