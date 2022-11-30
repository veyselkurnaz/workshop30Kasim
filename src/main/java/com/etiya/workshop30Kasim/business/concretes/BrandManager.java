package com.etiya.workshop30Kasim.business.concretes;

import com.etiya.workshop30Kasim.business.abstracts.BrandService;
import com.etiya.workshop30Kasim.dataAccess.abstracts.BrandRepository;
import com.etiya.workshop30Kasim.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //This class is a Business Object
public class BrandManager implements BrandService {
    private BrandRepository brandRepository ;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //Business rules
        return brandRepository.getAll();
    }
}
