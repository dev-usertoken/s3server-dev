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
package com.seagate.kinetic.tools.management.rest.message.hwview;

public class Coordinate {

    private String x = null;

    private String y = null;

    private String z = null;

    public Coordinate() {
        // TODO Auto-generated constructor stub
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getY() {
        return this.y;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getZ() {
        return this.z;
    }

}
