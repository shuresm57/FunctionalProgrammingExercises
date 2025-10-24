package functionalprogrammingintro.opgave6;

import java.time.LocalDate;

public class KapSejlads {

    private LocalDate dato;
    private String bådNavn;

    public KapSejlads(LocalDate dato, String bådType) {
        this.dato = dato;
        this.bådNavn = bådType;
    }

    public LocalDate getDato() {
        return dato;
    }

    public String getBådType() {
        return bådNavn;
    }


    @Override
    public String toString() {
        return "KapSejlads dato=" + dato + ", bådType=" + bådNavn;
    }

}
