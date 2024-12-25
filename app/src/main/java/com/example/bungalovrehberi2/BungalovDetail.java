package com.example.bungalovrehberi2;

import java.util.List;

public class BungalovDetail {
    private boolean success;
    private BungalovData data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public BungalovData getData() {
        return data;
    }

    public void setData(BungalovData data) {
        this.data = data;
    }

    public class BungalovData {
    private String link;
    private int bugununFiyati;
    private String indirimOrani;
    private String bugununListeFiyati;
    private int hafta_ici_min_gun;
    private int hafta_sonu_min_gun;
    private String startDate;
    private String endDate;
    private Ev ev;
    private List<EvOlanaklari> evOlanaklari;
    private List<BilinmesiGerekenler> bilinmesiGerekenler;
    private List<Resim> resimler;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getBugununFiyati() {
            return bugununFiyati;
        }

        public void setBugununFiyati(int bugununFiyati) {
            this.bugununFiyati = bugununFiyati;
        }

        public String getIndirimOrani() {
            return indirimOrani;
        }

        public void setIndirimOrani(String indirimOrani) {
            this.indirimOrani = indirimOrani;
        }

        public String getBugununListeFiyati() {
            return bugununListeFiyati;
        }

        public void setBugununListeFiyati(String bugununListeFiyati) {
            this.bugununListeFiyati = bugununListeFiyati;
        }

        public int getHafta_ici_min_gun() {
            return hafta_ici_min_gun;
        }

        public void setHafta_ici_min_gun(int hafta_ici_min_gun) {
            this.hafta_ici_min_gun = hafta_ici_min_gun;
        }

        public int getHafta_sonu_min_gun() {
            return hafta_sonu_min_gun;
        }

        public void setHafta_sonu_min_gun(int hafta_sonu_min_gun) {
            this.hafta_sonu_min_gun = hafta_sonu_min_gun;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Ev getEv() {
            return ev;
        }

        public void setEv(Ev ev) {
            this.ev = ev;
        }

        public List<EvOlanaklari> getEvOlanaklari() {
            return evOlanaklari;
        }

        public void setEvOlanaklari(List<EvOlanaklari> evOlanaklari) {
            this.evOlanaklari = evOlanaklari;
        }

        public List<BilinmesiGerekenler> getBilinmesiGerekenler() {
            return bilinmesiGerekenler;
        }

        public void setBilinmesiGerekenler(List<BilinmesiGerekenler> bilinmesiGerekenler) {
            this.bilinmesiGerekenler = bilinmesiGerekenler;
        }

        public List<Resim> getResimler() {
            return resimler;
        }

        public void setResimler(List<Resim> resimler) {
            this.resimler = resimler;
        }

        // Getter ve Setter metodları
}

public class Ev {
    private int id;
    private int firma_id;
    private String slug;
    private String isim;
    private int ilce_id;
    private int il_id;
    private int konsept_id;
    private String aciklama;
    private String ev_olanaklari;
    private String bilinmesi_gerekenler;
    private int banyo;
    private int wc;
    private int kahvalti;
    private int tek_yatak;
    private int cift_yatak;
    private int max_kisi;
    private int toplam_kisi_limit;
    private int ekstra_kisi_limit;
    private int ekstra_yatak;
    private int ekstra_tek_yatak;
    private int ekstra_cift_yatak;
    private String check_in;
    private String check_out;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirma_id() {
        return firma_id;
    }

    public void setFirma_id(int firma_id) {
        this.firma_id = firma_id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getIlce_id() {
        return ilce_id;
    }

    public void setIlce_id(int ilce_id) {
        this.ilce_id = ilce_id;
    }

    public int getIl_id() {
        return il_id;
    }

    public void setIl_id(int il_id) {
        this.il_id = il_id;
    }

    public int getKonsept_id() {
        return konsept_id;
    }

    public void setKonsept_id(int konsept_id) {
        this.konsept_id = konsept_id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getEv_olanaklari() {
        return ev_olanaklari;
    }

    public void setEv_olanaklari(String ev_olanaklari) {
        this.ev_olanaklari = ev_olanaklari;
    }

    public String getBilinmesi_gerekenler() {
        return bilinmesi_gerekenler;
    }

    public void setBilinmesi_gerekenler(String bilinmesi_gerekenler) {
        this.bilinmesi_gerekenler = bilinmesi_gerekenler;
    }

    public int getBanyo() {
        return banyo;
    }

    public void setBanyo(int banyo) {
        this.banyo = banyo;
    }

    public int getWc() {
        return wc;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }

    public int getKahvalti() {
        return kahvalti;
    }

    public void setKahvalti(int kahvalti) {
        this.kahvalti = kahvalti;
    }

    public int getCift_yatak() {
        return cift_yatak;
    }

    public void setCift_yatak(int cift_yatak) {
        this.cift_yatak = cift_yatak;
    }

    public int getTek_yatak() {
        return tek_yatak;
    }

    public void setTek_yatak(int tek_yatak) {
        this.tek_yatak = tek_yatak;
    }

    public int getToplam_kisi_limit() {
        return toplam_kisi_limit;
    }

    public void setToplam_kisi_limit(int toplam_kisi_limit) {
        this.toplam_kisi_limit = toplam_kisi_limit;
    }

    public int getMax_kisi() {
        return max_kisi;
    }

    public void setMax_kisi(int max_kisi) {
        this.max_kisi = max_kisi;
    }

    public int getEkstra_kisi_limit() {
        return ekstra_kisi_limit;
    }

    public void setEkstra_kisi_limit(int ekstra_kisi_limit) {
        this.ekstra_kisi_limit = ekstra_kisi_limit;
    }

    public int getEkstra_yatak() {
        return ekstra_yatak;
    }

    public void setEkstra_yatak(int ekstra_yatak) {
        this.ekstra_yatak = ekstra_yatak;
    }

    public int getEkstra_tek_yatak() {
        return ekstra_tek_yatak;
    }

    public void setEkstra_tek_yatak(int ekstra_tek_yatak) {
        this.ekstra_tek_yatak = ekstra_tek_yatak;
    }

    public int getEkstra_cift_yatak() {
        return ekstra_cift_yatak;
    }

    public void setEkstra_cift_yatak(int ekstra_cift_yatak) {
        this.ekstra_cift_yatak = ekstra_cift_yatak;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }
}

public class EvOlanaklari {
    private int id;
    private int grup_id;
    private String ikon;
    private String baslik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIkon() {
        return ikon;
    }

    public void setIkon(String ikon) {
        this.ikon = ikon;
    }

    public int getGrup_id() {
        return grup_id;
    }

    public void setGrup_id(int grup_id) {
        this.grup_id = grup_id;
    }


}

public class BilinmesiGerekenler {
    private int id;
    private String baslik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    // Getter ve Setter metodları
}

public class Resim {
    private int id;
    private int ev_id;
    private String title;
    private String file;
    private String type;
    private int size;
    private int index;
    private String date;
    private int is_main;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_main() {
        return is_main;
    }

    public void setIs_main(int is_main) {
        this.is_main = is_main;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEv_id() {
        return ev_id;
    }

    public void setEv_id(int ev_id) {
        this.ev_id = ev_id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    }
}


