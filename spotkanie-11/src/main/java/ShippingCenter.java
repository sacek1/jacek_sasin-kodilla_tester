public class ShippingCenter {

    private NotificationSystem notificationSystem;

    public ShippingCenter(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }

    public void sendParcel() {
        if (notificationSystem.send("package arrived")) {
            System.out.println("Success!");
        };
    }

}
