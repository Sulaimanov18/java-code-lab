package day_7;

public class calculator {

    private int total;
    public calculator(){
        this.total = 0;
    }
    public void add(int num){
        this.total+=num;
    }
    public void add(int num1, int num2){
        this.total+=num1+num2;
    }
    public void subtract(int num){
        this.total -=num;
    }



    public void printTotal(){
        System.out.println(total);
    }

}
