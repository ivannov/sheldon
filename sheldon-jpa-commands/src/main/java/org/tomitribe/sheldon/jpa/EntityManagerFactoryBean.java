package org.tomitribe.sheldon.jpa;

import org.tomitribe.crest.api.Command;
import org.tomitribe.sheldon.api.CommandListener;

import javax.ejb.MessageDriven;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.Map;

/**
 * @author Ivan St. Ivanov
 */
@MessageDriven(name = "EntityManagerFactory")
public class EntityManagerFactoryBean implements CommandListener {

    @PersistenceUnit
    private EntityManagerFactory defaultPersistenceUnit;

    @Command
    public String getEntityManagerProperties() {
        Map<String, Object> properties = defaultPersistenceUnit.getProperties();
        return properties.toString();
    }
}
