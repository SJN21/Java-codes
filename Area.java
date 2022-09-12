public class Area {
    int height,breadth,area;

    public void display(){
        System.out.println("The area is : "+area);
    }
    public static void main(String args[]){
        Area a1;
        a1=new Area();
        a1.height=54;
        a1.breadth=34;
        a1.area=(a1.height*a1.breadth);
        a1.display();
    }
}
