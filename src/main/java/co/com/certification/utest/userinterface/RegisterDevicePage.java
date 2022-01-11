package co.com.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterDevicePage {
    public static final Target AUTODETECTED = Target.the("Enter NextDevice").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/span"));
    public static final Target LAST_STEP = Target.the("Enter Last Step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
