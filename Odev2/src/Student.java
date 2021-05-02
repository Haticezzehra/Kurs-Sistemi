
public class Student extends User {
    private String ogrencibolum;

    public Student(String ogrencibolum, String kullaniciAdi, String kullaniciId) {
        super(kullaniciAdi, kullaniciId);
        this.ogrencibolum = ogrencibolum;
    }

  

    /**
     * @return the ogrencibolum
     */
    public String getOgrencibolum() {
        return ogrencibolum;
    }

    /**
     * @param ogrencibolum the ogrencibolum to set
     */
    public void setOgrencibolum(String ogrencibolum) {
        this.ogrencibolum = ogrencibolum;
    }
    
}
