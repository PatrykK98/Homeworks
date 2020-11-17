package Transport;

public class TransportTester {
public static void main(String[] args) {
	
	Transport germanBus = new PublicTransport("buses", 3, "Germans");
	germanBus.move();
	
	Transport maciek = new IndywidualTransport("car",1,"Maciek");
	maciek.maintain();
	
	Transport rider = new Motorbike("Motorbike","madman","KTM");
	rider.rides();
}
}
