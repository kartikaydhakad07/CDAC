

class InstanceCounter{

    public int a;
    static int count = 0;


    public InstanceCounter(){
        InstanceCounter.count ++;

    }

    public InstanceCounter(int a){
        this.a = a;

         InstanceCounter.count ++;

    }









    public static void main(String args []){

        InstanceCounter c = new InstanceCounter();
        InstanceCounter c1 = new InstanceCounter();
        InstanceCounter c2 = new InstanceCounter(4);

        System.out.println(c.count);

    }
}