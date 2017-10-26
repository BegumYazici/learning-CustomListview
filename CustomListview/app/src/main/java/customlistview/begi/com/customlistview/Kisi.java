package customlistview.begi.com.customlistview;

/**
 * Created by asus1 on 26.10.2017.
 */
public class Kisi {

    private String isim;
    private boolean kadinMi;

    public Kisi(String isim, boolean kadinMi) {
        this.isim = isim;
        this.kadinMi = kadinMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isKadinMi() {
        return kadinMi;
    }

    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }
}
