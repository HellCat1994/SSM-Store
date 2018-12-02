package com.hellcat.o2o.dto;

import com.hellcat.o2o.entity.Shop;
import com.hellcat.o2o.enums.ShopStateEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 存储店铺的信息和状态值
 */
@Getter
@Setter
public class ShopExecution {
    /**
     * 结果状态
     */
    private int state;
    /**
     * 状态标识
     */
    private String stateInfo;
    /**
     * 店铺数量
     */
    private int count;
    /**
     * 操作的店铺
     */
    private Shop shop;
    /**
     * shop列表（查询店铺列表的时候使用）
     */
    private List<Shop> shopList;

    public ShopExecution() {

    }
    /**
     *   店铺操作失败的构造器
     */
    public ShopExecution(ShopStateEnum shopStateEnum) {
        this.state = shopStateEnum.getState();
        this.stateInfo =shopStateEnum.getStateInfo();
    }
    /**
     * 成功的构造器
     */

    public ShopExecution(ShopStateEnum shopStateEnum,Shop shop) {
        this.state = shopStateEnum.getState();
        this.stateInfo =shopStateEnum.getStateInfo();
        this.shop = shop;
    }

    /**
     * 返回列表的构造器
     */
    public ShopExecution(ShopStateEnum shopStateEnum,List<Shop> shop) {
        this.state = shopStateEnum.getState();
        this.stateInfo =shopStateEnum.getStateInfo();
        this.shopList = shop;
    }





}
