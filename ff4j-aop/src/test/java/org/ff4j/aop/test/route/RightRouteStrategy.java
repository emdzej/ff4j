package org.ff4j.aop.test.route;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */

@Component("right")
public class RightRouteStrategy extends AbstractRouteStrategy {

    @Override
    public String getRoute() {
        return decorate("right");
    }
}
