public class Motor {
        public int kecepatan = 0;
        public boolean kontak0n = false;

        public void nyalakanMesin(){
            kontak0n = true;
        }

        public void matikanMesin(){
            kontak0n = false;
            kecepatan += 5;
        }

        public void tambahKecepatan(){
            if(kontak0n == true){
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karen mesin off \n");
            }
            if (kecepatan > 100){
                System.out.println("Kecepatan maksimal 100");
            }
        }

        public void printStatus(){
            if (kontak0n == true){
                System.out.println("kontak On");
            } else {
                System.out.println("kontak Of");
            }
            System.out.println("Kecepatan" + kecepatan +"\n");
        }
}
