# Ejemplo (Java) para Geopagos ar.

* tecnología: Spring boot

* explicación: básicamente se basa en unos servicios que cachean en memoria una implementación de geometrias
  para su posterior consulta.

* uso: 
    > realizar la petición :
    > * http POST  http://localhost:8080/geometric  type='circle' base=null height=null diameter=10
    > esto guardara los valores para el objeto geometrico de tipo circle.
    > este se podra consultar de las siguientes formas:
    > * http GET  http://localhost:8080/geometric/diameter/circle para su diametro
    > * http GET  http://localhost:8080/geometric/superface/circle para su superficie etc.


> ejemplo de peticion son realizados con la herramienta de terminal [Httpie](https://httpie.org/)
