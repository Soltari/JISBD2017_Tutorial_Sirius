package EntityColl.design;

import java.util.Random;

import entityColl.Collection;
import entityColl.Entity;

public class CustomFunctions
{
	private static Random randomGenerator = new Random();

	public String getRandomName(Collection collection)
	{
		return "RandomCollection_" + randomGenerator.nextInt();
	}

	public String getRandomName(Entity entity)
	{
		return "RandomEntity_" + randomGenerator.nextInt();
	}
}
