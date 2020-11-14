package if1.pkg10119016.latihan43.gajipegawai;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung gaji pegawai menggunakan getter setter
 */
public class GajiPegawai {
private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public int getUangTransport(){
        return uangTransport;
    }

    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan(){
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji(){
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }

    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan\t: ".concat(nama));
        System.out.println("Alamat\t\t: ".concat(alamat));
        System.out.println("Uang Transport\t: Rp. " + uangTransport);
        System.out.println("Uang Tunjangan\t: Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok\t: Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI\t: Rp. " + totalGaji);
    }
}