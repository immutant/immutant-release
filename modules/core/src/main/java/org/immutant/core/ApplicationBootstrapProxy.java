/*
 * Copyright 2008-2014 Red Hat, Inc, and individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.immutant.core;

import java.io.File;
import java.util.List;

import org.immutant.bootstrap.ApplicationBootstrapUtils;

public class ApplicationBootstrapProxy {
    
    public static String getDependenciesAsString(String projectAsString, boolean resolveDeps,
                                                 boolean resolvePluginDeps) throws Exception {
        return ApplicationBootstrapUtils.getDependenciesAsString( projectAsString, resolveDeps, resolvePluginDeps );
    }
    
    @SuppressWarnings("rawtypes")
    public static String readProjectAsString(File applicationRoot, List profiles, boolean escapeMemoization) throws Exception {
        return ApplicationBootstrapUtils.readProjectAsString(applicationRoot, profiles, escapeMemoization, true);
    }
    
    public static String getResourceDirsAsString(String projectAsString) throws Exception {
        return ApplicationBootstrapUtils.resourceDirsAsString(projectAsString);
    }

    public static void clearBootstrapClassLoader(File appRoot) throws Exception {
        ApplicationBootstrapUtils.clearBootstrapClassLoader(appRoot);
    }
}


