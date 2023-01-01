public class App {

    public int x = 0;
    
    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + App.this.x);
        }
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        App.FirstLevel fl = app.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
