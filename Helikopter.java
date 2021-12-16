public class Helikopter {
    public String marka;
    public String model;
    public int rocznik;
    public int ilosc_smigiel;
    public String nazwa;

    public Helikopter(String marka, String model, int rocznik, int ilosc_smigiel, String nazwa) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.ilosc_smigiel = ilosc_smigiel;
        this.nazwa = nazwa;
    }

    public void wyswietlH() {
        System.out.println("Helikopter z rocznika: " + rocznik + "\nMarki: " + marka + "\nModel: " + model + "Ilosc smigiel: " + ilosc_smigiel + "O Nazwie: " + nazwa+"\n");
    }
}
