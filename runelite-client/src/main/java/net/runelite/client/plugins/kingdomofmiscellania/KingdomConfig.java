/*
 * Copyright (c) 2018, Infinitay <https://github.com/Infinitay>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.kingdomofmiscellania;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
	keyName = "kingdom",
	name = "Kingdom of Miscellania",
	description = "Configuration for Kingdom of Miscellania plugin"
)
public interface KingdomConfig extends Config
{
	@ConfigItem(
		keyName = "showOnlyInKingdom",
		name = "Show Only in Kingdom",
		description = "Configures whether or not to display kingdom information only when in kingdom",
		position = 1
	)
	default boolean showOnlyInKingdom()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showWhenLow",
		name = "Show When Low Favor or Coffer",
		description = "Configures whether or not to display kingdom information when favor or coffer is low",
		position = 2
	)
	default boolean showWhenLow()
	{
		return true;
	}

	@ConfigItem(
		keyName = "favorLessThanValue",
		name = "Alert if favor % below",
		description = "Configures display kingdom information when favor less than value",
		position = 3
	)
	default int favorLessThanValue()
	{
		return 95;
	}

	@ConfigItem(
		keyName = "cofferLessThanValue",
		name = "Alert if coffer below",
		description = "Configures display kingdom information when coffer less than value",
		position = 4
	)
	default int cofferLessThanValue()
	{
		return 1000000;
	}
}