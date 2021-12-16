public class Main {
    public static void main(String[] args) {
        Auto ferrari = new Auto(2016, "Ferrari",  "Alvaroz");
        ferrari.wyswietlA();

        Tank jd = new Tank("TankExtreme", "Sentino", 2115, 8);
        jd.wyswietlT();

        Helikopter jp = new Helikopter("ChopppersExtreme","Random",2137,8,"JD");
        jp.wyswietlH();

        Motocykl pl = new Motocykl(1960,"Ekstra","Loteriada");
        pl.wyswietlM();


    }
}
