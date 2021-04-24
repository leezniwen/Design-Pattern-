package CH1.設計模式.Code;

class Electricity_Car implements Behavior  {

    @Override
    public String Content() {
        return "超跑";
    }

    @Override
    public String Action() {
        return "規格:1000馬力 自動輔助系統";
    }

    public String Result(){
        
        System.out.println(Content()+"\n" + Action());
        return "" ;
    }
    
}
