import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyMock {

    @Test
    public void mockedTest() {
//  given
        NotificationSystem notificationSystem = Mockito.mock(NotificationSystem.class);
        Mockito.when(notificationSystem.send("package arrived")).thenReturn(false);
        ShippingCenter shippingCenter = new ShippingCenter(notificationSystem);
//        when
        shippingCenter.sendParcel();
//
        Mockito.verify(notificationSystem).send("package arrived");
    }
}
