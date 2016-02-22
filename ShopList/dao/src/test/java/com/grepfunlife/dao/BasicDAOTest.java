package com.grepfunlife.dao;

import com.grepfunlife.entity.Category;
import com.grepfunlife.entity.Product;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by love_polyanskaya on 19.02.16.
 */
public class BasicDAOTest {
    //private static final Logger log = LoggerFactory.getLogger(BasicDAOTest.class);

    @BeforeClass
    public static void init() {
        BasicDAO.init();
    }

    @Test
    public void testCRUD() {
        BasicDAO dao = new BasicDAO();

        Category ct = new Category();
        ct.setCategoryName("Dairy Products");
        dao.addEntity(ct);

        Product pt = new Product();
        pt.setProductName("Milk");
        pt.setCategoryName(ct);
        pt.setComment("3,5%");
        pt.setInList();
        dao.addEntity(pt);

        pt.setComment("1,2%");
        dao.updateEntity(pt);

        Product pt1 = (Product) dao.getEntity(Product.class, pt.getProductId());

//        dao.deleteEntity(pt);
//        dao.deleteEntity(ct);



    }
}