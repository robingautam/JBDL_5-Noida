package org.gfg.JBDL5_L10_Boot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("development")
public class DevelopmentDatabase implements DBConnect{
    @Override
    public void connectDatabase() {
        System.out.println("Connecting with Development database");
    }
}
