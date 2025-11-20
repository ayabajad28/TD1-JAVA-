class rec {
    private double width;
    private double height;
    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        if (w < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }
        width = w;
    } 
    public double getHeight() {
        return height;
    } 
    public void setHeight(double h) {
        if (h < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        height = h;
    }
    
    public double area() {
        return width * height;
    }
}
class Main {
    public static void main(String[] args) {
        rec rect1 = new rec();
        rec rect2 = new rec();    
        rect1.setWidth(5.0);
        rect1.setHeight(3.0);   
        rect2.setWidth(7.5);
        rect2.setHeight(4.2);  
        System.out.println("Aire du rectangle 1 : " + rect1.area());
        System.out.println("Aire du rectangle 2 : " + rect2.area());  
        try {
            rect1.setWidth(-2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}