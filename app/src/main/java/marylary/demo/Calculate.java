package marylary.demo;

public class Calculate {

    private double result =0;
    public Calculate effacer(){

        this.result = 0;
        return this;
    }


    public Calculate operation(double a, double b){
        this.result = this.result + a + b;

        return  this;
    }

    public  Calculate multiplication(double a, double b){

        if (this.result ==0){
            this.result = a * b;
            return  this;

        }
        this.result = this.result * a * b;
        return this;
    }



    public Calculate division(double a, double b){
        if(this.result == 0 && b != 0){
            this.result = a / b;
            return this;
        }
        if(a != 0 && b != 0){
            this.result = this.result / a / b;
            return this;
        }
        return this;
    }
    public Calculate soustration(double a, double b){
        this.result = this.result - a - b;
        return this;
    }
    public Calculate reste(double a, double b){
        if(this.result == 0 && b != 0){
            this.result = a % b;
            return this;
        }
        if(a != 0 && b != 0){
            this.result = this.result % a % b;
            return this;
        }
        return this;
    }


    public  int toInt(){
        return  (int) this.result;
    }

    //autre methode
    public  double toDouble(){
        return (double) this.result;
    }
}
