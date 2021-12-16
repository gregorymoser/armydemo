package com.gm.armydemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.armydemo.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
