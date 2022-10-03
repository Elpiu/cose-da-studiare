# Manuale di java 8

### Pag. 201 pag14 


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

La programmazione orientata agli oggetti è una scienza, o meglio una filosofia adattabile alla programmazione. Essa si basa su concetti esistenti nel mondo reale, con iquali abbiamo a che fare ogni giorno. L'astrazione di oggetti reali in classi fa superare la complessità della realtà. In questo modo possiamo osservare oggetti completamente differenti, riconoscendo il loro caratteristiche e funzionalità che li accomunano, associandoli quindi ad una stessa classe. 

La programmazione ad oggetti inoltre, utilizzando il concetto di incapsulamento, rende i programmi composti da classi che nascondono i dettagli di implementazione dietro ad interfacce pubbliche, le quali permettono la comunicazione tra gli oggetti stessi che hanno parte del sistema. è favorito il riuso di codice già scritto anche grazie a concetti quali l'ereditarietà ed il polimorfismo.

***Incapsulamento, ereditarietà, polimorfismo***

Astrazione e riuso, l'astrazione potrebbe definirsi come l'arte di sapersi concentrare solo sui dettagli veramente essenziali nella descrizione di un'entità. 

* Adoperiamo l'astrazione funzionale ogni volta che implementiamo un metodo. Infatti, tramite un metodo, riusciamo a portare all'interno di un'applicazione un concetto dinamico, sinonimo di azione, funzione. Per scrivere un metodo ci dovremmo limitare alla sua implementazione più robusta e chiara possibile.
* Adoperiamo l'astrazione dei dati ogni volta che definiamo una classe, raccogliendo in essa solo le caratteristiche e le funzionalità essenziali degli oggetti che essa deve definire nel contesto in cui ci si trova.
* Adoperiamo l'astrazione del sistema ogni volta che definiamo un'applicazione nei termini delle classi essenziali che devono soddisfare agli scopi dell'applicazione stessa.
* Il riuso è invece da considerarsi una conseguenza dell'astrazione e degli altri paradigmi della programmazione ad oggetti (incapsulamento, ereditarietà e polimorfismo).
  
### Incapsulamento
L'incapsulamento è la chiave della programmazione orientata agli oggetti. Tramite esso, una classe riesce ad acquisire caratteristiche di robustezza, indipendenza e riusabilità. Una qualsiasi classe è essenzialmente costituita da dati e metodo. La filosofia dell'incapsulamento è semplice. Essa si basa sull'accesso controllato ai dati mediante metodi che possono prevenire l'usura e la non correttezza. A livello di implementazione ciò si traduce semplicemente nel dichiarare privati gli attributi di una classe e quindi inacessibili fuori dalla classe stessa. L'accessi au dati potrà essere fornito da un'interfacca pubblica costituita da metodi dichiarati "public" e quindi accessibili da altre classi.


Il modificatore static, con static la programmazione ad oggetti trova un punto di incontro con quella strutturata ed il suo uso deve essere quindi limitato a situazioni di reale e concreta utilità. potremmo tradurre static con "condiviso da tutte le istanze della classe" oppure "della classe".
Potremmo usare static per marcare i metodi e gli attributi di una classe. Anche senza istanziare la classe, l'utilizzo di un membro static provocherà il caricamento in memoria della classe contenente il membro in questione, che quindi, condividerà il ciclo di vita con quello della classe.

Un metodo dichiarato static e public può considerarsi una sorta di funzione e perciò questo tipo di approccio ai metodi dovrebbe essere evitato nella maggior parte dei casi. La creazione di un metodo statico dovrebbe essere limitato solo ai casi in cui l'esecuzione del metodo non dipenda dalle caratteristiche dell'oggetto su cui viene chiamato il metodo.
Una variabile statica è condivisa a tutte le istanze dell'oggetto.

---
Modulo 6

# Ereditarietà e interfacce

Come tutti paradigmi che caratterizzano l'object orientation, anche il concetto di ereditarietà è ispirato a qualcosa che esiste nella realtà. Nel mondo reale noi classifichiamo tutto con classi e sottoclassi. Per esempio un cane è un animale, un aereo è un veicolo ecc.. In Java l'ereditarietà è una caratteristica che mette in relazione estensibilità più classi che hanno caratteristiche comuni. Il risultato immediato è la possibilità di ereditare codice già scritto.

Il modificatore final può essere utilizzato non solo con le variabili, ma anche con classi e metodi per influire sull'ereditarietà. Una classe dichiarata final non potrà essere estesa, un metodo dichiarato final non può essere riscritto in una sottoclasse.

