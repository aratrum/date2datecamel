package nl.han.dare2date.service.web.applyregistration;

import nl.han.dare2date.service.web.applyregistration.model.ApplyRegistrationRequest;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: Serhat
 * Date: 25-6-13
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class ValidateCreditcardRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:queue:RequestQueue").filter((Predicate)(exchange) -> {
            ApplyRegistrationRequest registrationRequest = exchange.getIn().getBody(ApplyRegistrationRequest)



    }
}
