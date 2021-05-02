
public class Instructor extends User{
    private String ogretmenalan;

    public Instructor(String ogretmenalan, String kullaniciAdi, String kullaniciId) {
        super(kullaniciAdi, kullaniciId);
        this.ogretmenalan = ogretmenalan;
    }

    /**
     * @return the ogretmenalan
     */
    public String getOgretmenalan() {
        return ogretmenalan;
    }

    /**
     * @param ogretmenalan the ogretmenalan to set
     */
    public void setOgretmenalan(String ogretmenalan) {
        this.ogretmenalan = ogretmenalan;
    }
}
