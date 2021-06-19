package exam;
class  Juxing  {
    private  double  chang;
    private  double  kuan;
    public  double  getChang()  {
        return  chang;
    }
    public  void  setChang(double  chang)  {
        this.chang  =  chang;
    }
    public  double  getKuan()  {
        return  kuan;
    }
    public  void  setKuan(double  kuan)  {
        this.kuan  =  kuan;
    }
    public  double  area(){
        return  chang*kuan;
    }
}


class  ChangFangTi  extends  Juxing{

    private  double  gao;

    public double getGao() {
        return gao;
    }

    public void setGao(double gao) {
        this.gao = gao;
    }
    public  double  tiji(){
        return   area()*gao;
    }

}
public class aaa {

    public  static  void  main(String[]  args){
        ChangFangTi  a=new  ChangFangTi();
        a.setChang(12);
        a.setKuan(10);
        a.setGao(5);
        System.out.println("chang  fang  ti  di  mian  ji:"+a.area());
        System.out.println("chang  fang  ti  ti  ji:"+a.tiji());
    }
}
