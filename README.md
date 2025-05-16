# API_Mongo
## Acosta Daniel, Munoz Karolayn i Segura Alba

### Millores i preguntes de reflexió
1. Afegiu un endpoint que cerqui per un camp de tipus String on feu servir regex. Afegiu el que calgui al servei, repositori, etc.

![alt text](images/image12.png)

Usuaris amb "an":

![alt text](images/image13.png)

Usuaris amb "la":

![alt text](images/image14.png)

2. Què caracteritza una api reactiva com aquesta i què la fa diferent d’una api síncrona amb MVC com les treballades anteriorment?

3. Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?

4. Què és record? Un record utilitza getters i setters? Justifiqueu la resposta


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