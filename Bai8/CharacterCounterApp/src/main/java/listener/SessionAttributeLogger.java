package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.annotation.WebListener;
@WebListener
public class SessionAttributeLogger implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("[LOG] Added: " + event.getValue());
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("[LOG] Updated: " + event.getValue());
        }
    }
}
