package com.bendy;
public class Ronaldo {
    protected String religion;
    protected String dribbling;
    protected double height;
    public Ronaldo(String religion, String dribbling, double height2) {
        this.religion = religion;
        this.dribbling = dribbling;
        this.height = height2;
    }
    public void header() {
        System.out.println("the player is heading the ball");
    }
    public void displayinfo() {
        System.out.println("religion" + religion);
        System.out.println("dribbling" + dribbling);
        System.out.println("height" + height);
    }
}
class Mbape extends Ronaldo{
    protected int pace;
    public Mbape(String religion,String dribbling,double height,int pace){
        super(religion,dribbling,height);
        this.pace = pace;
    }    
    
    
    public void speed() {
        System.out.println("the player is runnig at a great speed");
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("pace" + pace);
    }
}
