// SPDX-FileCopyrightText: 2020 aTox contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package ltd.evilcorp.core.db

import kotlin.test.Test
import kotlin.test.assertEquals
import ltd.evilcorp.core.vo.ConnectionStatus
import ltd.evilcorp.core.vo.MessageType
import ltd.evilcorp.core.vo.Sender
import ltd.evilcorp.core.vo.UserStatus

class ConvertersTest {
    @Test
    fun `user status can be converted`() {
        UserStatus.values().forEach {
            assertEquals(it.ordinal, Converters.fromStatus(it))
            assertEquals(it, Converters.toStatus(it.ordinal))
        }
    }

    @Test
    fun `connection status can be converted`() {
        ConnectionStatus.values().forEach {
            assertEquals(it.ordinal, Converters.fromConnection(it))
            assertEquals(it, Converters.toConnection(it.ordinal))
        }
    }

    @Test
    fun `sender can be converted`() {
        Sender.values().forEach {
            assertEquals(it.ordinal, Converters.fromSender(it))
            assertEquals(it, Converters.toSender(it.ordinal))
        }
    }

    @Test
    fun `message type can be converted`() {
        MessageType.values().forEach {
            assertEquals(it.ordinal, Converters.fromMessageType(it))
            assertEquals(it, Converters.toMessageType(it.ordinal))
        }
    }
}
