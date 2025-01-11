import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class VerwaltungTest {

    private Verwaltung verwaltung;

    @BeforeEach
    public void setUp() {
        // Erstellen einer Instanz der Verwaltung (GUI) im Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            verwaltung = new Verwaltung();
        });

        // Warten, bis die GUI vollständig initialisiert ist (wichtig für GUI-Tests)
        try {
            Thread.sleep(500); // Warte ein wenig, um sicherzustellen, dass die GUI initialisiert ist
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSpeichernNeuerPatient() {
        // Erstellen einer Beispiel-Eingabe für einen neuen Patienten
        String vorname = "Max";
        String nachname = "Mustermann";
        LocalDate geburtsdatum = LocalDate.of(1995, 6, 10);
        String anamnese = "Grippe";
        int versichertennr = 98765;

        // Fülle die Textfelder in der Verwaltung mit den Daten
        SwingUtilities.invokeLater(() -> {
            verwaltung.textFieldName.setText(vorname);
            verwaltung.textFieldNachname.setText(nachname);
            verwaltung.textFieldGeburtsdatum.setText(geburtsdatum.toString());
            verwaltung.textFieldAnamnese.setText(anamnese);
            verwaltung.textFieldnummer.setText(String.valueOf(versichertennr));

            // Wähle eine Versicherung (privat oder gesetzlich)
            verwaltung.radioButtonprivat.setSelected(true);
            verwaltung.comboBoxVersicherungPrivat.setSelectedIndex(0);

            // Drücke den "Speichern"-Button
            verwaltung.buttonSpeichern.doClick();
        });

        // Überprüfe, ob der neue Patient in der Liste gespeichert wurde
        SwingUtilities.invokeLater(() -> {
            List<Patient> patientenListe = verwaltung.patientenListe;
            assertEquals(4, patientenListe.size());  // Es gibt jetzt einen zusätzlichen Patienten

            Patient patient = patientenListe.get(3);
            assertEquals(vorname, patient.getVorname());
            assertEquals(nachname, patient.getNachname());
            assertEquals(geburtsdatum, patient.getGeburtsdatum());
            assertEquals(anamnese, patient.getAnamnese());
            assertEquals(versichertennr, patient.getVerischertennr());
        });
    }

    @Test
    public void testFilternPatienten() {
        // Simulieren der Patientenliste
        SwingUtilities.invokeLater(() -> {
            verwaltung.patientenListe.add(new Patient("Meryem", "Sahin", LocalDate.of(1999, 7, 15), true, "Lunatumnekrose", 108310400));
            verwaltung.patientenListe.add(new Patient("Georgina", "Diem", LocalDate.of(2002, 10, 13), false, "Bänderriss", 108310600));
            verwaltung.patientenListe.add(new Patient("Lien", "Awaza", LocalDate.of(2007, 1, 20), true, "Magenschleimhautentzündung", 109560955));

            // Wähle den "Filtern"-Button
            verwaltung.buttonfiltern.doClick();
        });

        // Überprüfe, ob die Liste nach Nachnamen sortiert wurde
        SwingUtilities.invokeLater(() -> {
            List<Patient> patientenListe = verwaltung.patientenListe;
            assertEquals("Georgina", patientenListe.get(0).getVorname());
            assertEquals("Lien", patientenListe.get(1).getVorname());
            assertEquals("Meryem", patientenListe.get(2).getVorname());
        });
    }
}