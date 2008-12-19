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

package tests.api.java.lang.reflect;

import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;
import dalvik.annotation.TestTargetClass;

import java.lang.reflect.Array;

@TestTargetClass(Array.class) 
public class ArrayTest extends junit.framework.TestCase {

    /**
     * @tests java.lang.reflect.Array#get(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Verifies only int array.",
      targets = {
        @TestTarget(
          methodName = "get",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getLjava_lang_ObjectI() {
        // Test for method java.lang.Object
        // java.lang.reflect.Array.get(java.lang.Object, int)

        int[] x = { 1 };
        Object ret = null;
        boolean thrown = false;
        try {
            ret = Array.get(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value",
                1, ((Integer) ret).intValue());
        try {
            ret = Array.get(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.get(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getBoolean(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify NullPointerException.",
      targets = {
        @TestTarget(
          methodName = "getBoolean",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getBooleanLjava_lang_ObjectI() {
        // Test for method boolean
        // java.lang.reflect.Array.getBoolean(java.lang.Object, int)
        boolean[] x = { true };
        boolean ret = false;
        boolean thrown = false;
        try {
            ret = Array.getBoolean(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertTrue("Get returned incorrect value", ret);
        try {
            ret = Array.getBoolean(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getBoolean(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getByte(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify NullPointerException.",
      targets = {
        @TestTarget(
          methodName = "getByte",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getByteLjava_lang_ObjectI() {
        // Test for method byte
        // java.lang.reflect.Array.getByte(java.lang.Object, int)
        byte[] x = { 1 };
        byte ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getByte(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret);
        try {
            ret = Array.getByte(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getByte(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getChar(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify NullPointerException.",
      targets = {
        @TestTarget(
          methodName = "getChar",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getCharLjava_lang_ObjectI() {
        // Test for method char
        // java.lang.reflect.Array.getChar(java.lang.Object, int)
        char[] x = { 1 };
        char ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getChar(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret);
        try {
            ret = Array.getChar(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getChar(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getDouble(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify NullPointerException.",
      targets = {
        @TestTarget(
          methodName = "getDouble",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getDoubleLjava_lang_ObjectI() {
        // Test for method double
        // java.lang.reflect.Array.getDouble(java.lang.Object, int)
        double[] x = { 1 };
        double ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getDouble(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret, 0.0);
        try {
            ret = Array.getDouble(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getDouble(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getFloat(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't verify NullPointerException.",
      targets = {
        @TestTarget(
          methodName = "getFloat",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getFloatLjava_lang_ObjectI() {
        // Test for method float
        // java.lang.reflect.Array.getFloat(java.lang.Object, int)
        float[] x = { 1 };
        float ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getFloat(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret, 0.0);
        try {
            ret = Array.getFloat(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getFloat(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getInt(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Doesn't check any boundary value.",
      targets = {
        @TestTarget(
          methodName = "getInt",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getIntLjava_lang_ObjectI() {
        // Test for method int java.lang.reflect.Array.getInt(java.lang.Object,
        // int)
        int[] x = { 1 };
        int ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getInt(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret);
        try {
            ret = Array.getInt(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getInt(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getLength(java.lang.Object)
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getLength",
          methodArgs = {java.lang.Object.class}
        )
    })
    public void test_getLengthLjava_lang_Object() {
        // Test for method int
        // java.lang.reflect.Array.getLength(java.lang.Object)
        long[] x = { 1 };

        assertEquals("Returned incorrect length", 1, Array.getLength(x));
        assertEquals("Returned incorrect length", 10000, Array
                .getLength(new Object[10000]));
        try {
            Array.getLength(new Object());
        } catch (IllegalArgumentException e) {
            // Correct
            return;
        }
        fail("Failed to throw exception when passed non-array");
    }

    /**
     * @tests java.lang.reflect.Array#getLong(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "getLong",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getLongLjava_lang_ObjectI() {
        // Test for method long
        // java.lang.reflect.Array.getLong(java.lang.Object, int)
        long[] x = { 1 };
        long ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getLong(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret);
        try {
            ret = Array.getLong(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getLong(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#getShort(java.lang.Object, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "getShort",
          methodArgs = {java.lang.Object.class, int.class}
        )
    })
    public void test_getShortLjava_lang_ObjectI() {
        // Test for method short
        // java.lang.reflect.Array.getShort(java.lang.Object, int)
        short[] x = { 1 };
        short ret = 0;
        boolean thrown = false;
        try {
            ret = Array.getShort(x, 0);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ret);
        try {
            ret = Array.getShort(new Object(), 0);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            ret = Array.getShort(x, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#newInstance(java.lang.Class, int[])
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Exceptions are not verified.",
      targets = {
        @TestTarget(
          methodName = "newInstance",
          methodArgs = {java.lang.Class.class, int[].class}
        )
    })
    public void test_newInstanceLjava_lang_Class$I() {
        // Test for method java.lang.Object
        // java.lang.reflect.Array.newInstance(java.lang.Class, int [])
        int[][] x;
        int[] y = { 2 };

        x = (int[][]) Array.newInstance(int[].class, y);
        assertEquals("Failed to instantiate array properly", 2, x.length);

    }

    /**
     * @tests java.lang.reflect.Array#newInstance(java.lang.Class, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Exceptions are not verified.",
      targets = {
        @TestTarget(
          methodName = "newInstance",
          methodArgs = {java.lang.Class.class, int.class}
        )
    })
    public void test_newInstanceLjava_lang_ClassI() {
        // Test for method java.lang.Object
        // java.lang.reflect.Array.newInstance(java.lang.Class, int)
        int[] x;

        x = (int[]) Array.newInstance(int.class, 100);
        assertEquals("Failed to instantiate array properly", 100, x.length);
    }

    /**
     * @tests java.lang.reflect.Array#set(java.lang.Object, int,
     *        java.lang.Object)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "set",
          methodArgs = {java.lang.Object.class, int.class, java.lang.Object.class}
        )
    })
    public void test_setLjava_lang_ObjectILjava_lang_Object() {
        // Test for method void java.lang.reflect.Array.set(java.lang.Object,
        // int, java.lang.Object)
        int[] x = { 0 };
        boolean thrown = false;
        try {
            Array.set(x, 0, new Integer(1));
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, ((Integer) Array.get(x, 0))
                .intValue());
        try {
            Array.set(new Object(), 0, new Object());
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.set(x, 4, new Integer(1));
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }

        // trying to put null in a primitive array causes
        // a IllegalArgumentException in 5.0
        boolean exception = false;
        try {
            Array.set(new int[1], 0, null);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertTrue("expected exception not thrown", exception);
    }

    /**
     * @tests java.lang.reflect.Array#setBoolean(java.lang.Object, int, boolean)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setBoolean",
          methodArgs = {java.lang.Object.class, int.class, boolean.class}
        )
    })
    public void test_setBooleanLjava_lang_ObjectIZ() {
        // Test for method void
        // java.lang.reflect.Array.setBoolean(java.lang.Object, int, boolean)
        boolean[] x = { false };
        boolean thrown = false;
        try {
            Array.setBoolean(x, 0, true);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertTrue("Failed to set correct value", Array.getBoolean(x, 0));
        try {
            Array.setBoolean(new Object(), 0, false);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown){
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setBoolean(x, 4, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setByte(java.lang.Object, int, byte)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setByte",
          methodArgs = {java.lang.Object.class, int.class, byte.class}
        )
    })
    public void test_setByteLjava_lang_ObjectIB() {
        // Test for method void
        // java.lang.reflect.Array.setByte(java.lang.Object, int, byte)
        byte[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setByte(x, 0, (byte) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getByte(x, 0));
        try {
            Array.setByte(new Object(), 0, (byte) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setByte(x, 4, (byte) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setChar(java.lang.Object, int, char)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setChar",
          methodArgs = {java.lang.Object.class, int.class, char.class}
        )
    })
    public void test_setCharLjava_lang_ObjectIC() {
        // Test for method void
        // java.lang.reflect.Array.setChar(java.lang.Object, int, char)
        char[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setChar(x, 0, (char) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getChar(x, 0));
        try {
            Array.setChar(new Object(), 0, (char) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setChar(x, 4, (char) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setDouble(java.lang.Object, int, double)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setDouble",
          methodArgs = {java.lang.Object.class, int.class, double.class}
        )
    })
    public void test_setDoubleLjava_lang_ObjectID() {
        // Test for method void
        // java.lang.reflect.Array.setDouble(java.lang.Object, int, double)
        double[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setDouble(x, 0, (double) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getDouble(x, 0), 0.0);
        try {
            Array.setDouble(new Object(), 0, (double) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setDouble(x, 4, (double) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setFloat(java.lang.Object, int, float)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setFloat",
          methodArgs = {java.lang.Object.class, int.class, float.class}
        )
    })
    public void test_setFloatLjava_lang_ObjectIF() {
        // Test for method void
        // java.lang.reflect.Array.setFloat(java.lang.Object, int, float)
        float[] x = { 0.0f };
        boolean thrown = false;
        try {
            Array.setFloat(x, 0, (float) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getFloat(x, 0), 0.0);
        try {
            Array.setFloat(new Object(), 0, (float) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setFloat(x, 4, (float) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setInt(java.lang.Object, int, int)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setInt",
          methodArgs = {java.lang.Object.class, int.class, int.class}
        )
    })
    public void test_setIntLjava_lang_ObjectII() {
        // Test for method void java.lang.reflect.Array.setInt(java.lang.Object,
        // int, int)
        int[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setInt(x, 0, (int) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getInt(x, 0));
        try {
            Array.setInt(new Object(), 0, (int) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setInt(x, 4, (int) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setLong(java.lang.Object, int, long)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException isnot verified.",
      targets = {
        @TestTarget(
          methodName = "setLong",
          methodArgs = {java.lang.Object.class, int.class, long.class}
        )
    })
    public void test_setLongLjava_lang_ObjectIJ() {
        // Test for method void
        // java.lang.reflect.Array.setLong(java.lang.Object, int, long)
        long[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setLong(x, 0, (long) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getLong(x, 0));
        try {
            Array.setLong(new Object(), 0, (long) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setLong(x, 4, (long) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * @tests java.lang.reflect.Array#setShort(java.lang.Object, int, short)
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "NullPointerException is not verified.",
      targets = {
        @TestTarget(
          methodName = "setShort",
          methodArgs = {java.lang.Object.class, int.class, short.class}
        )
    })
    public void test_setShortLjava_lang_ObjectIS() {
        // Test for method void
        // java.lang.reflect.Array.setShort(java.lang.Object, int, short)
        short[] x = { 0 };
        boolean thrown = false;
        try {
            Array.setShort(x, 0, (short) 1);
        } catch (Exception e) {
            fail("Exception during get test : " + e.getMessage());
        }
        assertEquals("Get returned incorrect value", 1, Array.getShort(x, 0));
        try {
            Array.setShort(new Object(), 0, (short) 9);
        } catch (IllegalArgumentException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Passing non-array failed to throw exception");
        }
        thrown = false;
        try {
            Array.setShort(x, 4, (short) 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Correct behaviour
            thrown = true;
        }
        if (!thrown) {
            fail("Invalid index failed to throw exception");
        }
    }

    /**
     * Sets up the fixture, for example, open a network connection. This method
     * is called before a test is executed.
     */
    protected void setUp() {
    }

    /**
     * Tears down the fixture, for example, close a network connection. This
     * method is called after a test is executed.
     */
    protected void tearDown() {
    }
}
