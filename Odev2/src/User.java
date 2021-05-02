
public class User {
    private String kullaniciAdi;
    private String kullaniciId;

    /**
     * @return the kullaniciAdi
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param kullaniciAdi the kullaniciAdi to set
     */
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * @return the kullaniciId
     */
    public String getKullaniciId() {
        return kullaniciId;
    }

    /**
     * @param kullaniciId the kullaniciId to set
     */
    public void setKullaniciId(String kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public User(String kullaniciAdi, String kullaniciId) {
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciId = kullaniciId;
    }
    
}
