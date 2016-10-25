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
package com.seagate.kinetic.tools.management.rest.message.checkversion;

import java.util.ArrayList;
import java.util.List;

import com.seagate.kinetic.tools.management.rest.message.DeviceStatus;
import com.seagate.kinetic.tools.management.rest.message.MessageType;
import com.seagate.kinetic.tools.management.rest.message.RestResponse;

/**
 * Check version response message.
 * 
 * @author chiaming
 *
 */
public class CheckVersionResponse extends RestResponse {

    /**
     * The status code is set to HttpServletResponse.SC_EXPECTATION_FAILED if
     * version is not the expected firmware version.
     * 
     * The status message contains the firmware version of the device.
     */
    protected List<DeviceStatus> devices = new ArrayList<DeviceStatus>();

    public CheckVersionResponse() {
        super.setMessageType(MessageType.CHECKVERSION_REPLY);
    }

    public void setDevices(List<DeviceStatus> devices) {
        this.devices = devices;
    }

    public List<DeviceStatus> getDevices() {
        return this.devices;
    }
}
