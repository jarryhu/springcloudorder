package com.hukun.repository;

import com.hukun.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuRepository {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public int deleteById(long id);
}
