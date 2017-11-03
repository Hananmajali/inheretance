public class Vehicle {
 public String color="basic Color";
    public static int wheels=4;

    public  Vehicle(){
        System.out.println("hello in our 2nd project");
    }

    public  Vehicle(int wheels2,String color2){
        this.wheels=wheels2;
        this.color=color2;
        System.out.println("hello in our 2nd project");
    }
    public static void getwheels(){
        System.out.println(Vehicle.wheels);
        System.out.println("this is my wheels");
    }



    public static void main(String [] args){
//        System.out.println(wheels);
        Vehicle hanan= new Vehicle();
        hanan.getwheels();
        Vehicle hiba= new Vehicle(2,"red");
        hiba.getwheels();
//      System.out.println(hanan.wheels)
//        System.out.println("hello in our 2nd project");
//        car.getId();
//        car.getwheels();
//        car hanan = new car();


    }


//    public void getFullname(){
//        System.out.println(Person.firstname + Person.lastname);
//    };
//Person ahmad = new Person("ahmad","hariri","amman",1983,"syrian","daraa",65,180,true);

}
