# Unified Modeling Language

![uml](./assets/images/umlImg/uml-pic.jpg)

## Intro 
 In ingegneria del software, UML (linguaggio di modellazione unificato) è un linguaggio di modellazione e di specifica basato sul paradigma orientato agli oggetti. 

### Storia 
I linguaggi per la mdoellazione orientata agli oggetti iniziarono a svilupparsi in diversi contesti a partire dagli anni ottanta. Si trattava di notazioni di varia natura, che consentivano di descrivere la struttura di un sitema software a oggetti, in termini di classi e relazioni fra classi, ed eventualmente il suo comportamento dinamico. 

### Caratteristiche generali
La notazione UML è semi-grafica e semi-formale; un modello UML è costituito da una collezione organizzata di diagrammi correlati, costruiti componendo elementi grafici con significato formalmente definito, elementi testuali formali, ed elementi di testo libero. Ha una semantica molto precisa e un grande potere descrittivo.

### Applicazioni
UML non definisce alcuno specifico metodo per la creazione di modelli. UML può quindi essere utilizzato nel contesto di diversi approcci. UML consente di costruire modelli object-oriented per rappresentare domini di diverso genere. Nel contesto dell'ingegneria del software, viene usato soprattuto per descrivere il dominio applicativo di un sistema software e/o il comportamento e la struttra del sistema stesso. Il modello è struttrato secondo un insieme di viste che rappresentano diversi aspetti di cio che si vuole modellare (funzionamento, struttura, comportamento e cosi via), a scopo sia di analisi sia di progetto, mantenendo la tracciabilità dei concetti impiegati nelle diverse viste. 

---

### UML diagram type
![uml-Types](./assets/images/umlImg/UML-Diagram-types.png)

---
# Class Diagram
Uml class diagram illustra la struttura del sistema descrivendo le classi, i loro attributi, metodi e le loro relazioni.

Il nome della classe viene scritto nella parte più alta, seguito da gli attributi di classe con i loro tipi (es nome: String), e infine nell'ultima partizione vengono inseriti i metodi della classe, il loro nome seguito dal tipo di ritorno del metodo (es getName(): String).
Prima degli attributi e dei metodi vengono i modificatori di accesso, + per Public, - per Private, # per Protected e ~ per Package local. 

### Relazioni tra classi

![relazioni class diagram](./assets/images/umlImg/Uml_classes_relazioni.png)

##### Association
Se due classi interagiscono tra di loro allora questo ne implica un associazione, le due classi vengono collegate da una linea. Spesso viene anche indicato la molteplicità ovvero il numero di oggetti che prendono parte alla relazione (One to One, One to Many, Many to Many).

##### Inheritance
Spesso anche chiamata generalizzazione, è la schematica rappresentazione di una classe padre e i suoi discendenti. La direzione della freccia è sempre diretta verso la classe padre. (es Shape classe padre, Square, Rectangle, Circle classi discendenti).

##### Realization
Spesso si riferisce alla relazione tra interfacce e oggetti che implementano quell'interfaccia. La freccia punta all'interfaccia implementata.

##### Dependency
Quando un oggetto usa un oggetto di un'altra classe e questo non viene memorizzato in qualche field, si realizza una dipendenza, una dipendenza è un caso speciale di associazione (es in un metodo viene passato un oggetto di un'altra classe).

##### Aggregation
Si parla di aggregazione quando una classe è composta da oggetti appartenenti ad altre classi (es la classe Car avra bisogno di un Motore). La freccia va dai componenti aggregati alla classe che li aggrega, disegnando un rombo non riempito.

##### Composition 
Simile all'aggregazione ma una volta che l'aggregatore viene distrutto anche le altre classi vengono distrutte (es il nostro corpo è composto da organi, ma questi non possono funzionare da soli). Si rappresenta allo stesso modo dell'aggregazione ma la punta del rombo è riempita.

---
# Component Diagram
Un diagramma dei componenti, noto anche come diagramma dei componenti UML, descrive l'organizzazione e il cablaggio dei componenti fisici in un sistema. I diagrammi dei componenti sono spesso disegnati per aiutare a modellare i dettagli di implementazione e verificare che ogni aspetto delle funzioni richieste del sistema sia coperto dallo sviluppo pianificato.
Il component diagram è simile al class diagram ma fa un focus sui componenti del sistema, rappresenta il funzionamento del sistema più ad alto livello dove ogni componente è responsabile di un obiettivo e interagisce con altri componenti.

