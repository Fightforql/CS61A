package lec2;
class baby
{
    String name;
    int age;
    static int number=0;
    baby(String s,int n){
        name=s;
        age=n;
    }
    void printnumber()
    {
        System.out.println(number);
    }
};

public class classANDobject {
    public static void doSomething(int x, int[] ys, baby b) { 
        x = 99;
        ys[0] = 99;
        b.name = "haha"; 
    }
    public static void main(String[] arguments)
    {
        //String s;
        baby mybaby1=new baby("liangshuyi",19);
        baby.number=10;
        mybaby1.printnumber();
        baby mybaby2=new baby("lianghaha",20);
        mybaby2.printnumber();
        int i = 0; 
        int[] j = { 0 };
        baby k = new baby("bob", 10);
        doSomething(i, j, k);
        System.out.println(i);
        System.out.println(j[0]);
        System.out.println(k.name);
    }
}
