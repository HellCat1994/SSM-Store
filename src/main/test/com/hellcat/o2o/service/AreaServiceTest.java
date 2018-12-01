package com.hellcat.o2o.service;

import base.config.BaseTest;
import com.hellcat.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceTest extends BaseTest{
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> list = areaService.getAreaList();
        System.out.println(list.get(0).getAreaName());
    }
}
