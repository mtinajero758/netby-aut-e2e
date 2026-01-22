===============================================================
# Proyecto de Automatización E2E y Pruebas de Carga - NTT DATA
===============================================================
Desarrollado por: MATC

Este proyecto contiene la solución a los ejercicios de automatización de pruebas UI con **Serenity BDD** (Screenplay) con Cucumber para validar el flujo de compra.
------------------------------------------------------------------------------------------------------------------

## 1. Prerrequisitos
------------------------------------------------------------------------------------------------------------------
* Java JDK: 17.0.12
* Framework de Automatización: Serenity BDD 4.1.8
* Framework de Pruebas: Cucumber 7.16.1
* Motor de Pruebas: JUnit 4.13.2
* Herramienta de Construcción: Maven 3.11.0
* Navegador: Google Chrome (v144+)
* Driver: Selenium WebDriver 4.19.0
* IDE Sugerido: IntelliJ IDEA 2025.3

2. Comandos de instalación
------------------------------------------------------------------------------------------------------------------
* Asegurarse de tener configurada la variable de entorno JAVA_HOME apuntando al JDK 17.
* Tener Maven instalado y configurado en el PATH del sistema.
* git clone <URL_DEL_REPOSITORIO>
* cd serenity-e2e
* mvn clean install -DskipTests

3. Instrucciones para ejecutar los test
------------------------------------------------------------------------------------------------------------------
Opción A: Desde IntelliJ IDEA (Recomendado para Debugging)
   1. Abrir la clase 'CucumberTestSuite' ubicada en 'src/test/java/nttdata/runners/'.
   2. Hacer clic derecho sobre la clase y seleccionar "Run 'CucumberTestSuite'".

Opción B: Desde la Terminal (Consola de comandos o Terminal de IntelliJ)
   1. Navegar a la carpeta raíz del proyecto:
      cd C:\Users\manue\IdeaProjects\serenity-e2e
   2. Ejecutar el comando:
      mvn clean verify

4. Información adicional
------------------------------------------------------------------------------------------------------------------
Serenity genera reportes detallados en formato HTML. Para consolidarlos:
1. Ejecutar en terminal: mvn serenity:aggregate
2. Ver el reporte en: target/site/serenity/index.html

------------------------------------------------------------------------------------------------------------------
Referencia: https://docs.github.com/es/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes
Recordar que un readme correcto debe tener la extensión .md y debe estar dentro del proyecto.