![component diagram](./assets/images/umlImg/uml-component-diagram.jpg)

##### Component
Un componente è un blocco di unità logica del sistema, un'astrazione leggermente superiore rispetto alle classi. È rappresentato come un rettangolo con un rettangolo più piccolo nell'angolo in alto a destra con le schede o la parola scritta sopra il nome del componente per distinguerlo da una classe.

##### Interface
Un'interfaccia (cerchio o semicerchio su uno stick) descrive un gruppo di operazioni utilizzate (richieste) o create (fornite) dai componenti. Un cerchio completo rappresenta un'interfaccia creata o fornita dal componente. Un semicerchio rappresenta un'interfaccia richiesta.

##### Dependencies
Una dipendenza viene rappresentata da una freccia tratteggiata.

##### Port
Le prote sono rappresentate utilizzando un quadrato lungo il bordo del sistema o un componente. Una porta viene spesso utlizzata per aiutare a esporre le interfacce richieste e fornite di un componente.

--- 
# Deployment Diagram
Il deployment diagram illustra le configurazioni a runtime e i componenti, descrive un sistema in termini di risorse hardware, dette nodi, e di relazioni fra esse.
Spesso si utilizza il diagramma anche per le componenti software.

![Deployment diagram](./assets/images/umlImg/Deployment_8_Final.webp)

##### Nodo
Il nodo è raooresentato tramite un cubo ed un nome, raffigura una risorsa hardware disponibile dal sistema.

##### Relazioni
Il diagramma descrive le relazioni in termini di linee che uniscono i diversi nodi.

--- 
# Object Diagram
L'object Diagram o Diagramma degli oggetti è un diagramma di tipo statico previsto dall'UML per descrivere un sistema in termini di oggetti e relative relazioni. Il diagramma è molto simile a quello del Class Diagram e descrive gli oggetti e le relative relazioni che sono istanziate in un determinato tempo t+1.

![Object diagram](./assets/images/umlImg/Object_diagram.png)

--- 
# Package Diagram
Un package è usato per raggruppare elementi e fornire un namesapce per gli elementi raggruppati. Un package può contenere altri package, fornendo così un'organizzazione gerarchica dei package. Consentono una maneggievole organizzazione delle miriadi di elementi che un modello UML comporta.
Rende immediato le dipendenze tra le varie parti del sistema, utile anche per organizzare l'ordine di compilazione. I package diagram è usato soprattutto per strutturare ad alto livello il sistema. Ogni package ha il suo nome che deve essere unico. 


![package diagram](./assets/images/umlImg/08-package-diagram-order-subsystem.png)

--- 
Behavioral Diagrams
--- 

# Use case Diagram
Gli Use Case Diagram o diagrammi dei casi d'uso, sono diagrammi dedicati alla descrizione delle funzioni o servizi offerti da un sistema, cosi come sono percepiti e utilizzati dagli attori che interagiscono col sistema stesso. Gli usce case diagram sono spesso realizzati nella prima fase di proggettazione, specificano il contesto del sistema,  catturano i requisiti del sistema, validano l'architettura del sistema e validano l'implementazione favorendo anche la generazione di casi di test. Tuttavia, è possibile che durante la proggettazione potrebbero essere usati per modellare i servizi offerti da un determinato modulo o sottosistema ad altri moduli o sottosistemi.

##### System
Il sistema è rappresentato da un rettangolo vuoto. Possiamo trovare al suo interno i "model element", rappresentanti delle caratteristiche del sistema. 

##### Actor
L'attore è colui che interagisce con il sistema, rappresentato da un umanoide, l'attore gioca il ruolo di "utente" del sistema, può rappresentare un ruolo coperto da un certo insiseme di entità interagenti col sistema.
##### Use Case
Un caso d'uso è rappresentato graficamente come un'ellisse contenente il nome del caso d'uso. Formalmente, lo Use Case è un classifier dotato di comportamento; lo si potrebbe intendere come una classe di comportamenti correlati. Praticamente, uno use case rappresenta una funzione o servizio offerto dal sistema a uno o più attori. La funzione deve essere completa e significativa dal punto di vista degli attori che vi partecipano.

