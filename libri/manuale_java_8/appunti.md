# Manuale di java 8

### Pag. 61


### Cosa c'è di nuovo in java 8 (o 1.8)
* Stream Api
* Espressioni Lambda
* supporto Multithreading
* Date & Time API
* implementazione metodi default nelel interfacce
* JavaFX come standard per la GUI
* gestione delle collezioni e dell'intendere l'ereditarietà multipla
  
Il libro si divide in 3 parti
* Le basi di Java
* Object Orientation
* Caratteristiche avanzate


**Robustezza**, questa è sopratturro una conseguenza di una gestione delle eccezioni chiara e funzionale, e di un meccanismo automatico della gestione della memoria (Garbage Collection) che esonera il programmatore dall'obbligo di dover deallocare momoria quando ce n'è bisogno. Inoltre il compilatore Java, è molto "severo". Il programmatore è infatti costretto a risolvere tutte le situazioni "poco chiare", garantendo al programma maggiori chance di corretto funzionamento. La logica è: molto meglio ottenere un errore in compilazione che in esecuzione.

**Indipendenza dall'architettura**, grazie al concetto di macchina vituale, ogni applicazione una volta compilata, potrà essere eseguita su una qualsiasi piattaforma. Questo è sicuramente la caratteristica più importante di Java. Infatti, nel caso in cui si debba implementare un programma destinato a diverse piattaforme per esempio, non ci sarà la necessità di doverlo convertire radicalmente.

**Java Virtual Machine**, ciò che rende di fatto possibile l'indipendenza dalla piattaforma, è la JVM, un software che svolge un ruolo da interprete (ma non solo) per le applicazioni Java. Dopo aver scritto il nostro programma in Java, bisogna compilarlo, ottenendo così, non direttamente un file eseguibile (ovvero la traduzione in linguaggio macchina del file sorgente che abbiamo scritto in Java), ma un file che contiene la traduzione del nostro listato in un linguaggio molto vicino al linguaggio macchina detto "byte code". Una volta ottenuto questo file la JVM interpreterà il bytecode ed il nostro programma sara eseguito. La JVm garantisce anche altri vantaggi come per esempio il multi-thread e meccanismi di sciurezza molto potenti, la supervisione del codice da parte del Garbage Collector, validi aiuti per gestire codice al runtime e tanto altro.

**Orientamento agli oggetti**, Java ci fornisce infatti alcuni strumenti che praticamente ci obbligano a programmare ad oggetti. I paradigmi fondamentali della programmazione ad oggetti (ereditarietà, incapsulamento, polimorfismo) sono più facilmente apprezzabili e comprensibili. Tuttavia con il passare del tempo il linguaggio si sta evolvendo, e si sta aprendo anche ad altri paradigmi di programmazione.

## Struttura del JDK
* **bin** contiene tutti i file eseguibili del JDK, ovvero "javac", "java", "jar", "appletviewer", che ci permettono di compilare, eseguire, impacchettare etc. il nostro lavoro.
*  **db** contiene il database Java DB, una personalizzazione del database open source Apache Derby.
*   **include e lib**, contengono librerie scritte in C e in Java che sono utilizzate dal JDK.
*   **jre**, sta per Java Runtime Enviromente. Affinché un'applicazione Java risulti eseguibile su di una macchina, basta installare solo il JRE. Si tratta della JVM con il supporto per le librerie supportate nella versione corrente di Java. Il JRE viene installato in qesta cartella automaticamente, quando viene installato il JDK.
*   **samole**, alcuni codici esempio
*   **docs**, alcune volte da scaricare a parte, contiente la documentazione della libreria standard di Java.


---

```Java
public static void main(String args[])
```

**public** | modificatore del metodo. I modificatori sono anteposti alle dichiarazioni di un elemento in Java (un metodo, una variabile, una classe, etc..), questo cambierà in qualche modo (a seconda del significato del modficatore) le sue proprietà. In questo caso trattasi di uno specificatore d'accesso che rende di fatto il metodo accessibile anche al di fuori della classe in cui è stato definito.

**static** | altro modificatore del metodo, essenziale per la definizione del metodo main().

**void** | è il tipo di ritorno del metodo. Significa "vuoto" e quindi quesot metodo non restitiusce nessun tipo di valore. Il metodo main() non deve mai avere un tio di ritorno diverso da void.

**main** trattasi del nomde del metodo (detto anche identificatore del metodo).

