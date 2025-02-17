package prueba.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import prueba.interfaces.AddProductCartInterface;
import prueba.interfaces.CompleteShoppingInterface;
import prueba.interfaces.ViewCartInterface;
import prueba.tasks.CompleteCheckOut;
import prueba.tasks.DoLogin;
import prueba.utils.OpenPage;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ShoppingPageStep {

    private String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa al sitio web")
    public void openPage(String name) {
        this.name = name;
        theActorCalled(name).attemptsTo(OpenPage.openPage());
    }

    @When("^Me autentico con el (.*) and (.*)$")
    public void meAutenticarseConElUsuario_standard_userYpassword_secret_sauce(String username, String password){
            theActorCalled(name).attemptsTo(
                    OpenPage.openPage(),
                    DoLogin.withCredentials(username, password)
            );

    }

    @Then("Agregar dos productos al carrito")
    public void agregarDosProductosAlCarrito() {
        theActorCalled(name).attemptsTo(
                Click.on(AddProductCartInterface.btnLabsPack),
                Click.on(AddProductCartInterface.btnLabsBike)
        );
    }
    @And("Visualizar el carrito")
    public void visualizarElCarrito() {
        theActorCalled(name).attemptsTo(
                Click.on(ViewCartInterface.btnViewCart),
                Click.on(ViewCartInterface.btnCheckout)
        );
    }
    @When("Completar el formulario de compra")
    public void completarElFormularioDeCompra() throws IOException {
        theActorCalled(name).attemptsTo(
                CompleteCheckOut.withDetails("Juan", "Torres", "0101")
        );

    }
    @Then("Finalizar la compra hasta la confirmación:THANK YOU FOR YOUR ORDER")
    public void finalizarLaCompraHastaLaConfirmación_THANK_YOU_FOR_YOUR_ORDER() {
        theActorCalled(name).attemptsTo(
                Click.on(CompleteShoppingInterface.btnFinish)
        );
    }


}
