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
public class IF110119016Latihan43GajiPegawai {

    
    public static void main(String[] args) {
       GajiPegawai pegawai = new GajiPegawai();
       pegawai.setNama("Aditya Ilham Subagja");
       pegawai.setAlamat("Jln Cikoneng Perum Akita");   
       pegawai.setGajiPokok(4500000);
       pegawai.setUangTunjangan(250000);
       pegawai.setUangTransport(300000);
       pegawai.setTotalGaji(
            pegawai.totalGaji(
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getGajiPokok()
            )
      );
      pegawai.tampilData(
            pegawai.getNama(),
            pegawai.getAlamat(),
            pegawai.getUangTunjangan(),
            pegawai.getUangTransport(),
            pegawai.getGajiPokok(),
            pegawai.getTotalGaji()
      );
    }
}