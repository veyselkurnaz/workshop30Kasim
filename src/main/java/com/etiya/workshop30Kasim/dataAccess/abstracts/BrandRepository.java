package com.etiya.workshop30Kasim.dataAccess.abstracts;

import com.etiya.workshop30Kasim.entities.concretes.Brand;


import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}