## Relazioni
##### Associazione tra actor e use case
La relazione fondamentale negli Use Case Diagram è quella che congiunge gli attori con i casi d'uso a cui essi partecipano, ovvero l'associazione. Un attore può essere associato a un qualsiasi numero di casi d'uso, e viceversa. Pur non richiedendo ulteriori informazioni, l'associazione fra gli use case e gli actor si considera implicitamente dotata di una semantica più specifica rispetto all'associazione generica UML; essa infatti implica uno scambio messaggi fra attori e use case associati.

##### Generalizzazione
Possano essere espresse relazioni di generalizzazione sia fra attori che fra casi d'uso. In entrambi i casi, la semantica della generalizzazione può essere dedotta, almeno nelle linee generali, dal principio di sostituzione di Liskov. Un "sottoattore", quindi, deve essere in grado di partecipare a tutti i casi d'uso a cui partecipa il "superattore"; eventualmente può partecipare a use case aggiuntivi, oppure partecipare in modo diverso a qualche use case "ereditato". Un "sotto-caso d'uso" deve fornire lo stesso servizio generale del "super-caso d'uso", eventualmente producendo valore aggiuntivo, o fornendolo a qualche tipologia di attore aggiuntiva; o seguendo un procedimento parzialmente diverso per ottenere il risultato, e così via.

##### Inclusione
La relazione di inclusione fra use case, rappresentata da una linea tratteggiata con indicazione dello stereotipo «include», indica che la funzione rappresentata da uno dei due use case (quello alla base della freccia) include completamente la funzione rappresentata dall'altro (quello alla punta). Si può esprimere questa relazione anche con il verbo usa («uses» era uno stereotipo utilizzato in UML prima di «include»), a patto di ricordare che, almeno nel contesto della Use Case View, questo usa dev'essere esente da considerazioni implementative (come riferimenti impliciti al concetto di sottoprogramma).

##### Estensione
La relazione di estensione fra use case, rappresentata da una linea tratteggiata con indicazione dello stereotipo «extend», indica che la funzione rappresentata dallo use case "estendente" (alla base della freccia) può essere impiegata nel contesto della funzione "estesa" (lo use case alla punta), ovvero ne rappresenta una sorta di arricchimento. Questa relazione viene spesso utilizzata per isolare in uno use case a parte la specifica di attività opzionali o eccezionali che potrebbero aver luogo durante l'espletamento della funzione principale.

Le relazioni di estensione e inclusione rappresentano concetti vicini, l'ordinamento delle frecce nei due casi è "opposto". La sottile differenza fra i due stereotipi è :

* "Include" indica un frammento che viene ***sempre*** eseguito durante l'esecuzione del caso d'uso alla base della freccia.
* "Extend" indica un frammento che ***può*** essere eseguito in determinate circostanze del caso d'uso alla punta della freccia.

##### Tips
- Organizza la struttura del diagramma dei casi d'uso dalla prospettiva degli attori.
- I diagrammi dei casi d'uso dovrebbero essere inizialmente scritti nel modo più semplice e al più alto livello possibile.
- I diagrammi use case sono basati sulle funzionalità e dovrebbero concentrarsi su "what" e non "how".

![use case diagram](./assets/images/umlImg/use_case_diagram.png)

--- 
# Activity Diagram
Il diagramma di attività è un tipo di diagramma che permette di descrivere un processo attraverso dei grafi in cui i nodi rappresentano le attività e gli archi l'ordine con cui vengono eseguite.
Un activity diagram descrive gli aspetti dinamici del sistema e mostra come le varie azioni sono coordinate.

Il nodo iniziale (cerchietto tutto nero) è l'inizio della nostra attività, le direzioni delle frecce sono il proseguirsi delle azioni (anche chiamato control flow),  le azioni sono rappresentate da un rettangolo smussato, i nodi di decisione rappresentano dei "test conditions" e vengono rappresentati con un rombo, il rettangolo tutto nero rappresenta un fork node che divide il flow in azioni parallele o concorrenti, questi flow saranno poi ricongiunti attraverso il join node. L'activity termina poi con il final node, un cerchietto nero con piccolo sfondo bianco. 

