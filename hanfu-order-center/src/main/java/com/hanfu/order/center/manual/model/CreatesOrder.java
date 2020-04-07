package com.hanfu.order.center.manual.model;

import io.swagger.annotations.ApiModelProperty;

public class CreatesOrder {
    @ApiModelProperty(required = true, value = "物品id")
    private Integer goodsId;
    @ApiModelProperty(required = true, value = "实际价格")
    private Integer actualPrice;
    @ApiModelProperty(required = true, value = "描述")
    private String hfDesc;
    @ApiModelProperty(required = true, value = "购买数量")
    private Integer quantity;
    @ApiModelProperty(required = true, value = "售卖价格")
    private Integer sellPrice;
    @ApiModelProperty(required = true, value = "店铺id")
    private Integer stoneId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Integer actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getHfDesc() {
        return hfDesc;
    }

    public void setHfDesc(String hfDesc) {
        this.hfDesc = hfDesc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getStoneId() {
        return stoneId;
    }

    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }
}
