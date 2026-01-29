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

## 2. Comandos de instalación
------------------------------------------------------------------------------------------------------------------
* Asegurarse de tener configurada la variable de entorno JAVA_HOME apuntando al JDK 17.
* Tener Maven instalado y configurado en el PATH del sistema.
```bash
 git clone <URL_DEL_REPOSITORIO>
 cd serenity-e2e
 mvn clean install -DskipTests
```

## 3. Instrucciones para ejecutar los test
------------------------------------------------------------------------------------------------------------------
Opción A: Desde IntelliJ IDEA (Recomendado para Debugging)
1. Abrir la clase 'CucumberTestSuite' ubicada en 'src/test/java/nttdata/runners/'.
2. Hacer clic derecho sobre la clase y seleccionar "Run 'CucumberTestSuite'".

Opción B: Desde la Terminal (Consola de comandos o Terminal de IntelliJ)
1. Navegar a la carpeta raíz del proyecto:
   cd C:\Users\manue\IdeaProjects\serenity-e2e
2. Ejecutar el comando:
   ```bash
    mvn clean verify
   ```

## 4. Configuración de Integración Continua (CI/CD)
------------------------------------------------------------------------------------------------------------------
Este proyecto está preparado para integrarse en pipelines de CI/CD (Jenkins, GitHub Actions, Azure DevOps). A continuación, se detallan las indicaciones para su configuración:

Requisitos del Runner/Agente:
Debe contar con JDK 17 y Maven instalados.

El entorno debe soportar la ejecución de Chrome en modo Headless (configurado en serenity.conf).

Paso de ejecución en Pipeline:
Utilizar el siguiente comando para asegurar la limpieza del entorno y la generación de evidencias:
```bash
mvn clean verify -Dserenity.batch.strategy=DIVIDE_EQUALLY
```
Gestión de Artefactos y Reportes:
Persistencia: Se debe configurar el pipeline para capturar y publicar la carpeta target/site/serenity/ como un artefacto HTML.

Jenkins: Usar el plugin de Serenity o el comando publishHTML apuntando al index.html.

GitHub Actions: Utilizar actions/upload-artifact para guardar el reporte consolidado.

## 5. Información adicional
------------------------------------------------------------------------------------------------------------------
Serenity genera reportes detallados en formato HTML. Para consolidarlos:
1. Ejecutar en terminal: mvn serenity:aggregate
2. Ver el reporte en: target/site/serenity/index.html

------------------------------------------------------------------------------------------------------------------
Referencia: https://docs.github.com/es/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes
Recordar que un readme correcto debe tener la extensión .md y debe estar dentro del proyecto.
