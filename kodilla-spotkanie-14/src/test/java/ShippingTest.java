import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class ShippingTest {

    @Test
    void someTest() {
        //given
        DeliveryService deliveryService = Mockito.mock(DeliveryService.class);
        Mockito.when(deliveryService.deliver(10)).thenReturn(true);
        Mockito.when(deliveryService.deliver(40)).thenReturn(false);
        Shipping shipping = new Shipping(deliveryService);
        //when
        String result = shipping.deliver(40);
        //then
//        Assertions.assertEquals("SUCCESS", result);
        Mockito.verify(deliveryService).deliver(10);

    }
}