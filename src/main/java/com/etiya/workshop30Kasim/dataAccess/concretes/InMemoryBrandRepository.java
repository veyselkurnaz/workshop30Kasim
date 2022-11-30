package com.etiya.workshop30Kasim.dataAccess.concretes;

import com.etiya.workshop30Kasim.dataAccess.abstracts.BrandRepository;
import com.etiya.workshop30Kasim.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository  //This class is a DataAcces Object
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Auidi"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Renault"));
    }



    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
