package vinnsla;

public class Vidskiptavinur {
    private String nafn;
    private String heimilsfang;
    private String nafnVidskiptavins = "";
    private String heimilisfangVidskipavins = "";

    Vidskiptavinur nyr = new Vidskiptavinur("Gunnar", "Gulaþing 17");


    public Vidskiptavinur(String nafn, String heimilsfang) {
        this.nafn = nafnVidskiptavins;
        this.heimilsfang = heimilisfangVidskipavins;
    }

    public String getHeimilsfang() {
        return heimilsfang;
    }

    public String getNafn() {
        return nafn;
    }
}
