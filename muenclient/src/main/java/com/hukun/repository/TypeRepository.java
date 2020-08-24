package com.hukun.repository;

import com.hukun.entity.Menu;
import com.hukun.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository {
   public List<Type> findAllType();
}
