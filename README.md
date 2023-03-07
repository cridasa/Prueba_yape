REQUISITOS

Java JDK 1.8 (Variables de entorno configuradas) Gradle 5.6.4 o superiores (Variables de entorno configuradas) Eclipse IDE o IntelliJ IDEA Cucumber Git

CONSTRUIDO CON

Screenplay : Patron de diseño orientado a objetos. Gradle : Herramienta para la construccion de codigo y gestor de dependencias. Selenium webdriver : Framework para la automatizacion de navegadores web. Cucumber : Framework para automatizar pruebas con BDD Serenity BDD : Biblioteca de informes de codigo abierto. Gherkin: Lenguaje especifico de dominio legible por el negocio.

ESTRUCTURA DE LA AUTOMATIZACION

Exceptions: Capturan excepciones personalizadas cuando hay. Algun fallo en la automatizacion. Interactions: Representan una accion directa del usuario con la interfaz del sistema. Model: En esta capa se encuentran todos los objetos complejos del negocio como los datos para ser usuada dentro de cualquier capa del proyecto. Questions: Especifica el accert de las pruebas. Donde se verifican los resultados de las operaciones realizadas en las capas anteriores. Task: Representan operaciones importantes que realiza el actor para especificar el flujo que debe seguir para llegar al resultado esperado. Userinterface: Se. Realiza el mapeo de los elementos de la interfaz de la pagina web a automatizar. Runner: Estas clases son las que se ejecutan por serenity cuando se corren las pruebas. Steps definitions: Son clases que mapean cada linea de los escenarios definidos en lenguaje Gherkin a metodos java. Feature: En este se realizan nuestros escenarios de pruebas basados en lenguje Gherkin . Utils: Clases que contienen funcionalidades. Que se pueden reusar en cualquier capamdel proyecto.

ACLARACIONES

Se realiza la automatizacion de servicios APIREST sin ningun problema ni contra tiempo, en cuanto a la automatizacion del anexo tuve varios inconvenientes, inicialmente cuando aplique a la vacante informe que si bien he automatizado en mobile hace ya bastante tiempo que no lo hago y no tengo los recursos en el momento para realizar la automatizacion, por lo cual decidi hacer el ejercicio Web a traves del entorno de escritorio.
