import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PatientTest {

    @Test
    public void testPatientKonstruktorUndGetter() {
        // Erstellen eines Patient-Objekts mit den tatsächlichen Werten
        Patient patient = new Patient("Meryem", "Sahin", LocalDate.of(1999, 7, 15), true, "Lunatumnekrose", 108310400);

        // Überprüfen, ob die Attribute korrekt gesetzt wurden
        assertEquals("Meryem", patient.getVorname());
        assertEquals("Sahin", patient.getNachname());
        assertEquals(LocalDate.of(1999, 7, 15), patient.getGeburtsdatum());
        assertTrue(patient.getRegistriert());
        assertEquals("Lunatumnekrose", patient.getAnamnese());
        assertEquals(108310400, patient.getVerischertennr());
    }

    @Test
    public void testSetzenUndAbrufenVonAttributen() {
        // Erstellen eines Patient-Objekts
        Patient patient = new Patient("Georgina", "Diem", LocalDate.of(2002, 10, 13), false, "Bänderriss", 108310600);

        // Testen der Setter-Methoden
        patient.setVorname("Georgina");
        patient.setNachname("Diem");
        patient.setGeburtsdatum(LocalDate.of(2002, 10, 13));
        patient.setRegistriert(false);
        patient.setAnamnese("Bänderriss");
        patient.setVersichertennr(108310600);

        // Überprüfen, ob die neuen Werte korrekt gesetzt wurden
        assertEquals("Georgina", patient.getVorname());
        assertEquals("Diem", patient.getNachname());
        assertEquals(LocalDate.of(2002, 10, 13), patient.getGeburtsdatum());
        assertFalse(patient.getRegistriert());
        assertEquals("Bänderriss", patient.getAnamnese());
        assertEquals(108310600, patient.getVerischertennr());
    }

    @Test
    public void testToString() {
        // Erstellen eines Patient-Objekts
        Patient patient = new Patient("Lien", "Awaza", LocalDate.of(2007, 1, 20), true, "Magenschleimhautentzündung", 109560955);

        // Überprüfen, ob die toString-Methode korrekt funktioniert
        String expected = "Patient: Lien Awaza, Geburtsdatum: 2007-01-20, Versicherung: Privat, Anamnese: Magenschleimhautentzündung, Versicherungsnummer: 109560955";
        assertEquals(expected, patient.toString());
    }
}