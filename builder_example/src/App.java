public class App {
    public static void main(String[] args) throws Exception {

        SekilDirectory sd=new SekilDirectory();

        eskenarSekilci besgen=new besGen();
        eskenarSekilci kare=new kare();

        sd.Sekilver(besgen);
        sd.Sekilver(kare);

        besgen.eskenarSekiller().SekilGoster();
        System.out.println("---------");
        kare.eskenarSekiller().SekilGoster();

    }
}

class SekilDirectory {// director
public void Sekilver(eskenarSekilci eskenarSekilci){
  
    eskenarSekilci.createKenarSayisi();
    eskenarSekilci.createKenarIcRenk();
    eskenarSekilci.createKenarUzunluk();
    eskenarSekilci.createRenk();

}
}

interface eskenarSekilci {// builder

    eskenarSekil eskenarSekiller();/// bu da fonk concrete e göre değişiyor dönderdiği nesne tanımda

     void createKenarSayisi();

     void createKenarUzunluk();

     void createRenk();

     void createKenarIcRenk();

}

class besGen implements eskenarSekilci{//concrete builderlar

    private eskenarSekil besgen;

    public besGen() {//
        besgen=new eskenarSekil("kare");
    }

    @Override
    public eskenarSekil eskenarSekiller() {//ezilen yukardakş fonk
       return  besgen;
    }

    @Override
    public void createKenarSayisi() {
       besgen.setKenarSayisi(5);
    }

    @Override
    public void createKenarUzunluk() {
       besgen.setKenarUzunlugu(3);;
    }

    @Override
    public void createRenk() {
      besgen.setRenk("mavi");
    }

    @Override
    public void createKenarIcRenk() {
      besgen.setIcRenk("kirmizi");
    }

    

}

class kare implements eskenarSekilci{

    private eskenarSekil kare;

    public kare() {
        kare=new eskenarSekil("kare");
    }

    @Override
    public eskenarSekil eskenarSekiller() {
       return  kare;
    }

    @Override
    public void createKenarSayisi() {
       //özellikleri atayacağız sekile göre
       kare.setKenarSayisi(4);
    }

    @Override
    public void createKenarUzunluk() {
       kare.setKenarUzunlugu(5);
    }

    @Override
    public void createRenk() {
      kare.setRenk("mavi");
    }

    @Override
    public void createKenarIcRenk() {
      kare.setIcRenk("bordo");
    }

}

class Triangle implements eskenarSekilci{

    private eskenarSekil triangle;

    public Triangle() {
        triangle=new eskenarSekil("ucgen");
    }

    @Override
    public eskenarSekil eskenarSekiller() {
       return  triangle;
    }

    @Override
    public void createKenarSayisi() {
       //özellikleri atayacağız sekile göre
    }

    @Override
    public void createKenarUzunluk() {
       
    }

    @Override
    public void createRenk() {
      
    }

    @Override
    public void createKenarIcRenk() {
    
    }

}



class eskenarSekil {// product

    private String sekilad;
    private int kenarSayisi;
    private int kenarUzunlugu;
    private int kenarKalinlik;
    private String renk;
    private String icRenk;


    public eskenarSekil(String sekilad){///////////constructor
          this.setSekilad(sekilad);
    }

    public void SekilGoster(){
        System.out.println("Sekil adi: "+getSekilad());
                System.out.println("KenarSayisi: "+getKenarSayisi());
                System.out.println("Kenar Uzunluk: "+getKenarUzunlugu());
             //   System.out.println("Kenar Kalinlik: "+getKenarKalinlik());
                System.out.println("Renk : "+getRenk());
                System.out.println("ic Renk : "+getIcRenk());

    };



     public String getSekilad() {
        return sekilad;
    }

    public void setSekilad(String sekilad) {
        this.sekilad = sekilad;
    }

    public int getKenarSayisi() {
        return kenarSayisi;
    }

    public void setKenarSayisi(int kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public int getKenarKalinlik() {
        return kenarKalinlik;
    }

    public void setKenarKalinlik(int kenarKalinlik) {
        this.kenarKalinlik = kenarKalinlik;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getIcRenk() {
        return icRenk;
    }

    public void setIcRenk(String icRenk) {
        this.icRenk = icRenk;
    }

}