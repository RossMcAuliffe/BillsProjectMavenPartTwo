/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.bsapp.dao.ProductDAO;
import java.util.List;
import model.Product;

/**
 *
 * @author be_me
 */
public class ProductService {
    
    public List<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getProducts();
        
    }
        
    
}
