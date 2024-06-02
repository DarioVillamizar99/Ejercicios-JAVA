public class Acceso_a_objetos {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
      }
    
      public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
      }
    
      public static void main(String[] args) {
        Acceso_a_objetos myCar = new Acceso_a_objetos();   
        myCar.fullThrottle();     
        myCar.speed(200);         
      }
}
