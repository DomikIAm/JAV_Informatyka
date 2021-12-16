public class Tank {
    public String marka;
    public String model;
    public int rok_produkcji;
    public int kaliber;

    public Tank(String marka, String model, int rok_produkcji, int kaliber) {
        this.rok_produkcji = rok_produkcji;
        this.marka = marka;
        this.model = model;
        this.kaliber = kaliber;
    }

        public void wyswietlT(){
            System.out.println("Marka czolgu: " +marka+ "\nModel:" + model + "\nRok produkcji: " +rok_produkcji+"\nKaliber: "+kaliber+"\n");
        }
    }

