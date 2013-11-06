/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbake.plugin.service;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import org.jbake.plugin.service.impl.DefaultJBakePluginService;
import org.jbake.plugin.service.utils.PluginServiceUtil;

/**
 *
 *
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class JBakePluginServiceFactory {

    private static Logger logger = Logger.getLogger(JBakePluginServiceFactory.class.getName());
    // TODO: We need to use this class in two ways. 1. Read from 'plugins' folder to get plugins 2. Do not use plugins folder instead just read from classpath. (Used to running from maven.)
    private static void addPluginJarsToApp() {
        try {
            PluginServiceUtil.initializePluginJars(new File("plugins"));
        } catch (IOException ioException) {

        }
    }

    public static JBakePluginService createPluginService() {
        addPluginJarsToApp();
        return DefaultJBakePluginService.getInstance();
    }

}
