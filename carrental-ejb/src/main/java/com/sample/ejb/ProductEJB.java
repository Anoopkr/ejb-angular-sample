package com.sample.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.sample.entity.Product;

@Stateless
public class ProductEJB {
       //@PersistenceContext(unitName="ProductSOAPServer")
		@PersistenceContext
       private EntityManager entityManager;           
       
       public List<Product> getAllProducts(){
             TypedQuery<Product> query = entityManager.createNamedQuery("Product.getAllProducts",Product.class);
             return query.getResultList();
       }
}