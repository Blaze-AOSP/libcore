/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
* @author Vladimir N. Molotkov
* @version $Revision$
*/

package org.apache.harmony.security.tests.java.security;

import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

import junit.framework.TestCase;
@TestTargetClass( KeyPair.class)
/**
 * Tests for fields and methods of class <code>KeyPair</code>
 * 
 */
public class KeyPairTest extends TestCase {

    private static class TestKeyPair {
        static PublicKey getPublic() {
            return new PublicKey() {
                public String getAlgorithm() {
                    return "never mind";
                }
                public String getFormat() {
                    return "never mind";
                }
                public byte[] getEncoded() {
                    return null;
                }                
            };
        }
        static PrivateKey getPrivate() {
            return new PrivateKey() {
                public String getAlgorithm() {
                    return "never mind";
                }
                public String getFormat() {
                    return "never mind";
                }
                public byte[] getEncoded() {
                    return null;
                }                
            };                
        }
    }

    /**
     * Constructor for KeyPairTest.
     * @param name
     */
    public KeyPairTest(String name) {
        super(name);
    }

    /**
     * Test #1 for <code>KeyPair(PublicKey, PrivateKey)</code> constructor<br>
     * Assertion: creates new <code>KeyPair</code> instance using valid
     * parameters (both <code>null</code>)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Verification when just one parameter is null missed",
      targets = {
        @TestTarget(
          methodName = "KeyPair",
          methodArgs = {PublicKey.class, PrivateKey.class}
        )
    })
    public final void testKeyPair01() {
        Object kp = new KeyPair(null, null);
        assertTrue(kp instanceof KeyPair);
    }

    /**
     * Test #2 for <code>KeyPair(PublicKey, PrivateKey)</code> constructor<br>
     * Assertion: creates new <code>KeyPair</code> instance using valid
     * parameters (both valid keys)
     * @throws InvalidKeySpecException
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Verification when just one parameter is null missed",
      targets = {
        @TestTarget(
          methodName = "KeyPair",
          methodArgs = {PublicKey.class, PrivateKey.class}
        )
    })
    public final void testKeyPair02() throws InvalidKeySpecException {
        Object kp = new KeyPair(TestKeyPair.getPublic(), TestKeyPair.getPrivate());
        assertTrue(kp instanceof KeyPair);
    }

    /**
     * Test #1 for <code>getPrivate()</code> method<br>
     * Assertion: returns private key (<code>null</code> in this case)
     */
    @TestInfo(
      level = TestLevel.PARTIAL_OK,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getPrivate",
          methodArgs = {}
        )
    })
    public final void testGetPrivate01() {
        KeyPair kp = new KeyPair(null, null);
        assertNull(kp.getPrivate());
    }

    /**
     * Test #2 for <code>getPrivate()</code> method<br>
     * Assertion: returns private key (valid private key in this case)
     * @throws InvalidKeySpecException
     */
    @TestInfo(
      level = TestLevel.PARTIAL_OK,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getPrivate",
          methodArgs = {}
        )
    })
    public final void testGetPrivate02() throws InvalidKeySpecException {
        PrivateKey pk = TestKeyPair.getPrivate();
        KeyPair kp = new KeyPair(null, pk);
        assertSame(pk, kp.getPrivate());
    }

    /**
     * Test #1 for <code>getPublic()</code> method<br>
     * Assertion: returns public key (<code>null</code> in this case)
     */
    @TestInfo(
      level = TestLevel.PARTIAL_OK,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getPublic",
          methodArgs = {}
        )
    })
    public final void testGetPublic01() {
        KeyPair kp = new KeyPair(null, null);
        assertNull(kp.getPublic());
    }

    /**
     * Test #2 for <code>getPublic()</code> method<br>
     * Assertion: returns public key (valid public key in this case)
     * @throws InvalidKeySpecException
     */
    @TestInfo(
      level = TestLevel.PARTIAL_OK,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getPublic",
          methodArgs = {}
        )
    })
    public final void testGetPublic02() throws InvalidKeySpecException {
        PublicKey pk = TestKeyPair.getPublic();
        KeyPair kp = new KeyPair(pk, null);
        assertSame(pk, kp.getPublic());
    }

}
