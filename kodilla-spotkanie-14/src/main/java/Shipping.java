public class Shipping {

    private DeliveryService deliveryService;

    public Shipping(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public String deliver(int parcelWeight) {
        if (deliveryService.deliver(parcelWeight)) {
            return "SUCCESS";
        } else {
            return "FAILURE";
        }
    }
}
