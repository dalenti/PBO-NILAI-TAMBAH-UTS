package lingkaran;


public class SetengahLingkaran implements Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    
    @Override
    public void hitungLuas() {
        double luas = (PANJANG / 2 * LEBAR) - (Math.PI * (PANJANG / 2) * (PANJANG / 2) / 4);
        
        hasil = 2 * luas;
    }
    
    @Override
    public void tampilkanLuas() {
        System.out.println("luas nya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }

    
}
