package comportamentali.chainResponsibility;

/**
 * Chain of responsibility
 *
 * Questo design pattern cerca di evitare l'accopiamento tra il
 * mittente di una richiesta al suo destinatario, dando  la
 * possibilità ad un oggetto di gestire la richiesta.
 * Concatenando gli oggetti riceventi, la richiesta passa lungo
 * la catena finchè un oggetto non la gestisce.
 */