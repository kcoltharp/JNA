/* Copyright (c) 2007 Timothy Wall, All Rights Reserved
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */
package com.sun.jna;

/** Provides context for converting a native value into a Java type. */
public class FromNativeContext {
    private Class<?> type;
    FromNativeContext(Class<?> javaType) {
        this.type = javaType;
    }
    /** The desired Java type of the result. */
    public Class<?> getTargetType() {
        return type;
    }
}
