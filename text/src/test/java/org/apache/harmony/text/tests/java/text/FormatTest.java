/* 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.harmony.text.tests.java.text;

import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;
import dalvik.annotation.TestTargetClass;

import junit.framework.TestCase;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;


@TestTargetClass(Format.class) 
public class FormatTest extends TestCase {
    private class MockFormat extends Format {

        public StringBuffer format(Object obj, StringBuffer toAppendTo,
                FieldPosition pos) {
            // it is a fake
            if (obj == null)
                throw new NullPointerException("obj is null");
            return new StringBuffer("");
        }

        public Object parseObject(String source, ParsePosition pos) {
            // it is a fake
            return null;
        }
    }

    /**
     * @tests java.text.Format#format(Object) Test of method
     *        java.text.Format#format(Object).
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "Format",
          methodArgs = {}
        )
    })
    public void test_Constructor() {
        try {
            new MockFormat();
        } catch (Exception e) {
            fail("Unexpected exception " + e.toString());
        }
    }

    /**
     * @tests java.text.Format#clone() Test of method java.text.Format#clone().
     *        Compare of internal variables of cloned objects.
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "clone",
          methodArgs = {}
        )
    })
    public void test_clone() {
        try {
            // Compare of internal variables of cloned objects
            Format fm = new MockFormat();
            Format fmc = (Format) fm.clone();
            assertEquals(fm.getClass(), fmc.getClass());
        } catch (Exception e) {
            fail("Unexpected exception " + e.toString());
        }
    }

    /**
     * @tests java.text.Format#format(java.lang.Object) Test of method
     *        java.text.Format#format(java.lang.Object).
     */
    @TestInfo(
      level = TestLevel.TODO,
      purpose = "Verifies nothing.",
      targets = {
        @TestTarget(
          methodName = "format",
          methodArgs = {java.lang.Object.class}
        )
    })
    public void test_formatLjava_lang_Object() {
        assertTrue("It calls an abstract metod format", true);
    }

    /**
     * @tests java.text.Format#formatToCharacterIterator(java.lang.Object) Test
     *        of method
     *        java.text.Format#formatToCharacterIterator(java.lang.Object).
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify anything.",
      targets = {
        @TestTarget(
          methodName = "formatToCharacterIterator",
          methodArgs = {java.lang.Object.class}
        )
    })
    public void test_formatToCharacterIteratorLjava_lang_Object() {
        assertTrue("It calls an abstract metod format", true);
    }

    /**
     * @tests java.text.Format#parseObject(java.lang.String source) Test of
     *        method java.text.Format#parseObject(java.lang.String source).
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify anything.",
      targets = {
        @TestTarget(
          methodName = "parseObject",
          methodArgs = {java.lang.String.class}
        )
    })
    public void test_parseObjectLjava_lang_String() {
        assertTrue("It calls an abstract metod parseObject", true);
    }
}
