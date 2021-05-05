//被觀察者 (被追蹤的對象)
interface Observerable {
    void reg(Observer o); //註冊觀察者
    void Unreg(Observer o); // 取消註冊觀察者
    void Status(); //觀察者有誰(Users)
}