Tutte le classi in Java estendono Object.
Implementare l'ereditarietà quando si tratta di una relazione "è un".

La parola chiave super, è un reference implicito all'intersezione tra l'oggetto corrente e la sua superclasse. In pratica questo reference ci permette di accedere ai componenti della siperclasse ed in particolare al costruttore.
La parola chiave super è strettamente legata al costruttore della superclasse tramite una sintassi speciale che sfrutta il reference super.

La chiamata al costruttore della superclasse mediante super() deve essere la prima istruzione di un costruttore e non potrà essere inserita all'interno di un metodo che non sia un costruttore.

Un metodo astratto non implementa un proprio blocco di codice, e quindi è privo di comportamento. Questo metodo non potrà essere invocato ma potrà essere soggetto a riscrittura in uan sottoclasse.
Una classe astratta non può essere istanziata.
In Java non esiste propriamente quella che viene definita "ereditarietà multipla", una classe può estendere solo una lcasse per volta.

Interfacce, dal punto di vista della proggettazione un'interfaccia è un'evoluzione del concetto di classe astratta. 

Con Java 8 è possibile definire all'interno delle interfacce anche metodi statici. Altra novità di Java 8 è la possibilità di dichiarare metodi concreti all'interno delle interfacce. Si parla di metodi di default perchè vengono dichiarati usano come modificatore la parola chaive default.

Differenze tra interfacce e classi astratte, non è possibile istanizare né classi astratte né interfacce. Inoltre il vantaggio comune che offrono sia le classi astratte sia le interfacce risiede nel fatto che esse possono obbligare le sottoclassi ad implementare comportamenti. Un'evidente differenza pratica tra i due conceetti è cosa possono definire. Un interfaccia può definire costanti statiche, metodi statici, metodi di default e metodi astratti. Una classe astratta è invce una classe noramle, che però non può essere istanziata e può contenere metodi astratti (ma questo non è necessario).


---
Il polimorfismo "in greco molte forme" è un altro concetto che dalla realtà è stato importato nelal programmazione ad oggetti. 

Polimorfismo per metodi, ci permette di utilizzare lo stesso nome per metodi differenti. Java trova una realizzazione pratica sotto due forme: l'overload e l'override.

In Java possono convivere metodi con lo stesso nome ma con differente firma. Su questo semplice concetto si fonda una delle implementazione più utilizzate di Java: l'overload, tramite esso il programmatore potrà utilizzare lo stesso nome per metodi diversi.

L'override è invece considerato un'importantissima caratteristica della programmazione ad oggetti. L'override "riscrittura" è il termine object oriented che viene utilizzato per descrivere la caratteristicha, che hanno le sottoclassi, di ridefinire un metodo ereditato da una superclasse. Una sottoclasse è sempre più specifica della classe che estende, e quindi potrebbe ereditare metodi che hanno bisogno di essere ridefiniti per funzionare correttamente nel nuovo contesto.
Le regole dell'override sono, il metodo riscritto nelal sottoclasse deve avere la stessa firma (nome e parametri) del metodo della superclasse. Il tipo di ritorno del metodo della sottoclasse deve coincidere con quello del metodo che si sta riscrivendo, o deve essere di un tipo che estende il tipo di ritono del metodo della superclasse. Il metodo ridefinito nelal sottoclasse non deve essere meno accessibile del metodo originale della sueprclasse.

Le annotazioni permettono di annotare qualsiasi tipo di componente in un programma Java, dalle variabili ai metodi, dalle classi alle annotazioni stesse. Con il termine annotare intendiamo qualificare, marcare. Ovvero, se per esempio annotaimo una classe, consentiremo ad un software (per esempio il compilatore Java) di rendersi conto che tale calsse è stata marcata, cosicché potrà implementare un certo comportamento di conseguenza.

L'operatore instanceof ci permette di tesare a quale tipo di istanza punta un reference. Tramite il casting possiamo risalire all'intervallo di puntamento dell'oggetto (l'accessibilità dell'oggetto). 

---
Eccezioni e asserzioni
I concetti relativi ad eccezioni, errori ed asserzioni e le relative gestioni permettono allo svilupaptore di scrivere software robusto, in modo che funzioni correttamente anche in situazioni impreviste.

