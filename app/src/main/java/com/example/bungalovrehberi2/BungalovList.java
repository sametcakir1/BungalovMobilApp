package com.example.bungalovrehberi2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class BungalovList {

    boolean success;
    Data data;
    String message;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class Data {
        String tarihVarmi;
        boolean haftaSonuMu;
        String kisiSecimi;
        String arama;
        Object ayricalikSecimleri;
        @SerializedName("filtreSonucToplam")
        @Expose
        private int filtreSonucToplam;
        Evler evler;

        public Evler getEvler() {
            return evler;
        }

        public void setEvler(Evler evler) {
            this.evler = evler;
        }

        public int getFiltreSonucToplam() {
            return filtreSonucToplam;
        }

        public void setFiltreSonucToplam(int filtreSonucToplam) {
            this.filtreSonucToplam = filtreSonucToplam;
        }

        public Object getAyricalikSecimleri() {
            return ayricalikSecimleri;
        }

        public void setAyricalikSecimleri(Object ayricalikSecimleri) {
            this.ayricalikSecimleri = ayricalikSecimleri;
        }

        public String getArama() {
            return arama;
        }

        public void setArama(String arama) {
            this.arama = arama;
        }

        public String getKisiSecimi() {
            return kisiSecimi;
        }

        public void setKisiSecimi(String kisiSecimi) {
            this.kisiSecimi = kisiSecimi;
        }

        public boolean isHaftaSonuMu() {
            return haftaSonuMu;
        }

        public void setHaftaSonuMu(boolean haftaSonuMu) {
            this.haftaSonuMu = haftaSonuMu;
        }

        public String getTarihVarmi() {
            return tarihVarmi;
        }

        public void setTarihVarmi(String tarihVarmi) {
            this.tarihVarmi = tarihVarmi;
        }

    }
        public static class Evler {
            int current_page;
            List<Ev> data;
            String first_page_url;
            int from;
            int last_page;
            String last_page_url;
            List<Link> links;
            String next_page_url;
            String path;
            int per_page;
            Object prev_page_url;
            int to;
            int total;

            public int getCurrent_page() {
                return current_page;
            }

            public void setCurrent_page(int current_page) {
                this.current_page = current_page;
            }

            public List<Ev> getData() {
                return data;
            }

            public void setData(List<Ev> data) {
                this.data = data;
            }

            public String getFirst_page_url() {
                return first_page_url;
            }

            public void setFirst_page_url(String first_page_url) {
                this.first_page_url = first_page_url;
            }

            public int getFrom() {
                return from;
            }

            public void setFrom(int from) {
                this.from = from;
            }

            public int getLast_page() {
                return last_page;
            }

            public void setLast_page(int last_page) {
                this.last_page = last_page;
            }

            public String getLast_page_url() {
                return last_page_url;
            }

            public void setLast_page_url(String last_page_url) {
                this.last_page_url = last_page_url;
            }

            public List<Link> getLinks() {
                return links;
            }

            public void setLinks(List<Link> links) {
                this.links = links;
            }

            public String getNext_page_url() {
                return next_page_url;
            }

            public void setNext_page_url(String next_page_url) {
                this.next_page_url = next_page_url;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getPer_page() {
                return per_page;
            }

            public void setPer_page(int per_page) {
                this.per_page = per_page;
            }

            public Object getPrev_page_url() {
                return prev_page_url;
            }

            public void setPrev_page_url(Object prev_page_url) {
                this.prev_page_url = prev_page_url;
            }

            public int getTo() {
                return to;
            }

            public void setTo(int to) {
                this.to = to;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }
            public static class Ev {
                @SerializedName("id")
                @Expose
                int id;

                String slug;
                @SerializedName("isim")
                @Expose
                String isim;

                @SerializedName("il_id")
                @Expose
                int il_id;
                int ilce_id;
                @SerializedName("max_kisi")
                @Expose
                private int max_kisi;

                int ekstra_kisi_limit;

                @SerializedName("tek_yatak")
                @Expose
                int tek_yatak;

                @SerializedName("cift_yatak")
                @Expose
                int cift_yatak;

                int ekstra_tek_yatak;
                int ekstra_cift_yatak;
                String ev_olanaklari;
                Object video;
                String firma_slug;

                @SerializedName("hafta_ici_fiyat")
                @Expose
                int hafta_ici_fiyat;
                int hafta_sonu_fiyat;

                int hafta_ici_liste_fiyati;

                int hafta_sonu_liste_fiyati;
                @SerializedName("file")
                @Expose
                String file;

                String link;
                YorumPuanBilgisi yorum_puan_bilgisi;
                Object indirim_orani;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
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

                public int getIl_id() {
                    return il_id;
                }

                public void setIl_id(int il_id) {
                    this.il_id = il_id;
                }

                public int getIlce_id() {
                    return ilce_id;
                }

                public void setIlce_id(int ilce_id) {
                    this.ilce_id = ilce_id;
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

                public int getTek_yatak() {
                    return tek_yatak;
                }

                public void setTek_yatak(int tek_yatak) {
                    this.tek_yatak = tek_yatak;
                }

                public int getCift_yatak() {
                    return cift_yatak;
                }

                public void setCift_yatak(int cift_yatak) {
                    this.cift_yatak = cift_yatak;
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

                public String getEv_olanaklari() {
                    return ev_olanaklari;
                }

                public void setEv_olanaklari(String ev_olanaklari) {
                    this.ev_olanaklari = ev_olanaklari;
                }

                public Object getVideo() {
                    return video;
                }

                public void setVideo(Object video) {
                    this.video = video;
                }

                public String getFirma_slug() {
                    return firma_slug;
                }

                public void setFirma_slug(String firma_slug) {
                    this.firma_slug = firma_slug;
                }

                public int getHafta_ici_fiyat() {
                    return hafta_ici_fiyat;
                }

                public void setHafta_ici_fiyat(int hafta_ici_fiyat) {
                    this.hafta_ici_fiyat = hafta_ici_fiyat;
                }

                public int getHafta_sonu_fiyat() {
                    return hafta_sonu_fiyat;
                }

                public void setHafta_sonu_fiyat(int hafta_sonu_fiyat) {
                    this.hafta_sonu_fiyat = hafta_sonu_fiyat;
                }

                public int getHafta_ici_liste_fiyati() {
                    return hafta_ici_liste_fiyati;
                }

                public void setHafta_ici_liste_fiyati(int hafta_ici_liste_fiyati) {
                    this.hafta_ici_liste_fiyati = hafta_ici_liste_fiyati;
                }

                public int getHafta_sonu_liste_fiyati() {
                    return hafta_sonu_liste_fiyati;
                }

                public void setHafta_sonu_liste_fiyati(int hafta_sonu_liste_fiyati) {
                    this.hafta_sonu_liste_fiyati = hafta_sonu_liste_fiyati;
                }

                public String getFile() {
                    return file;
                }

                public void setFile(String file) {
                    this.file = file;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public YorumPuanBilgisi getYorum_puan_bilgisi() {
                    return yorum_puan_bilgisi;
                }

                public void setYorum_puan_bilgisi(YorumPuanBilgisi yorum_puan_bilgisi) {
                    this.yorum_puan_bilgisi = yorum_puan_bilgisi;
                }

                public Object getIndirim_orani() {
                    return indirim_orani;
                }

                public void setIndirim_orani(Object indirim_orani) {
                    this.indirim_orani = indirim_orani;
                }

                public class YorumPuanBilgisi {
                    int yorumSayisi;
                    double yorumGenelPuan;

                    public int getYorumSayisi() {
                        return yorumSayisi;
                    }

                    public void setYorumSayisi(int yorumSayisi) {
                        this.yorumSayisi = yorumSayisi;
                    }

                    public double getYorumGenelPuan() {
                        return yorumGenelPuan;
                    }

                    public void setYorumGenelPuan(double yorumGenelPuan) {
                        this.yorumGenelPuan = yorumGenelPuan;
                    }
                }
            }

            public class Link {
                Object url;
                String label;
                boolean active;

                public Object getUrl() {
                    return url;
                }

                public void setUrl(Object url) {
                    this.url = url;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public boolean isActive() {
                    return active;
                }

                public void setActive(boolean active) {
                    this.active = active;
                }
            }
        }


