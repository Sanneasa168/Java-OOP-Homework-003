

//  Class MathSoverrimp implements or inherit from Interface MathSolver
public class MathSolverimp implements MathSolver{

    @Override
    //        method sum have aravags
    public int sum(int... numbers) {
        // Declear Variable
       int sum =0;
       for(int tem:numbers){
           sum +=tem;
       }
       return sum;
    }

    @Override
    //  Method subtract have parameter a and b
    public int  subtract(int a,int b) {
       return  a-b;
    }

    @Override
    // Method multiple have parameter a and b
    public int  multiply(int a,int b) {
       return  a*b;
    }

}
