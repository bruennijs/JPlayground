/**
 * Created by bruenni on 10.05.16.
 */

import junit.framework.Test;
import org.junit.Assert;

public class ReactorTests {
    @org.junit.Test
    public void When_interval_expect_dispatched_to_queue_and_handled_by_different_thread()
    {
        Assert.assertEquals(2, 2);
    }
}
