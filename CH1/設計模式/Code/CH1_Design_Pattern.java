
public class CH1_Design_Pattern {
    
    public static class Car{
        String Car_Name ; 
        int Car_cc ; 
        String car_color ; 

        public  Car( String car_name , String Type){
            this.Car_Name = car_name ;
            process(Type);
        }
        
        void process(String type){
            
            this.Car_cc =  cc();
            this.car_color= color();
        }
        
        private int cc()    {
            return 1000;
        }

        private String  color(){
            
            return "RED";
        }

        void chg_color(String chg_color) {
            this.car_color =  chg_color ;
        }
        


        public String get_Result() {
            String Result ; //結果
            Result = "車子名稱:"+this.Car_Name+ "\n多少cc:"+ this.Car_cc+"\n車子顏色:" + this.car_color ;

            return Result ;
        }
        
        
        
        

        
    }
     
     public static void main(String[] args) {
       Car A = new Car("SuperCar" , "Super");
       A.chg_color("Blue");
        System.out.println(A.get_Result());
    }
}