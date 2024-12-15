package org.gfg.JBDL5_L10_Boot.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProductionDatabase implements DBConnect{
    @Override
    public void connectDatabase() {
        System.out.println("Connecting with production database");
    }
}
