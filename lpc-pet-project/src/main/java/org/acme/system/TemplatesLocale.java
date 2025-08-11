package org.acme.system;

import io.quarkus.qute.TemplateInstance;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Locale;

@ApplicationScoped
public class TemplatesLocale {
    
    public TemplateInstance welcome() {
        return Templates.welcome().setAttribute("locale", getConfiguredLocale());
    }

    protected Locale getConfiguredLocale() {
        return  Locale.getDefault();
    }

}
