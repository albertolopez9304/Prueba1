package co.com.certification.utest.tasks;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.userinterface.RegisterDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterDevice implements Task {

   public static RegisterDevice withData(){
        return Tasks.instrumented(RegisterDevice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegisterDevicePage.AUTODETECTED, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(RegisterDevicePage.LAST_STEP)
        );

    }
}
