package com.gm.armydemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.armydemo.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
