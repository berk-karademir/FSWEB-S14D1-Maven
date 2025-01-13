import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;


public class Main {
    private static final String MSG_PREFIX ="Related instance to string >>> ";

    public static void main(String[] args) {
        System.out.println("------***    CIRCLE INPUTS   ***-------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());


        br();
        System.out.println("------***    CYLINDER INPUTS   ***-------");
        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());


        br();
        System.out.println("------***    POOL INPUTS   ***-------");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid;
        cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        br();
        System.out.println("------***    DEV COM   ***-------");
        br();
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1,"Berk", 10.00);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2,"Ali", 20.00);
        JuniorDeveloper juniorDeveloper3 = new JuniorDeveloper(3,"Hasssaann", 25.00);

        juniorDeveloper1.work();
        juniorDeveloper2.work();
        juniorDeveloper3.work();
        printDev(MSG_PREFIX, juniorDeveloper1);
        printDev(MSG_PREFIX, juniorDeveloper2);
        printDev(MSG_PREFIX, juniorDeveloper3);

        br();
        MidDeveloper midDeveloper1 = new MidDeveloper(1,"Ahmet",30.00);
        MidDeveloper midDeveloper2 = new MidDeveloper(1,"Selim",30.00);
        midDeveloper1.work();
        midDeveloper2.work();
        printDev(MSG_PREFIX, midDeveloper1);
        printDev(MSG_PREFIX, midDeveloper2);


        br();
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(1, "Gökhan", 40.00);
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(1, "Emre", 40.00);
        SeniorDeveloper seniorDeveloper3 = new SeniorDeveloper(1, "Ömer Faruk", 40.00);

        seniorDeveloper1.work();
        seniorDeveloper2.work();
        printDev(MSG_PREFIX, seniorDeveloper1);
        printDev(MSG_PREFIX, seniorDeveloper2);

        HRManager hrManager1 = new HRManager(1, "Belinay",50.00,
                new JuniorDeveloper[3],
                new MidDeveloper[5],
                new SeniorDeveloper[2]);
        br();
        System.out.println(hrManager1);
        hrManager1.addEmployee(0, juniorDeveloper1);
        hrManager1.addEmployee(1, juniorDeveloper2);
        hrManager1.addEmployee(0, midDeveloper1);
        hrManager1.addEmployee(0, seniorDeveloper1);
        hrManager1.addEmployee(1, seniorDeveloper2);
        hrManager1.addEmployee(1, seniorDeveloper3);
        hrManager1.addEmployee(0, midDeveloper2);
        hrManager1.addEmployee(0, juniorDeveloper3);
        System.out.println(hrManager1);


    }

    private static void printDev(String prefix, JuniorDeveloper juniorDeveloper) {
        System.out.println(prefix + juniorDeveloper);
    }
    private static void printDev(String prefix, MidDeveloper midDeveloper) {
        System.out.println(prefix + midDeveloper);
    }
    private static void printDev(String prefix, SeniorDeveloper seniorDeveloper) {
        System.out.println(prefix + seniorDeveloper);
    }
    private static void br() {
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}