**(String args[])** alla destra dell'identificatore di un metodo, si definisce sempre una coppia di parentesi tonde che racchiude opzionalmente una lista di parametri (detti anceh argomenti del metodo). Il metodo main(), in ogni caso vuole sempre come parametro un array di stringhe args è l'identificatore nome dell'array.

---

I concetti di classe ed oggetto sono strettamente legati. 
Una classe è un'astrazione indicante un insieme di oggetti che condividono le stesse caratteristiche e le stesse funzionalità.
Un oggetto è un'istanza di una classe.

Con Java è possibile creare codice per astrarre un qualsiasi concetto del mondo reale. Definiamo un punto 

```Java
public class Punto{
    public int x;
    public int y;
}
```

Dichiarazione di un metodo
[modificatori] tipo_di_dato_di_ritorno nome_del_metodo ([parametri]) {corpo del metodo}
La coppia costituita dal nome del metodo e l'eventuale lista dei parametri viene detta "firma" del metodo.

Varargs, è possibile utilizzare metodi che dichiarano come lista di parametri i cosiddetti ***variable arguments***, più brevemente noti come varargs. In pratica è possibile creare metodi che dichiarano un numero non definito di parametri di un certo tipo. La sintassi fa uso di tre puntini dopo la dichiarazione dle tipo. Inoltre è possibile dichiarare un solo parametro varargs come ultimo argomento.

Dichiarazione di una variabile
[modificatori] tipo_di_dato nome_della_variabile [ = inizializzazione];

Variabili d'istanza, una variabile è detta d'istanza o anche attributo se è dichiarata in una classe, ma al di fuori di un metodo. Una variabile d'istanza smetterà di esistere quando smetterà di esistere l'oggetto a cui appartiene.

Variabili locali, una variabile è detta locale se è dichiarata all'interno di un metodo. Essa smetterà di esistere quando terminerà il metodo.

Parametri formali, le variabili dichiarate all'interno delle parentesi tonde che si trovano alla destra dell'identificatore nella dichiarazione di un metodo, sono detti parametri o argomenti del metodo. I parametri di un metodo saranno inizializzati, come al momento della chiamata del metodo. 

Metodi costruttori, in Java esistono metodi speciali che hanno "proprietà". Tra questi c'è da considerare il metodo costruttore, un metodo che possiede le seguenti caratteristiche: ha lo stesso nome della classe, non ha tipo di ritorno, è chiamato automaticamente (e solitamente) ogni volta che è istanziato un oggetto, relativamente a quell'oggetto, è presente in ogni classe, solitamente un metodo costruttore viene definito allo scopo di iizializzare le variabili d'istanza. Potremo inserire più costruttori nella stessa classe, questa è una manifestazione del polimorfismo che si chiama "overload". Questo eprmette di scrivere più metodi con lo stesso nome ma con differente la lista dei parametri.
Java in assenza del costruttore in una classe inserisce quello di default, un costruttore senza parametri non è la stessa cosa del costruttore default.

Package, Un package in Java permette di raggruppare in un'unica entità complessa classi Java logicamente correlate. Fisicamente il package non è altro che una cartella del nostro sistema operativo, ma non tutte le cartelle sono package. Per eleggere una cartella a package, una classe Java deve dichiarare nel suo codice la sua appartenenza a quel determinato package, e inoltre deve risiedere fisicamente all'interno di essa. 

---
Modulo 3 

Tipi di dati primitivi:
* Tipi interi: byte, short, int, long
* Tipi floating point: float e double
* Tipo testuale: char
* Tipo logico-booleano: boolean

**final**, una variabile dichiarata final farà in modo che ogni tentativo di cambiare il valore di tale variabile produrrà un errore di compilazione. Quindi final è una costante.

**static**, questo modificatore quando dichiariamo una variabile statica, tale variabile sarà condivisa da tutte le istanze di quella classe, anche chiamata "variabile di classe".


## Passaggio di parametri per valore
Il passaggio di aprametri in Java avviene sempre per valore. Quest'affermazione viene contraddetta in alcuni testi. Quando si invoca un metodo che prende in input una variabile, al metodo stesso viene passato solo il valore (una copia) della variabile, che quindi rimane immutata anche dopo l'esecuzione del metodo. La stessa cosa accade per i tipi reference: viene sempre passato il valore del reference, ovvero l'indirizzo in memoria. Il fatto che il passaggio avvenga sempre per valore garantisce che un oggetto possa essere modificato all'interno del metodo chiamato e contemporaneamente si è certi che dopo la chiamata del metodo il reference punti sempre allo stesso oggetto. 

---
Parte 2


