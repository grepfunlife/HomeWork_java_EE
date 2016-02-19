package com.grepfunlife.dao;

import com.grepfunlife.entity.Category;
import com.grepfunlife.entity.Product;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    public void testAdd() {
        BasicDAO dao = new BasicDAO();

        Category ct = new Category();
        ct.setCategoryName("Sweet things");
        dao.addEntity(ct);

        Product pt = new Product();
        pt.setProductName("Candy");
        pt.setCategoryName(ct);
        dao.addEntity(pt);
    }
}