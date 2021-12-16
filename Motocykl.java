public class Motocykl {
    public int rocznik;
    public String marka;
    public String model;

    public Motocykl(int rocznik, String marka, String model) {
        this.rocznik = rocznik;
        this.marka = marka;
        this.model = model;
    }
    public void wyswietlM(){
        System.out.println("Motocykl z rocznika: " +rocznik+ "\nMarki: " + marka + "\nModel: " +model+"\n");
    }


}
