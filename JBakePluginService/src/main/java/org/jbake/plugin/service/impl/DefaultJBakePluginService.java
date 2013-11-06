/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbake.plugin.service.impl;

import org.jbake.plugin.service.JBakePluginService;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.logging.Logger;
import org.jbake.plugin.AbstractJBakePlugin;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class DefaultJBakePluginService implements JBakePluginService {

    private static Logger logger = Logger.getLogger(DefaultJBakePluginService.class.getName());
    private static DefaultJBakePluginService bakePluginService;
    private ServiceLoader<AbstractJBakePlugin> serviceLoader;

    private DefaultJBakePluginService() {
        //load all the classes in the classpath that have implemented the interface
        serviceLoader = ServiceLoader.load(AbstractJBakePlugin.class);
    }

    public static DefaultJBakePluginService getInstance() {
        if (bakePluginService == null) {
            bakePluginService = new DefaultJBakePluginService();
        }
        return bakePluginService;
    }

    @Override
    public Iterator<AbstractJBakePlugin> getPlugins() {
        return serviceLoader.iterator();
    }

    //    TODO: This method need to have parameter of pages,posts etc. Or may be one Context object contain all the objects.
    @Override
    public void invokePlugin() {
        Iterator<AbstractJBakePlugin> iterator = getPlugins();

        while (iterator.hasNext()) {

            AbstractJBakePlugin bakePlugin = iterator.next();
//  TODO: In this place the Service need to provide all the necessary object of the whole JBake framework.

        }
    }

}
