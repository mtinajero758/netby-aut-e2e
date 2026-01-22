package nttdata.actors;

import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * Clase de soporte para inicializar actores Screenplay
 * No debe extender ni redefinir OnlineCast
 */
public class OnlineCastSetup {

    private OnlineCastSetup() {
        // Evita instanciación
    }

    public static OnlineCast getCast() {
        return new OnlineCast();
    }
}
