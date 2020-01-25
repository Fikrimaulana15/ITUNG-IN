package id.itungin.itung_in.tampilperhari;

public class DataTampilPerhari {
    private String harga;
    private String jam;

    public DataTampilPerhari(String harga, String jam) {
        this.harga = harga;
        this.jam = jam;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
