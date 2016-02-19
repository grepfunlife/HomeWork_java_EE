import junit.framework.TestCase;
import org.junit.Test;
import com.grepfunlife.business.ProductManager;

/**
 * Created by love_polyanskaya on 06.02.16.
 */
public class ProductManagerTest extends TestCase {

    @Test
    public void testAddProuct() throws Exception {
        ProductManager pm = new ProductManager();
        pm.addProuct();

    }
    @Test
    public void testUpdateProduct() throws Exception {
        ProductManager pm = new ProductManager();
        pm.updateProduct();

    }
    @Test
    public void testDeleteProduct() throws Exception {
        ProductManager pm = new ProductManager();
        pm.deleteProduct();
    }
    @Test
    public void testGetProduct() throws Exception {
        ProductManager pm = new ProductManager();
        pm.getProduct();
    }
}