public class Test {
    int appId;
    String appName;
    //parameterized constructor with two parameters
    Test(int id, String name){
        this.appId = id;
        this.appName = name;
    }
    void info(){
        System.out.println("Id: "+appId+" Name: "+appName);
    }
    public static void main(String args[]){
        Test obj1 = new Test(11001,"Facebook");
        Test obj2 = new Test(23003,"Instagram");
        obj1.info();
        obj2.info();
    }
}