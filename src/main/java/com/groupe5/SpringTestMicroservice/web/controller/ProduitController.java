package com.groupe5.SpringTestMicroservice.web.controller;
/** on importe la classe  controleur REST pour indiquer à spring que ce controleur est un controleur REST*/
import com.groupe5.SpringTestMicroservice.dao.ProductDao;
import com.groupe5.SpringTestMicroservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitController {
    ProductDao productDao;
            public ProduitController(ProductDao productDao){
                this.productDao = productDao;
            }
    @GetMapping("/Produits")
    public List<Product> listeProduits(){
        return productDao.findAll();
    }
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findBy(id);
    }
}
