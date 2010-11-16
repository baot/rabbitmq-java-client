package com.rabbitmq.client.test.builder;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.impl.AMQImpl;
import junit.framework.TestCase;

/**
 * This file is not for the ages.
 *
 * I'm attempting to fiddle around with some hand-written builder-esque APIs
 * for revamping the Java client's interfaces to be more Java-ish and more
 * humane.  Once these experiments give a bit more of a feel for that, the
 * functionality will be lifted out into some autogenerated from the AMQP
 * spec using a Python scheme similar to what's used for the current API.
 */
public class ProtoTypeBuilderSyntaxTest extends TestCase
{
    public void testExchangeDeclareBuilder()
    {
        AMQP.Exchange.Declare ed =
                            new AMQImpl.Exchange.Declare.Builder().build();
        assertNotNull(ed);

        ed = new AMQImpl.Exchange.Declare.Builder().exchange("my_innie_xchg")
                                                   .type("direct")
                                                   .durable(true)
                                                   .internal(true)
                                                   .build();
        assertNotNull(ed);
    }
}
