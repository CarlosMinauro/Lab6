import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    void testAddProductHappyPath() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(10.0);
        cart.addProduct(20.0);
        assertEquals(2, cart.getProductCount());
        assertEquals(30.0, cart.getTotal(), 0.001);
    }

    @Test
    void testAddProductUnhappyPath() {
        ShoppingCart cart = new ShoppingCart();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(0);
        });
        assertEquals("Price must be positive", exception.getMessage());
    }
} 