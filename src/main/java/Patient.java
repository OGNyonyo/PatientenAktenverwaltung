import java.time.LocalDate;
import javax.swing.*;

    public class Patient {
        // Attribute
        private String vorname;
        private String nachname;
        private LocalDate geburtsdatum;
        private boolean registriert;
        private String anamnese;
        private int verischertennr;

        // Konstruktor
        public Patient(String vorname, String nachname, LocalDate geburtsdatum, boolean registriert, String anamnese, int versichertennr) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.geburtsdatum = geburtsdatum;
            this.registriert = registriert;
            this.anamnese = anamnese;
            this.verischertennr = versichertennr;
        }

        // Getter und Setter
        public String getVorname() {
            return vorname;
        }

        public void setVorname(String vorname) {
            this.vorname = vorname;
        }

        public String getNachname() {
            return nachname;
        }

        public void setNachname(String nachname) {
            this.nachname = nachname;
        }

        public LocalDate getGeburtsdatum() {
            return geburtsdatum;
        }

        public void setGeburtsdatum(LocalDate geburtsdatum) {
            this.geburtsdatum = geburtsdatum;
        }

        public boolean getRegistriert() {
            return registriert;
        }

        public void setRegistriert(boolean registriert) {
            this.registriert = registriert;
        }

        public String getAnamnese() {
            return anamnese;
        }

        public void setAnamnese(String anamnese) {
            this.anamnese = anamnese;
        }

        public int getVerischertennr() {
            return verischertennr;
        }

        public void setVersichertennr(int versichertennr) {
            this.verischertennr = versichertennr;
        }

        // toString-Methode
        @Override
        public String toString() {
            return "Patient: " + vorname + " " + nachname +
                    ", Geburtsdatum: " + geburtsdatum +
                    ", Versicherung: " + (registriert ? "Privat" : "Gesetzlich") +
                    ", Anamnese: " + anamnese +
                    ", Versicherungsnummer: " + verischertennr;
        }
    }

