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
package com.seagate.kinetic.tools.management.rest.message;

/**
 * Rest messaging message type definition.
 * 
 * @author chiaming
 *
 */
public enum MessageType {

    DISCOVER,
    DISCOVER_REPLY,
    PING,
    PING_REPLY,
    GETLOG,
    GETLOG_REPLY,
    CHECKVERSION,
    CHECKVERSION_REPLY,
    SET_ERASEPIN,
    SET_ERASEPIN_REPLY,
    SET_LOCKPIN,
    SET_LOCKPIN_REPLY,
    INSTANT_ERASE,
    INSTANT_ERASE_REPLY,
    SECURE_ERASE,
    SECURE_ERASE_REPLY,
    LOCK_DEVICE,
    LOCK_DEVICE_REPLY,
    UNLOCK_DEVICE,
    UNLOCK_DEVICE_REPLY,
    SET_CLVERSION,
    SET_CLVERSION_REPLY,
    SET_SECURITY,
    SET_SECURITY_REPLY,
    GET_FIRMWARE,
    GET_FIRMWARE_REPLY,
    EXTERNAL_REQUEST,
    EXTERNAL_REPLY,
    HARDWARE_VIEW,
    HARDWARE_VIEW_REPLY,
    ERROR;
}
