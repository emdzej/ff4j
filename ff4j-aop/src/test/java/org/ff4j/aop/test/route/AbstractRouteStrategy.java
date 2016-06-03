package org.ff4j.aop.test.route;

/**
 * Created by emdzej on 03.06.16.
 */
public abstract class AbstractRouteStrategy implements RouteStrategy {
    protected String decorate(String route) {
        return String.format("go %s", route);
    }
}
