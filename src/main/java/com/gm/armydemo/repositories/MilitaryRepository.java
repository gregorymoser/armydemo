package com.gm.armydemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.armydemo.domain.Military;

@Repository
public interface MilitaryRepository extends JpaRepository<Military, Integer>{

}
