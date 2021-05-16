package homework7;



interface StartStop{
    void start();
    void stop();
}

class  Elevator implements StartStop{

    @Override
    public void start() {
        System.out.println("Elevator start");
    }

    @Override
    public void stop() {
        System.out.println("Elevator stop");
    }
}


class Conference implements StartStop{


    @Override
    public void start() {
        System.out.println("Conference start");
    }

    @Override
    public void stop() {
        System.out.println("Conference stop");
    }
}
public class TestStartStop {
    public static void main(String[] args) {
        StartStop[]ss={new Elevator(),new Conference()};
        for (int i =0; i<ss.length;i++){
            ss[i].start();
            ss[i].stop();
        }
        System.out.println("programe over");
    }

}