Un'eccezione è una situazione imprevista che può presentarsi durante il flusso di un'applicazione. In Java è possibile gestirla utilizzando 5 semplici parole chaive: try, catch, finally, throw e throws. In Java è possibile definire le proprie eccezioni mediante la classe Exception e le sue sottoclassi. È anche possibile definire un errore, come una situazione imprevista non dipendente da un erroe commesso dallo sviluppatore. A differenza delle eccezioni gli errori non sono gestibili, questo concetto è implementato in Java mediante la classe Error e le sue sottoclassi.
Infine è possibile definire un'asserzione come una condizione che deve essere verificata affinchè lo sviluppatore consideri corretta una parte di codice. A differenza delle eccezioni e gli errori, le asserzioni rappresentano uno strumento per testare la robustezza del software. SI possono abilitare in fase di sviluppo e test, e eventualmente disabilitare al rilascio. Questo concetto è implementato mediante la parola chiave assert. 

Nella libreria standard di Java esiste una gerarchia di classi che mette in relazione la classe Exception e la classe Error. Entrambe queste classi estendono la superclasse Throwable.
Un ulteriore categorizzazione delle eccezioni è data dalla divisione delle eccezioni in checked e unchecked exception. Ci si riferisce alle RuntimeException e le sue sottoclassi come unchecked exceptino, tutte le altre eccezioni vengono dette checked exception. Se si utilizza un metodo che lancia una checked exception senza gestirla da qualche parte, la compilazione non andrà a buon fine. Da qui il nome "eccezioni controllate".

Non bisogna confondere il concetto di errore (problema che un programma non può risolvere) e di eccezione (problema non critico e gestibile). Il fatto che sia la classe Exception sia la classe Error estendano una classe che si chiama "lanciabile" (Throwable) è dovuto al meccanismo con cui la Java Virtual Machine reagisce quando si imabtte in una eccezione-errore.  Infatti, se il nostro programma genere un'eccezione durante il runtime, la JVM istanzia un oggetto della classe eccezione relativa al problema e lancia l'eccezione appena istanziata (tramite la parola chiave throw). Se il nostro codice non cattura (tramite la parola catch) l'eccezione, il gestore automatico della JVM interromperà il programma generando in output unformazioni dettagliate su ciò che è accaduto. Il meccanismo per la gestione delle eccezioni, come gia detto in precedenza, lo sviluppatore ha a disposizione alcuen aprole chiave per gestire le eccezioni: try, catch, finally, throw e throws. Se è necessario sviluppare una parte di codice che potenzialmente potrebbe scatenare un'eccezione, è possibile circondarla con un blocco try seguito da uno o più blocchi catch.

Il blocco catch deve dichiarare un parametro (come se fosse un metodo) del tipo dell'eccezione che deve essere catturata. Come per i metodi anche il blocco catch possono essere polimorfi, per esempio Exception la superclasse da cui discende ogni altra eccezione gestirebbe qualsiasi eccezione.
I blocchi catch vanno dichiarati dal meno generico al più generico, inoltre è possibile inserire più di un parametro all'interno separato dal carattere "|". È possibile far eseguire un altro blocco definendo la parola finally a seguito dei blocchi try e catch. Questo blocco viene eseguito in qualsiasi caso, sia se viene lanciata l'eccezione sia se non viene lancaita. Per esempio è possibile utilizzare un blocco finally quando esistono operazioni critiche che devono essere eseguite in qualsiasi caso. 

Try with resources, questo meccanismo dalla versione 7 di Java è stato rivisto per alcune classi. Questo permette la chiusura automatica degli oggetti che necessiterebbero di essere chiusi, una volta utilizzati. La sintassi prevede la dichiarazione dell'oggetto o oggetti da chiudere automaticament eocme parametri del blocco try. 

```Java
try (Scanner scanner = new Scanner(new File("test.txt"))) {
    while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
    }
} catch (FileNotFoundException fnfe) {
    fnfe.printStackTrace();
}
```

L'utilizzo di questo costrutto è permesso utilizzano tutte le classi che implementano l'interfaccia AutoClosable o l'interfaccia Closable.

# Eccezioni e propagazione dell'eccezione
Alcune tipologie di eccezioni che sono più frequenti:
- NullPonterExceotion: probabilmente la più frequente tra le eccezioni. Viene lanciata dallaJVM quando per esempio viene chiamato un metodo su di un referenxe che invece punta a null.
- ArrayIndexOutOfBoundsException: questa eccezione viene lanciata quando si prova ad accedere ad un indice di un array troppo alto o minore di zero.
- ClassCastException: eccezione particolarmente insidiosa. Viene lanciata a runtime quando si prova ad effettuare un cast verso un tipo di classe sbagliato.
  
