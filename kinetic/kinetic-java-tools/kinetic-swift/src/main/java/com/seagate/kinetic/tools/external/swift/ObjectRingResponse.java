/**
 * Copyright (C) 2014 Seagate Technology.
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
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.seagate.kinetic.tools.external.swift;

import java.util.SortedMap;

/**
 * Object hash ring response message.
 * 
 * @author chiaming
 *
 */
public class ObjectRingResponse extends SwiftResponse {
    
    private SortedMap<Integer, String[]> ring = null;

    public ObjectRingResponse() {
        ;
    }
    
    public void setRing(SortedMap<Integer, String[]> ring) {
        this.ring = ring;
    }

    public SortedMap<Integer, String[]> getRing() {
        return this.ring;
    }

    @Override
    public String toString() {
        return toJson();
    }

}
