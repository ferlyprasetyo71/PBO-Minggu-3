public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama (){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getLimitPinjaman(){
        return this.limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman){
        this.limitPinjaman = limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void Pinjam(int jumlahPinjam){
        if(jumlahPinjam > this.limitPinjaman){
            System.out.println("maaf, jumlah peminjaman melebihi limit");
        } else {
            this.jumlahPinjaman = jumlahPinjam;
        }
    }

    public void angsur(int jumlahAngsur){
        if(jumlahAngsur < (limitPinjaman/10)){
            System.out.println("Maaf jumlah angsuran minimal 10% dari limit peminjaman");
        } else {
            jumlahPinjaman -= jumlahAngsur;
        }
    }
}

