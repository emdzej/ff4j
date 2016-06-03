package org.ff4j.aop.test.route;

import org.ff4j.aop.Flip;

/**
 * Created by emdzej on 03.06.16.
 */
@Flip(name = "route.right", alterBean = "right")
public interface RouteStrategy {
    String getRoute();
}
