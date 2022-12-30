public class App {
    public static void main(String[] args) throws Exception {
        Calisan ali = new Calisan();
        ali.boy = 180;
        ali.kilo = 80;
        ali.yas = 30;
        System.out.println("Ali'nin yaşı: " + ali.yas + " kilosu: " + ali.kilo + " boyu: " + ali.boy);

        Insan veli = new Insan();
        veli.boy = 186;
        veli.kilo = 70;
        veli.yas = 20;
        System.out.println("Veli'nin yaşı: " + veli.yas + " kilosu: " + veli.kilo + " boyu: " + veli.boy);

        ali.yemek();
        System.out.println("Ali'nin yemekten sonraki kilosu: " + ali.kilo);

        ali.maas = 100;
        System.out.println("Ali'nin maaşı: " + ali.maas);
        ali.zam(20);
        System.out.println("Ali'nin zamlı maaşı: " + ali.maas);
    }
}