Per definire nuovi tipi di eccezioni, la soluzione sarà estendere la clase exception o una delle sue sottoclassi. 
La propagazione delle eccezioni permette di rilanciare indietro una eccezione generata o eventualmente passata, la keyword throws nella firma del metodo seguita dal tipo di eccezione. Le checked exception devono essere per forza gestite per poter compilare, mentre le unchecked no, dato che si presentano solo al runtime.


# Caratteristiche avanzate Parte III

Una classe innestata (o anche classe interna nel caso non sia dichiarata statica) non è altro che una classe definita all'interno di un'altra classe.

Le classi anonime sono classi innestate, ma senza nome. La dichiarazione di una classe anonima richiede anche, contestualmente alla dichiarazione della classe venga anche istanziato un suo oggetto.

Tipi enumerativi, gli enumerated types o enum, si trattano di una tipologia di struttura dati, che si aggiunge alle classi, alle interfacce ed alle annotazioni. 
```Java
public enum MiaEnumerazione {
    UNO, DUE, TRE
}
```
abbiamo definito un'enum di nome MiaEnumerazione, definendo tre suo elementi detti anche valori, che si chiamano UNO, DUE, TRE.
In pratica è come se avessimo definito un nuovo tipo. Infatti l'enumerazione viene trasformata dal compilatore in una classe che estende la classe astratta Enum. Gli elementi di questa enum sono implicitamente di tipo MiaEnumerazioen e quindi non va specificato il tipo. Si trattano di costanti statiche. Un enum non si può estendere né può estendere un'altra enum o un'altra classe. Le enum vengono estese direttamente dal compilatore, ereditando dalla classe java.lang.Enum diversi metodi (come per esempio il toString()) definito in modo tale da restituire il nome dell'elemento.

In un' enum è possibile anche creare variabili, metodi e costruttori. I costruttori però sono implicitamentete dichiarati private non è possbile utilizzarli se non nell'ambito dell'enumerazione stessa. 

Le enum sono consigliate quando bisogna dichiarare un numero finito di valori da utilizzare per gestire il flusso di un'applicazione.

## Tipi generici

Con i generici la programmazione diventa più potente e robusta. Quando dichiariamo una classe (o un'interfaccia) possiamo renderla generica aggiungendo alla definizione uno o più tipi parametro. La sintassi fa uso di parantesi angolari che circondano gli identificatori dei tipi.

I Generics offrono la loro più classica utilità quando si usano classi e interfacce del framework Collection. 

```Java
public Interface List<E> extends Collection<E>
```
Il tipo E non è un tipo esistente, ma solo un identificatore generico sostituibile con qualsiasi altro tipo. Per convenzione quando si dichiara un tipo generico si usa un identificatore costituito da una sola lettera maiuscola, che dovrebbe rappresentare l'iniziale di un nome simbolico.

Una Map è una collezione che associa chiavi ai suoi elementi. Le mappe non possono contere chaivi duplicate ed ogni chiave può essere associata ad un solo valore. Le mappe sono molto diverse dalle liste. Non sono ordinate ma consentono un accesso in lettura (grazie alla chiave) più veloce rispetto ad una lista.


# Definizione di annotazione (metadato)
Tre tipi di annotazioni

* Annotazioni ordinarie
* Annotazioni a valore
* Annotazioni marcatrici
  


Annotare Annotazioni
Nel package java.lang.annotation sono definite sei meta-annotazioni.
Retention, Target, Documented, Inherited, Native e Repeatable.

Targhet, il suo scopo è specificare gli elementi del linguaggio a cui è applicabile l'annotazione che si sta definendo. 

Retention, specifica come deve essere conservata dall'ambiente Java l'annotazione a cui viene applicata.
In base al valore di RetentionPolicy (SOURCE, l'annotazione è eliminata dal compilatore; CLASS l'annotazione viene conservata anche nel file . class ma ignorata dalla JVM; RUNTIME l'annotazione viene cosnervata anche nel file . class e letta dalla JVM).

Documented, include nella documentazione generata da Javadoc anche le annotazioni a cui è applicata.

Inherited, questa annotazione permette alle annotazioni applicate a classi (e solo a classi) di essere ereditate.

Repeatable, necessaria quando bisogna annotare più volte con la stessa annotazione un elemento.

---

Package java.util e Data-Time-API

Il package util è stato creato per fornire classi di utilità.

La classe Properties rappresenta un insieme di proprietà che possono essere salvate in un file.
Estende la classe Hashtable e ne eredita i metodi, con i metodi load e store.


Date-Time API
![alt](assets/Immagine%202022-10-03%20143429.png)


---
Gestione dei thread









