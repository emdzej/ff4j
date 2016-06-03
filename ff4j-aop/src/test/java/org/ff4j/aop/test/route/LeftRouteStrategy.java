package org.ff4j.aop.test.route;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */
@Component("left")
@Primary
public class LeftRouteStrategy extends AbstractRouteStrategy {
    @Override
    public String getRoute() {
        return decorate("left");
    }
}
