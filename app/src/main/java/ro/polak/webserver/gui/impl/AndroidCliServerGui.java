/**************************************************
 * Android Web Server
 * Based on JavaLittleWebServer (2008)
 * <p/>
 * Copyright (c) Piotr Polak 2008-2016
 **************************************************/

package ro.polak.webserver.gui.impl;

import ro.polak.http.ServerConfigFactory;
import ro.polak.http.cli.DefaultCliServerGui;
import ro.polak.webserver.resource.provider.impl.AndroidServerConfigFactory;

/**
 * Server CLI interface along with a runner, used to test some of the Android only features.
 *
 * @author Piotr Polak piotr [at] polak [dot] ro
 * @since 201611
 */
public class AndroidCliServerGui extends DefaultCliServerGui {

    /**
     * The main CLI runner method.
     *
     * @param args
     */
    public static void main(String[] args) {
        (new AndroidCliServerGui()).init();
    }

    @Override
    protected ServerConfigFactory getServerConfigFactory() {
        return new AndroidServerConfigFactory(null);
    }
}
