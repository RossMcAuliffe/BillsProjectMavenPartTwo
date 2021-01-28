/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.dao;

import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author be_me
 */
public class ProductDAO {
    
       private static final List<Product> products = new ArrayList<Product>(){{
           
       add(new Product(1,"Ralph Lauren Shirt" , 100.0 , "Shirt1RL.png",  "Light blue, Striped, Cotton, Formal"));
       add(new Product(2,"Ralph Lauren Shirt" , 100.0 , "ShirtRL2d.png",  "Dark green, Plain, Cotton, Polo"));
       add(new Product(3,"Ralph Lauren Shirt" , 100.0 , "ShirtRL3.png",  "White, Plain, Cotton, Polo"));
       add(new Product(4,"Ralph Lauren Shirt" , 100.0 , "ShirtRL4.png",  "Maroon, Striped, Cotton, Polo"));
       add(new Product(5,"Tommy Hilfiger Tie" , 50.0 , "TieTH1b.png",  "Navy, Geometric, Silk, Widht 7cm"));
       add(new Product(6,"Tommy Hilfiger Tie" , 50.0 , "TieTH2b.png",  "Navy, Polka dot, Silk, Width 7cm"));
       
       }};
    
//    /* Gets number of top products specified */
//    /* we are gonna fake this one */
//    public List<Product> getTopProducts(int numProducts){
        
        
//        Product p1 = new Product();
//        p1.setId(1);
//        p1.setName("White Collared Shirt");
//        p1.setDescription("Mens, Ralph Lauren, Light blue, Collared, Formal, Striped, Cotton");
//        p1.setPrice(100);
//        p1.setImageLocation("Shirt1RL.png");
//        prods.add(p1);
//        
//        Product p2 = new Product();
//        p2.setId(1);
//        p2.setName("Green Polo Shirt");
//        p2.setDescription("Mens, Ralph Lauren, Dark green, Long sleeve, Polo, Plain");
//        p2.setPrice(80);
//        p2.setImageLocation("ShirtRL2d.png");
//        prods.add(p2);
//        
//        Product p3 = new Product();
//        p3.setId(1);
//        p3.setName("White Polo Shirt");
//        p3.setDescription("Mens, Ralph Lauren, White, Short sleeve, Cotton, Plain");
//        p3.setPrice(60);
//        p3.setImageLocation("ShirtRL3.png");
//        prods.add(p3);
//        
//        Product p4 = new Product();
//        p4.setId(1);
//        p4.setName("Wine Polo Shirt");
//        p4.setDescription("Mens, Ralph Lauren, Wine, Long sleeve, cotton, Striped");
//        p4.setPrice(80);
//        p4.setImageLocation("ShirtRL4.png");
//        prods.add(p4);
//        
//        Product p5 = new Product();
//        p5.setId(1);
//        p5.setName("Tommy Hilfiger Tie");
//        p5.setDescription("Mens, Tommy Hilfiger, Pure silk, Striped, Width: 7cm, Geometric print");
//        p5.setPrice(50);
//        p5.setImageLocation("TieTH1b.png");
//        prods.add(p5);
//        
//        Product p6 = new Product();
//        p6.setId(1);
//        p6.setName("Tommy Hilfiger Tie");
//        p6.setDescription("Mens, Tommy Hilfiger, Pure silk, Polka dot, Width: 7cm, Black");
//        p6.setPrice(50);
//        p6.setImageLocation("TieTH2b.png");
//        prods.add(p6);
//        
//        return prods;     
        
//    }
    
    public Product getProduct(long id) {
        
//        List<Product> prods = 
//                
//                    products.stream()
//                    .filter((Product product) -> String.valueOf(product.getId()).equals(String.valueOf(id)));
//                    .collect(Collectors.toList());
//       
        if(products.size() >= 0){
            for(Product product : products){
                
                if(String.valueOf(product.getId()).equals(String.valueOf(id))){
                
                   Product newProduct = new Product(product.getId() , product.getName() , product.getPrice(), product.getImageLocation(), product.getDescription());
                   return newProduct;
                   
            }
//                }else if (user.getTypeOfUser().equals(User.userType.Admin)){
//                   Admin loggedInAdmin = new Admin(user.getTypeOfUser() , user.getUsername() , user.getPassword());
//                   return loggedInAdmin;
//                }
            }
        }
       
        return null;
        
        
        
    }
    
    
    public List getProducts() {
        
        return this.products;
    }
    
    
}
