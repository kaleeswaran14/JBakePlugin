/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbake.plugin.service;

import java.util.Iterator;
import org.jbake.plugin.AbstractJBakePlugin;
import org.jbake.plugin.JBakePlugin;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public interface JBakePluginService {

    Iterator<AbstractJBakePlugin> getPlugins();

    void invokePlugin();
}
