package com.baeldung;

public interface PasswordService {
    /**
     * Calcola l'hash della stringa in input
     * @param input la stringa
     * @return hash della stringa input
     */
    String hash(String input);

    /**
     * Informazioni sull'algoritmo usato
     * @return nome dell'algoritmo
     */
    String algorithm();

}
