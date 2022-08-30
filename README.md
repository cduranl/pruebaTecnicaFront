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

- La estructura del proyecto esta basadao en maven, la cual se encuentra desarrollado con el lenguaje JAVA utilizando selenium 
con TestNG, donde se encuentran 5 test cases cada una con su respectiva nombre 'TestCase00X', (X = 1 al 5), estos test case se 
encuentran en un test suite bajo el nombre 'AllTestSuite'. Cada test case lleva su correspondiente ID la cual lo identifica en 
el documento de diseño y análisis.

    1. TestCase001 (CP_001): Validar que se muestra el formulario del login.
    2. TestCase002 (CP_002): Validar que se muestra el formulario de registrarse.
    3. TestCase003 (CP_003): Validar una busqueda vacia en la barra de busqueda de productos.
    4. TestCase004 (CP_004): Validar la busqueda de un producto en la barra de busqueda de productos.
    5. TestCase005 (CP_005): Validar que se agrega un producto al carrito de compras.
    
 **_Posibles Bugs y Errores:_**
 
   1. Al ingresar datos de una cuenta para validar un login mediante un navegador automatizado nos tira un error del sistema la cual
      no nos permite acceso a la cuenta de la página.
      - Se quitaron estos tests y se reemplazaron por 2 nuevos tests.
