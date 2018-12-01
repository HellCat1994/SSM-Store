package com.hellcat.o2o.dao;
import base.config.BaseTest;
import com.hellcat.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class Dao extends BaseTest{
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> list = areaDao.queryArea();
        System.out.println(list.size());
    }
}
