package edu.citytech.cst.s23370098.dto;

import java.util.Arrays;
import java.util.Date;


public class ClientInfo {
        private int totalItems;

        private Date purchaseDate;

        private float totalPrice;

        private String customerId;

        private String description;

        private Location location;

        private int _id;

        private Items[] items;

        private ShortDate shortDate;

        private Rewards rewards;

    public Rewards getRewards() {
        return rewards;
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    public int getTotalItems() {
            return totalItems;
        }

        public void setTotalItems(int totalItems) {
            this.totalItems = totalItems;
        }

        public Date getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(Date purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public float getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(float totalPrice) {
            this.totalPrice = totalPrice;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public Items[] getItems() {
            return items;
        }

        public void setItems(Items[] items) {
            this.items = items;
        }

        public ShortDate getShortDate() {
            return shortDate;
        }

        public void setShortDate(ShortDate shortDate) {
            this.shortDate = shortDate;
        }

        @Override
        public String toString() {
            return "ClientInfo{" +
                    "totalItems='" + totalItems + '\'' +
                    ", purchaseDate='" + purchaseDate + '\'' +
                    ", totalPrice='" + totalPrice + '\'' +
                    ", customerId='" + customerId + '\'' +
                    ", description='" + description + '\'' +
                    ", location=" + location +
                    ", _id='" + _id + '\'' +
                    ", items=" + Arrays.toString(items) +
                    ", shortDate=" + shortDate +
                    '}';
        }
}