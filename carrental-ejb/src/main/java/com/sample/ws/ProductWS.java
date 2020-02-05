package com.sample.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.sample.ejb.ProductEJB;
import com.sample.entity.Product;

@WebService
@Stateless
public class ProductWS {
       
       @EJB
       ProductEJB productEJB;
       
       public List<Product> getAllProductDetails(){
             return productEJB.getAllProducts();
       }
       
       public List<String> getAllProductNames(){
             List<Product> list=productEJB.getAllProducts();
             List<String> productNames = new ArrayList<>();
             for(Product p:list){
                    productNames.add(p.getName());
             }
             return productNames;
       }
}