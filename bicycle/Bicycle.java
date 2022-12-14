package bicycle;

public class Bicycle{

    private int gear;
    private int speed;

    public Bicycle(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int gearShift){
        this.gear = gearShift;
    }
    public int getGear(){
        return this.gear;
    }
    public void applyBrake(int decrementVal){
        this.speed  -= decrementVal;
    }
    public void applySpeed(int incrementVal){
        this.speed += incrementVal;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString(){
        return ("Bicycle's gear: " + 
                this.getGear() + "\nBicycle's speed: " + this.getSpeed());
    }

    // public static void main(String[] args){
    //     Bicycle normalBike = new Bicycle(100, 3);
    //     System.out.println(normalBike.toString());
    // }
}