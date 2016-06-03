package org.ff4j.aop;


import org.ff4j.FF4j;
import org.ff4j.aop.test.route.RouteStrategy;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by emdzej on 03.06.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-ff4j-aop-test.xml")
public class FeatureAutoProxyTests {

    @Autowired
    private FF4j ff4j;

    @Autowired
    private RouteStrategy routeStrategy;

    @Test
    public void shouldFlipEvenIfInherited() {
        Assert.assertFalse(ff4j.check("route.right"));
        Assert.assertTrue("go left".equals(routeStrategy.getRoute()));
        ff4j.enable("route.right");
        Assert.assertTrue(ff4j.check("route.right"));
        Assert.assertTrue("go right".equals(routeStrategy.getRoute()));
    }
}
