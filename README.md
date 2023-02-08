"# db-nations" 
Esercizio di oggi:
Nome repo: db-nations
MILESTONE 1
Creare un nuovo database in DBeaver e importare lo schema inallegato.Scrivere una query SQL che restituisca la lista di tutte le nazionimostrando nome, id, nome della regione e nome del continente, ordinataper nome della nazione.
MILESTONE 2
Creare un progetto Maven, configurato in modo da potersi connettere adun database MySQL.Nel progetto creare un programma che esegua la query della Milestone1 e stampi a video il risultato.
MILESTONE 3
Modificare il programma precedente per fare in modo che un utentepossa inserire una ricerca e filtrare i risultati:- chiedere all’utente di inserire una stringa di ricerca da terminale- usare quella stringa come parametro aggiuntivo della query inmodo che i risultati vengano filtrati con un contains (ad esempio sel’utente cerca per “ita”, il risultato della query conterrà sia Italy che Mauritania
BONUS
Dopo aver stampato a video l’elenco delle country, chiedere all’utente diinserire l’id di una delle country.Sulla base di quell’id eseguire ulteriori ricerche su database, cherestituiscano:● tutte le lingue parlate in quella country● le statistiche più recenti per quella country


importato archivio esterno MySQL Connector/J scaricato in .jar dal link : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.30

MySQL Connector/J è un driver JDBC di tipo 4, il che significa che è una pura implementazione Java del protocollo MySQL e non si basa sulle librerie client MySQL. Questo driver supporta la registrazione automatica con Driver Manager, controlli di validità standardizzati, eccezioni SQL categorizzate, supporto per conteggi di aggiornamenti elevati, supporto per varianti data-ora locali e offset dal pacchetto java.time, supporto per l'elaborazione XML JDBC-4.x, supporto per informazioni sul client per connessione e supporto per NCHAR, NVARCHAR ...
