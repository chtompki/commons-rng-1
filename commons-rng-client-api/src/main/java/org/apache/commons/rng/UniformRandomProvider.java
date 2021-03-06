/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rng;

/**
 * Applies to generators of random number sequences that follow a uniform
 * distribution.
 *
 * @since 1.0
 */
public interface UniformRandomProvider {
    /**
     * Generates {@code byte} values and places them into a user-supplied array.
     * <p>
     * The number of random bytes produced is equal to the length of the
     * the byte array.
     * </p>
     *
     * @param bytes Byte array in which to put the random bytes.
     * Cannot be {@code null}.
     */
    void nextBytes(byte[] bytes);

    /**
     * Generates {@code byte} values and places them into a user-supplied array.
     *
     * <p>
     * The array is filled with bytes extracted from random integers.
     * This implies that the number of random bytes generated may be larger than
     * the length of the byte array.
     * </p>
     *
     * @param bytes Array in which to put the generated bytes.
     * Cannot be {@code null}.
     * @param start Index at which to start inserting the generated bytes.
     * @param len Number of bytes to insert.
     * @throws IndexOutOfBoundsException if {@code start < 0} or
     * {@code start >= bytes.length}.
     * @throws IndexOutOfBoundsException if {@code len < 0} or
     * {@code len > bytes.length - start}.
     */
    void nextBytes(byte[] bytes,
                   int start,
                   int len);

    /**
     * Generates an {@code int} value.
     *
     * @return the next random value.
     */
    int nextInt();

    /**
     * Generates an {@code int} value between 0 (inclusive) and the
     * specified value (exclusive).
     *
     * @param n Bound on the random number to be returned.  Must be positive.
     * @return a random {@code int} value between 0 (inclusive) and n
     * (exclusive).
     * @throws IllegalArgumentException if {@code n} is negative.
     */
    int nextInt(int n);

    /**
     * Generates a {@code long} value.
     *
     * @return the next random value.
     */
    long nextLong();

    /**
     * Generates a {@code long} value between 0 (inclusive) and the specified
     * value (exclusive).
     *
     * @param n Bound on the random number to be returned.  Must be positive.
     * @return a random {@code long} value between 0 (inclusive) and n
     * (exclusive).
     * @throws IllegalArgumentException if {@code n} is negative.
     */
    long nextLong(long n);

    /**
     * Generates a {@code boolean} value.
     *
     * @return the next random value.
     */
    boolean nextBoolean();

    /**
     * Generates a {@code float} value between 0 and 1.
     *
     * @return the next random value between 0 and 1.
     */
    float nextFloat();

    /**
     * Generates a {@code double} value between 0 and 1.
     *
     * @return the next random value between 0 and 1.
     */
    double nextDouble();
}
