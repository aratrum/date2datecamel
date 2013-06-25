package nl.han.dare2date.service.web.applyregistration;

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
    public void configure() throws Exception{}

        from("activemq:topic:UpdateTopic")
        .process(new UserNotification())
        .process(new SubscribeNotification())
        .process(new PublisherNotification());
    }
}
