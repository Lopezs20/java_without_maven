package bicycle;
public class App {
    public static void main(String[] args){
        Bicycle normalBike = new Bicycle(100, 3);
        System.out.println(normalBike.toString());
        MountainBike m_bike = new MountainBike(4,300, 5);
        System.out.println(m_bike.toString());

        m_bike.applyBrake(50);
        normalBike.applySpeed(36);
        
        System.out.println(normalBike.toString());
        System.out.println(m_bike.toString());

    }
}
