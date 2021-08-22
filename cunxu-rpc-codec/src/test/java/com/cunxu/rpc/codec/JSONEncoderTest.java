package com.cunxu.rpc.codec;

import junit.framework.TestCase;
import org.junit.Test;

public class JSONEncoderTest extends TestCase {

    @Test
    public void testEncode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("cunxu");
        bean.setAge(18);

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}