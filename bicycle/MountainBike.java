package bicycle;

public class MountainBike extends Bicycle {
    
    private double seatHeight;

    public MountainBike(int startGear, 
                        int startSpeed, 
                        double startHeight){
    super(startSpeed, startGear);
    this.seatHeight = startHeight;
    }

    public void setHeight(double newHeight){
        this.seatHeight = newHeight;
    }
    public double getSeatHeight(){
        return this.seatHeight;
    }

    @Override
    public String toString(){
        return ("Mountain bike's gear: " + 
                this.getGear() + "\nMountain bike's speed: " + this.getSpeed()
                + "\nMountain bike's seat height: " + this.getSeatHeight());
    }

}
