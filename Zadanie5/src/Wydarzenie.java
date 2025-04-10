public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.setCena(cena);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.setCena(cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.setCena(cena);
        this.data = data;
        this.miejsce = miejsce;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        if(maxLiczbaMiejsc < 0){
            throw new IllegalStateException("Maksymalna liczba miejsc nie może być mniejsza od zera.");
        }
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        if(dostepneMiejsca > maxLiczbaMiejsc){
            throw new IllegalStateException("Liczba dostępnych miejsc nie może być większa niż maksymalna liczba miejsc.");
        }
        if(dostepneMiejsca < 0){
            throw new IllegalStateException("Liczba dostępnych miejsc nie może być mniejsza od zera.");
        }
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena < 0){
            throw new IllegalStateException("Cena musi być dodatnia.");
        }
        this.cena = cena;
    }


    public String toString() {
        return this.nazwa + " " + this.data + " " + this.miejsce + " " + this.dostepneMiejsca + " " + this.cena;
    }

    public void zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            this.dostepneMiejsca--;
        }
        else{
            System.out.println("Brak wolnych miejsc");
        }
    }

}
