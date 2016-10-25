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
package com.seagate.kinetic.tools.management.rest.message.ping;

import java.util.ArrayList;
import java.util.List;

import com.seagate.kinetic.tools.management.rest.message.DeviceId;
import com.seagate.kinetic.tools.management.rest.message.util.MessageUtil;

/**
 * This generates a simple example of the <code>PingRequest</code> message.
 * <p>
 * A list of device Id is set in the Ping request message.
 */
public class PingRequestExample {

    public static void main(String[] args) {

        PingRequest req = new PingRequest();

        List<DeviceId> devices = new ArrayList<DeviceId>();

        DeviceId deviceId = new DeviceId();

        deviceId.setWwn("1234");
        String[] ips = { "127.0.0.1" };
        deviceId.setIps(ips);

        devices.add(deviceId);

        req.setDevices(devices);

        String request = req.toJson();

        System.out.println(request);

        PingRequest req2 = (PingRequest) MessageUtil.fromJson(request,
                PingRequest.class);

        String request2 = req2.toJson();

        System.out.println(request2);

    }

}
