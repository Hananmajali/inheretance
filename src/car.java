
    public class car extends Vehicle  {
        public static int Price=2000;
        public static int id=0;



//        public  car(){
//            System.out.println(car.Price);
//            System.out.println(car.id);
//        }

        public  car(int price,int id,int wheels,String color){
            super(wheels,color);
            this.Price=price;
            this.id=id;
        }

        public static void getInfo(){
            car.id++;

            System.out.println(car.id);

        }
        public static void main(String [] args){
////        System.out.println(wheels);
//        Vehicle hanan= new Vehicle();
//        hanan.getwheels();
//        Vehicle hiba= new Vehicle(2,"red");
//        hiba.getwheels();
////      System.out.println(hanan.wheels)
////        System.out.println("hello in our 2nd project");
            car.getId();
            car.getwheels();
            car hanan = new car(4000,2,4,"white");
            hanan.getInfo();

        }



        car hanan = new car();
//

    }


