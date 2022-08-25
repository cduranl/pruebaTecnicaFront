# Prueba Ingreso Front (Selenium + Rest Assured)

Este proyecto nos permite ejectuar 5 casos de pruebas automatizadas utilizando la página web de:

- https://www.falabella.com/falabella-cl

Puedes instalar el proyecto clonando el repositorio:

- $ git clone https://github.com/cduranl/pruebaTecnicaFront/


Luego de haber clonado el proyecto, puedes utilizar los siguientes comandos dentro del terminal
para lanzar los test:

1. Para lanzar el test suite completo (incluye los 5 caso de pruebas):

    mvn -P AllTestSuite test
  
2. Para lanzar un test case individualmente, puedes utilizar el siguiente comando:

    mvn -Dtest=test.TestCase00'n'
  
  *Importante reemplazar el 'n' por un numero entre 1 al 5, dependiendo cual test case deseas lanzar.*
  
  
 #### Estructura del proyecto

- La estructura del proyecto esta basadao en maven, la cual se encuentra desarrollado con el lenguaje JAVA utilizando selenium.
