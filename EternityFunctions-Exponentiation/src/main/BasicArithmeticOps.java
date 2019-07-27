package main;

public class BasicArithmeticOps {

  private double firstRealNumber;
  private  double secondRealNumber;

  public BasicArithmeticOps(double firstRealNumber, double secondRealNumber){
    this.firstRealNumber=firstRealNumber;
    this.secondRealNumber=secondRealNumber;
  }

  public double getFirstRealNumber() {
    return firstRealNumber;
  }

  public void setFirstRealNumber(double firstRealNumber) {
    this.firstRealNumber = firstRealNumber;
  }

  public double getSecondRealNumber() {
    return secondRealNumber;
  }

  public void setSecondRealNumber(double secondRealNumber) {
    this.secondRealNumber = secondRealNumber;
  }

  public double add(){
    return this.firstRealNumber+this.secondRealNumber;
  }

  public double subtract(){
    return this.firstRealNumber-this.secondRealNumber;
  }

  public double multiply(){
    return this.firstRealNumber*this.secondRealNumber;
  }

  public double divide(){
    return this.firstRealNumber/this.secondRealNumber;
  }

}
