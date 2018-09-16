package lei.company;

public class Main {

    public int ff = 10;;
    public static Test FF = new Test ();
    public static void main(String[] args) {

        Test.Inner_test inner_test = FF.new Inner_test();

    }
}

class Test {
    public byte value = 10;
    public int data = 10;
    public String str = new String ("fsfs");
    public float f_data = 34.5F;

    Test () {
        Byte next = value;
        int lei = 10;
        int feng = 200;
        double dd = 10.0;
        long xx = 100;
        if (lei == dd) {
            System.out.println(dd);
        }

        test;

        System.out.println(str);
    }

    class Inner_test {
        public int x = 10;
        public int y = 101;
    }
}


