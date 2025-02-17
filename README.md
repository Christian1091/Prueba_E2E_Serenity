# Automatización Serenity BDD E2E

Este es un proyecto de ejemplo donde se automatizan pruebas de una aplicación web utilizando el patrón **Serenity**.

## Desarrollo
* IntelliJ IDEA 2023.3.3
* JDK 17: Verificar Java en las variables de entorno.
* Maven 3.9.9 : Importante que tengan Maven en las variables de entorno.
* Serenity BDD Screenplay se instalará automáticamente al ejecutar el proyecto junto a otras dependencias necesarias, estas se encuentran en el pom.xml
* Navegador web de preferencia:
  * Google Chrome
 
## Plugins necesarios en el IDE
* Cucumber for Java
* Gherkin

## Descripción

El objetivo de este proyecto es realizar una prueba funcional automatizando el flujo de compras de productos en la página de **Saucedemo**.

## Funcionalidades

Para el ejercicio del flujo de compras **E2E** 

* Se realiza la autenticación del usuario
* Se agrega dos productos al carrito
* Se visualiza el carrito con los productos
* Se completa el formulario para la compra
* Se finaliza la compra hasta ver la confirmación **“THANK YOU FOR YOUR ORDER”**

## Ejecutar las pruebas

### **Clonar repositorio**

git clone https://github.com/Christian1091/Prueba_E2E_Serenity.git

* Navegar al directorio del proyecto: **cd Prueba_E2E**
* Instalamos las dependencias: **npm install**

## Ejecutar el proyecto

* Dirigirse al archivo **RunnersMain** que se encuentra en la rura: **src/test/java/runners**
* Click sobre **Run** en la clase **RunnerMain**



