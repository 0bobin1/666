public class Yase {

    enum Pf{first,second,third,forth};
    Pf KIND;
    public int gongjili =1000;//攻击力属性
    public int  fangyu=800;//防御属性
    public Pf pfzl;


    public static void main(String[] args) {
    Yase Yase=new Yase();
    Yase.pfzl=Pf.second;
        System.out.println(Yase.pfzl);



    }



     public void jineng1(){
        System.out.println("一技能");
    }
     public  void jineng2(){
        System.out.println("二技能");
    }
     public  void jineng3(){
        System.out.println("三技能");
    }
}
