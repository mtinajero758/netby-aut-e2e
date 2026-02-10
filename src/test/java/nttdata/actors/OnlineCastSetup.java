package nttdata.actors;

import net.serenitybdd.screenplay.actors.OnlineCast;

public class OnlineCastSetup {

    private OnlineCastSetup() {
        // Evita instanciación
    }

    public static OnlineCast getCast() {
        return new OnlineCast();
    }
}
