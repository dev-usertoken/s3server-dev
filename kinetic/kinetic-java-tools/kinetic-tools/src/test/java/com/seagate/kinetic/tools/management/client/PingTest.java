/**
 * 
 * Copyright (C) 2014 Seagate Technology.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */
package com.seagate.kinetic.tools.management.client;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seagate.kinetic.tools.management.IntegrationTestCase;
import com.seagate.kinetic.tools.management.KineticTestHelper;
import com.seagate.kinetic.tools.management.rest.client.KineticRestClient;
import com.seagate.kinetic.tools.management.rest.client.RestClientException;
import com.seagate.kinetic.tools.management.rest.message.DeviceId;
import com.seagate.kinetic.tools.management.rest.message.MessageType;
import com.seagate.kinetic.tools.management.rest.message.RestResponse;
import com.seagate.kinetic.tools.management.rest.message.ping.PingRequest;

@Test(groups = { "simulator" })
public class PingTest extends IntegrationTestCase {

    private final static String URL = "http://localhost:8080/ping";

    @Test
    public void test_PingViaDiscoId() {
        KineticRestClient client = null;
        try {
            client = new KineticRestClient();

            PingRequest request = new PingRequest();
            request.setDiscoId(KineticTestHelper.FILE_NAME);

            RestResponse response = client.send(URL, request);

            Assert.assertTrue(response.getMessageType().equals(
                    MessageType.PING_REPLY));
            Assert.assertTrue(response.getOverallStatus() == 200);

        } catch (RestClientException e) {
            Assert.fail("rest client throw exception: " + e.getMessage());
        } catch (Exception e) {
            Assert.fail("ping throw exception: " + e.getMessage());
        } finally {
            if (client != null) {
                client.close();
            }
        }
    }

    @Test
    public void test_PingViaDeviceList() {
        KineticRestClient client = null;

        try {
            client = new KineticRestClient();

            PingRequest request = new PingRequest();

            List<DeviceId> deviceIdOfList = new ArrayList<DeviceId>();
            DeviceId deviceId = new DeviceId();
            String[] ips = new String[] { "127.0.0.1" };
            deviceId.setIps(ips);
            deviceId.setPort(KineticTestHelper.PORT);
            deviceId.setTlsPort(KineticTestHelper.SSL_PORT);

            deviceIdOfList.add(deviceId);

            request.setDevices(deviceIdOfList);

            // send request
            RestResponse response = client.send(URL, request);

            Assert.assertTrue(response.getMessageType().equals(
                    MessageType.PING_REPLY));
            Assert.assertTrue(response.getOverallStatus() == 200);

        } catch (RestClientException e) {
            Assert.fail("rest client throw exception: " + e.getMessage());
        } catch (Exception e) {
            Assert.fail("ping throw exception: " + e.getMessage());
        } finally {
            if (client != null) {
                client.close();
            }
        }
    }
}
