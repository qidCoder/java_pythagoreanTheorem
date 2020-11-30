public class Pythagorean{
    // calculate the value of c given legA and legB
    public double sideC(int legA, int legB){
        double c = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return c;
    }    
}