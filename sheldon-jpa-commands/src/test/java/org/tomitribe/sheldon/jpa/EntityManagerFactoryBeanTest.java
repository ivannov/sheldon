package org.tomitribe.sheldon.jpa;

import org.junit.Before;
import org.junit.Test;
import org.tomitribe.crest.Main;

/**
 * @author Ivan St. Ivanov
 */
public class EntityManagerFactoryBeanTest {

    private Main main;

    @Before
    public void setUp() throws Exception {
        this.main = new Main(EntityManagerFactoryBean.class);
    }

    @Test
    public void testListProperties() throws Exception {
        System.out.println(main.exec("getEntityManagerProperties"));
    }
}
