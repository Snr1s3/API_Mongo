# API_Mongo
## Acosta Daniel, Munoz Karolayn i Segura Alba

### Endpoints de l'API
L’API proporciona els següents endpoints:

![alt text](images/image.png)

- POST /api/v1/usuaris/save:
Creació d'usuari:

![alt text](images/image2.png)

![alt text](images/image3.png)

- GET /api/v1/usuaris/{id}:
Trobar usuari per id:

![alt text](images/image4.png)

- PUT /api/v1/usuaris/update:

Usuari existent:

![alt text](images/image5.png)

Usuari existent modificat:

![alt text](images/image6.png)

![alt text](images/image7.png)

- GET /api/v1/usuaris/all:
Tots els usuaris existents:

![alt text](images/image9.png)

- DELETE /api/v1/usuaris/{id}:

Usuaris existents:

![alt text](images/image8.png)

Usuaris existents després d'eliminar:

![alt text](images/image10.png)

![alt text](images/image11.png)

### Millores i preguntes de reflexió
## Afegiu un endpoint que cerqui per un camp de tipus String on feu servir regex. Afegiu el que calgui al servei, repositori, etc.

![alt text](images/image12.png)

Usuaris amb "an":

![alt text](images/image13.png)

Usuaris amb "la":

![alt text](images/image14.png)


## Què caracteritza una api reactiva com aquesta i què la fa diferent d’una api síncrona amb MVC com les treballades anteriorment?

En contrast, Spring MVC utilitza un fil per petició, cosa que pot generar problemes sota molta càrrega. Spring MVC, en canvi, treballa amb objectes i col·leccions sense gestió automàtica del flux dʼesdeveniments. Spring MVC és més simple però menys eficient a escenaris d'alta demanda. És més adequada per aplicacions senzilles, de mida petita o mitjana, on la simplicitat del desenvolupament és una prioritat.

## Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?

En programació reactiva, Mono<T> representa un flux que emet com a màxim un sol element (o cap), ideal per a operacions que tornen un únic objecte, com a findById. D'altra banda, Flux<T> representa un flux amb múltiples elements, útil per a llistes o streams continus com a findAll.
Són útils per que funcional mitjançant map, filter i flatMap, controlar la velocitat del flux de dades i evitar sobrecàrregues i tenen gestió asíncrona, que millora el rendiment ja que executar tasques en fils diferents del principal.

## Què és record? Un record utilitza getters i setters? Justifiqueu la resposta

És una forma de declarar classes immutables, setters no utilitza perquè és immutable i getters si fa servir, però uns autogenerats, per exemple el camp descripció el getter seria descripció().
