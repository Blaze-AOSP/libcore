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

package org.apache.harmony.luni.tests.java.lang;

import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;
import dalvik.annotation.TestTargetClass;

import junit.framework.TestCase;

@TestTargetClass(InheritableThreadLocal.class) 
public class InheritableThreadLocalTest extends TestCase {

    /**
     * @tests java.lang.InheritableThreadLocal#InheritableThreadLocal()
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "InheritableThreadLocal",
          methodArgs = {}
        )
    })
    public void test_Constructor() {
        InheritableThreadLocal<String> itl = new InheritableThreadLocal<String>();
        assertNull(itl.get());
    }
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "initialValue",
          methodArgs = {}
        )
    })
    public void test_initialValue() {
        InheritableThreadLocal<String> itl = new InheritableThreadLocal<String>() {
            @Override
            protected String initialValue() {
                return "initial";
            }
        };
        assertEquals("initial", itl.get());
    }
}
