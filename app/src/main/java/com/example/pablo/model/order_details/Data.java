
package com.example.pablo.model.order_details;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable{
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
        @SerializedName("hotel_name")
        @Expose
        private String hotelName;
        @SerializedName("total_price")
        @Expose
        private Long totalPrice;
        @SerializedName("order_items_count")
        @Expose
        private Long orderItemsCount;
        private final static long serialVersionUID = -991755553876022130L;

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

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
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