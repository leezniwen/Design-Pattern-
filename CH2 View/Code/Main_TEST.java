import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

//建立觀察者模式  Ex 消息更新所有訂閱的使用者接收到更新

class Company implements Observerable {
    
    List<Observer> list = new ArrayList<Observer>();
    @Override
    public void reg(Observer o) {
        list.add(o);
        System.out.print("Notice--------新增帳號: "); // 
        o.updata();
    }

    @Override
    public void Unreg(Observer o) {
        list.remove(o);
        System.out.print("Notice--------移除帳號: "); // 
        o.updata();
    }

    @Override
    public void Status() {
        
    }
    
    
}

class User_A implements Observer {
    String Name;
    void  name(String name){
        this.Name = name ;
    }
    String getName(){
        return Name;
    }
    @Override
    public void updata() {
        System.out.println(Name);
    }
    
}

class User_B implements Observer {
    
    String Name;
    void  name(String name){
        this.Name = name ;
    }
    String getName(){
        return Name;
    }
    @Override
    public void updata() {
        System.out.println(Name);
    }
    
}

public class Main_TEST {
    public static void main(String[] args) {
        Company company = new Company();
        User_A user_A = new User_A();
        User_B user_B = new User_B();
        user_A.name("Lejlkjkle"); 
        user_B.name("Firefox");
        company.reg(user_A);
        company.reg(user_B);
        company.Unreg(user_B); 
        company.Status();
        
    }
}
