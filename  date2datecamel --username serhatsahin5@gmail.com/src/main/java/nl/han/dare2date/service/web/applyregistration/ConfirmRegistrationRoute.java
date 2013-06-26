package nl.han.dare2date.service.web.applyregistration;

import nl.han.dare2date.service.web.applyregistration.model.PublisherNotification;
import nl.han.dare2date.service.web.applyregistration.model.SubscribeNotification;
import nl.han.dare2date.service.web.applyregistration.model.UserNotification;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: Serhat
 * Date: 25-6-13
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class ConfirmRegistrationRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception{

        // route which looks on the topic and generates notifications
        from("activemq:topic:UpdateTopic").process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                new PublisherNotification();
                new SubscribeNotification();
                new UserNotification();
            }
        });
    }
}
