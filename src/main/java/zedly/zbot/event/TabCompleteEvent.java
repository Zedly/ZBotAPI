package zedly.zbot.event;

public class TabCompleteEvent extends Event
{
	private String[] options;

	public TabCompleteEvent(String[] options)
	{
		this.options = options;
	}
}