##### Responsabilità
Il sistema o l'attore responsabile di una determinata attività è rappresentato tramite una descrizione a cui afferisce una porzione dello schema, individuata da una linea verticale (swimlane).

![activity diagram](./assets/images/umlImg/activity_diagram.png)

--- 
# State Diagram
State diagram (o state machine diagrams) mostrano come un entità reagisce e si muove ai vari eventi, muovendosi da uno stato all'altro. Mostra come un oggetto reagisce in modo differente allo stesso evento a seconda dello stato in cui è in quel momento. Gli oggetti non sono l'unico elemento a cui uno state diagram può essere applicato (pensiamo agli attori, sottosistemi ecc..), gli state fiagram descrivono tutti gli eventi, stati e transizioni per un singolo oggetto.


![state d diagram](./assets/images/umlImg/state-d-description.png)


![state diagram](./assets/images/umlImg/state-machine-diagram-explained.webp)

--- 
# Sequence Diagram
I Sequence diagram sono diagrammi che spiegano in dettaglio come le operazioni sono eseguite, catturano le interazioni tra gli oggetti nel contesto della loro collaborazione, mostrando le interazioni nel tempo e la loro organizzazione.

In linea orizzontale troviamo i vari oggetti, mentre quella verticale fa riferimento al tempo. 
La linea orizzontale mostra tutti gli elementi che partecipano all'interazione, possono apparire in qualsiasi ordine, tipicamente sono organizzati da sinistra a destra nell'ordine che compaiono al momneto della loro prima interazione. La linea orizzontale mostra la progressione nel tempo, ma l'ordine delle interazione è denotato dall'ordine di esecuzione che è la stessa sequenza.

##### Actor
L'attore rappresenta un oggetto che interagisce con il sistema. Gli oggetti, o attori posssono rappresentare vari ruoli, come l'utente o sistemi esterni.

##### Lifeline
Rappresenta un individuo che partecipa alla sequenza, mostrando anche il suo tempo di vita.

###### Activation
La piccola linea che parte dalla lifeline indica il periodo durante il quale l'elemento sta eseguendo un'azione. Questa linea verrà poi nella lifeline chiusa, ovvero specificherà che l'azione iniziata è terminata.

###### Call Message
Usato per chiamare procedure, operazioni, o semplicemente il controllo del flusso. Viene indicato da una freccia che tocca la lifeline di un'altro oggetto. Queste chiamate possono essere sincroni (aspettano una risposta) o asincrone (non si aspetta una risposta).

###### Return Message
Rappresentato da una linea tratteggiata con una punta di freccia piena, un messaggio di ritorno è un messaggio ritornato da un oggetto a cui è stato precedentemente inviato un messaggio. I messaggi di ritorno sono validi solo da messaggi sincroni e sono essi stessi sincroni.

###### Self Message
Un oggetto invia un messggio (o comando) a se stesso.

###### Create Message
Nel caso in cui un messaggio crea un partecipante, disegneremo una freccia tratteggiata con punta piena verso il rettangolo che rappresenta l'oggetto.

###### Destroy Message
La distruzione di un partecipante è rappresentata da una grande X sulla sua lifeline. Un destroy message è un messaggio in cui un partecipante distrugge un'altro tramite l'invio di questo messaggio.

###### Note o commenti
Possiamo attaccarle ai vari elementi aggiungendo più informazioni semantiche.

###### Sequence Fragments
Un sequence fragments è rappresentato da un box, dove in alto a sinistra è indicato il nome del tipo di fragment; 
alt (multiple alternative fragments) dove solo una delle condizioni viene eseguita può essere considerata come un if-then-else o uno switch case;
opt frammento eseguito solo se si verifica una determinata condizione o un gruppo di esse; 
par (parallel message processing) gruppo di messaggi divisi da una linea orizzontale tratteggiata; 
loop simulano i loop; 
break segnalano una terminazione precoce tipicamente per i loop;


![sequence diagram](./assets/images/umlImg/Sequence-Diagram-Break-Communication-Fragment.png)

