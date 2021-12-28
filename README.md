# Kata6
## Ingeniería del Software II
Finalidad del proyecto: fabricar los juguetes pertenecientes a una empresa juguetera. Patrón de diseño creacional.
<br />Los juguetes tienen un serial para identificarlos.
<br />Para crear un juguete, el programa recibe los inputs del usuario. Para salir del programa, el programa recibe el comando 'exit' del usuario.

### Versión 1
Se fabrica sólo coches de juguete. Se crea un coche de juguete cuando el usuario introduce un caracter o palabra distinta a 'exit'.

### Versión 2 
Se fabrican coches y helicópteros. Según el tipo de juguete que introduzca el usuario, se creará el juguete. El tipo puede ser 'car' o 'helicopter'.
<br />Si el usuario introduce un comando distinto de 'exit' o el tipo de juguete, no se reconocerá y el programa esperará al siguiente input.

### Versión 3 
Se añade el concepto de negocio. A través de este negocio, se llama a los métodos de creación de juguetes.
<br />Se mantiene el sistema de comandos de la versión 2.

### Versión 4
Se añade la interfaz de juguete para simplificar su creación. Dos modelos: coche y helicóptero. 
<br />Se mantiene el sistema de comandos de la versión 2.

### Versión 5
Se añade el paquete branches al que se le añaden dos clases referentes a dos factorías: americana y asiática.
<br />A la interfaz de juguete se le asignan dos juguetes por cada factoría: coche y helicóptero.
<br />Se mantiene el sistema de comandos de la versión 2.

### Versión 6
En esta versión, la factoría no puede modificar los procesos propuestos por la empresa. 
<br />Se añade el paquete factories. 
<br />Se mantiene el sistema de comandos de la versión 2.

### Versión 7
Se crean diferenciaciones de factorías. Por cada juguete y origen, tendremos una factoría distinta.
<br />Se mantiene el sistema de comandos de la versión 2.

### Versión 8
Cada juguete consta de unos componentes. Los componentes pueden ser ruedas, rotor o motor.
<br />Se mantiene el sistema de factorías. Por cada juguete y origen, hay una factoría distinta.
<br />Se añade el método prepare() para simplificar la fabricación de los distintos componentes de cada juguete.
<br />Se mantiene el sistema de comandos de la versión 2.
