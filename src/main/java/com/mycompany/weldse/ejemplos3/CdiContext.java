/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weldse.ejemplos3;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author cesar
 */
public class CdiContext {

    public final static CdiContext INSTANCE = new CdiContext();

    private final Weld weld;
    private final WeldContainer container;

    private CdiContext() {
        this.weld = new Weld();
        this.container = weld.initialize();
    }

    public void shutdown() {
        if (weld != null) {
            weld.shutdown();
        }
    }

    public <T> T getBean(Class<T> type) {
        return container.select(type).get();
    }
}
