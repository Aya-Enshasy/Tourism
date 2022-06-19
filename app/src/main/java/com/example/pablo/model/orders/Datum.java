
package com.example.pablo.model.orders;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("user_id")
    @Expose
    private Long userId;
    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("total_price")
    @Expose
    private Long totalPrice;
    @SerializedName("order_items_count")
    @Expose
    private Long orderItemsCount;
    private final static long serialVersionUID = -2088476388058600487L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param createdAt
     * @param totalPrice
     * @param id
     * @param orderItemsCount
     * @param userId
     * @param status
     */
    public Datum(Long id, Long userId, Long status, String createdAt, Long totalPrice, Long orderItemsCount) {
        super();
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.createdAt = createdAt;
        this.totalPrice = totalPrice;
        this.orderItemsCount = orderItemsCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getOrderItemsCount() {
        return orderItemsCount;
    }

    public void setOrderItemsCount(Long orderItemsCount) {
        this.orderItemsCount = orderItemsCount;
    }

}
