package zedly.zbot.event;

import zedly.zbot.entity.Player;

public class PlayerSpawnEvent extends Event
{
	private final Player player;

	public PlayerSpawnEvent(Player player)
	{
		this.player = player;
	}

	public Player getEntity()
	{
		return player;
	}
}