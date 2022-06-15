interface CallBack{
    void calBack(int param);
}
class Client implements CallBack{
    public void calBack(int p){
        System.out.println("Call Back P is: "+p);
    }
    public void nonInFace(){
        System.out.println("Non Interface method");
    }
}
class AnotherClient implements CallBack{
    public void calBack(int p){
        System.out.println("Call Back squred p is: "+p*p);
    }
}
class Interface_02{
    public static void main(String[] args){
        CallBack ob = new Client();
        ob.calBack(12);
        AnotherClient ob1 = new AnotherClient();
        ob = ob1;
        ob.calBack(5);
    }
}
