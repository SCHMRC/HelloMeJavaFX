# HelloMe - Applicazione JavaFX

## Descrizione
**HelloMe** è un'applicazione semplice sviluppata in JavaFX che accoglie l'utente inserendo il proprio nome e mostrando un messaggio di benvenuto personalizzato. Se il campo del nome è vuoto, viene visualizzato un messaggio di avviso.

---

## Funzionalità
- Inserimento del nome tramite un campo di testo (`TextField`)
- Visualizzazione di un messaggio di benvenuto personalizzato (`TextArea`)
- Messaggio di avviso se il campo del nome è lasciato vuoto
- Interfaccia utente non ridimensionabile per garantire una visualizzazione stabile

---

## Struttura del Progetto
- **Main.java**: Avvia l'applicazione caricando l'interfaccia da `HelloMe.fxml`.
  - Imposta lo stage come non ridimensionabile.
  - Carica lo stile definito in `application.css`.
- **HelloMe.fxml**: Definisce l'interfaccia grafica dell'applicazione.
  - Utilizza un layout `BorderPane`.
- **HelloMeController.java**: Gestisce la logica dell'applicazione.
  - Controlla l'input dell'utente e aggiorna il messaggio di benvenuto.
  - Verifica che il campo del nome non sia vuoto.
- **application.css**: Definisce lo stile dell'interfaccia grafica.

---

## Tecnologie Utilizzate
- **JavaFX**: Per l'interfaccia grafica e la gestione degli eventi.
- **FXML**: Per la progettazione dell'interfaccia utente.
- **CSS**: Per la personalizzazione dello stile.

---

## Requisiti
- **JDK** 11 o superiore
- **JavaFX SDK** (compatibile con la versione del JDK utilizzato)
- **Eclipse** o un altro IDE compatibile con JavaFX

---

## Configurazione ed Esecuzione
1. **Scarica e Configura JavaFX**:
   - Scarica l'SDK di JavaFX dal sito ufficiale: [https://openjfx.io/](https://openjfx.io/)
   - Aggiungi i JAR di JavaFX nel classpath del progetto.

2. **Disabilita VM Arguments** in Eclipse:
   Disabilita la checkbox: USE the -XstatOnFirstThread argument when launching with SWT

3. **Esegui l'applicazione**:
   - Importa il progetto in Eclipse.
   - Seleziona la classe `Main.java`.
   - Esegui come **Java Application**.

---

## Esempio di Utilizzo
1. Avvia l'applicazione.
2. Inserisci il tuo nome nel campo di testo.
3. Clicca sul pulsante.
   - Se il campo del nome è compilato, viene visualizzato un messaggio di benvenuto personalizzato.
   - Se il campo è vuoto, viene visualizzato un messaggio di avviso.

---

## Autore
**Marco Schiavo** - [marcoschiavo](https://github.com/marcoschiavo)

---

## Note
- L'interfaccia grafica è stata progettata utilizzando **Scene Builder**.
- La finestra dell'applicazione è stata impostata come **non ridimensionabile** per evitare problemi di layout.
