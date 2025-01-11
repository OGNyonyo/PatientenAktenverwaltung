# PatientenAktenverwaltung

## 📋 Projektbeschreibung
Unser Projekt, **PatientenAktenverwaltung**, ist eine Anwendung zur Verwaltung von Patientendaten. Das Ziel ist es, medizinische Einrichtungen bei der Organisation, Speicherung und Verwaltung von Patientendaten effizient zu unterstützen. 

Mit diesem System können Patientendaten einfach abgespeichert, durchsucht und verwaltet werden. Es wurde mit Fokus auf Benutzerfreundlichkeit entwickelt.

---

## 🚀 Funktionen
### Die wichtigsten Funktionen des Systems:
1. **Patientendaten speichern**:
   - Vorname, Nachname, Geburtsdatum, Adresse und weitere Details.
2. **Patienten Filtern**:
   - Patienten Filtern nach den Nachnamen (A-Z).
3. **Datenübersicht**:
   - Anzeigen einer Liste aller Patienten.
---

## 🛠️ Technologien
Unser Projekt basiert auf den folgenden Technologien:
- **Programmiersprache:** Java
- **Frameworks/Tools:** 
  - Maven (Projektverwaltung und Abhängigkeiten)
- **IDE:** IntelliJ IDEA
- **GUI-Biblothek** Swing

---

📦 Patientenverwaltungssystem
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Patient                # Java-Datei für Patientendaten
│   │   │   ├── verwaltung
│   │   │   │   ├── Verwaltung         # Verwaltungslogik (Java-Klasse)
│   │   │   │   └── VerwaltungForm     # GUI mit Swing für die Verwaltung
│   │   │   ├── org.example
│   │   │       └── Main               
│   ├── resources                      # Ressourcen wie Konfigurationsdateien
│   └── test
│       ├── java
│       │   ├── PatientTest            # Testklasse für Patientendaten
│       │   └── VerwaltungTest         # Testklasse für Verwaltungslogik
├── .gitignore                         # Ignoriert unnötige Dateien
├── pom.xml                            # Maven-Konfigurationsdatei
└── README.md                          # Projektdokumentation

