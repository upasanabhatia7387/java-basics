package com.designPattern.Facade;

public class MyRestaurantfacade {
	private Restaurant restuarant = new Restaurant();
	private DeliveryTeam deliveryTeam = new DeliveryTeam();
	private DeliveryBoy deliveryBoy = new DeliveryBoy();
	
	public void placeOrder() {
		restuarant.prepareOrder();
		deliveryTeam.assignDeliveryBoy();
		deliveryBoy.PickUprOrder();
		deliveryBoy.deliverOrder();
	}
}
