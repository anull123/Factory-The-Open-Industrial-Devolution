package game;

import java.util.ArrayList;

public class ShippingTruck extends Node {

	private ArrayList<Item> packedItems;
	
	@Override
	public boolean inputItem(Item item)
	{
		packedItems.add(item);
		return true;
	}
	
	public ArrayList<Item> getPackedItem()
	{
		return packedItems;
	}
	
	@Override
	protected Edge selectOutgoingEdge() {
		return null;
	}

}
