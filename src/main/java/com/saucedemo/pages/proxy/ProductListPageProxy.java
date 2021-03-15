package com.saucedemo.pages.proxy;

import com.saucedemo.data.ProductInfo;
import com.saucedemo.interfaces.Add;
import com.saucedemo.interfaces.Collect;
import com.saucedemo.interfaces.OpenCartPage;
import com.saucedemo.pages.ProductListPage;
import lombok.Getter;

public class ProductListPageProxy implements Add, Collect, OpenCartPage {
    @Getter
    public static ProductListPage productListPage;

    public void createObj() {
        if (productListPage == null) {
            productListPage = new ProductListPage();
        }
    }

    @Override
    public void addProduct() {
        createObj();
        productListPage.setProductName(ProductInfo.SAUCE_LABS_BACKPACK);
        productListPage.addProduct();

    }

    @Override
    public void collectProducts() {
        createObj();
        productListPage.collectProducts();
    }

    @Override
    public void openCartPage() {
        createObj();
        productListPage.openCartPage();
    }
}
