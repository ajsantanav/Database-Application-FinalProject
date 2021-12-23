package edu.citytech.cst.s23370098.model;

public class CustomerPurchases {
        private float _id;
        private String customerId;
        private float totalItems;
        private float totalPrice;
        private Location location;
        private ShortDate shortDate;

        // Getter Methods

        public float get_id() {
            return _id;
        }
        public String getMonth()
        {
            return MonthService.getMonth(this.shortDate.getMonth());
        }

        public String getDayName() {
            return shortDate.getDayName();
        }
        public String getDate() {
            String day = String.format("%02d", this.shortDate.getDay());
            String month = String.format("%02d", this.shortDate.getMonth());
            String year =  this.shortDate.getYear() + "";
            return year + "." + month + "." + day;
        }
        public String getLocationCode() {
            return this.location.getCode();
        }

        public String getCustomerId() {
            return customerId;
        }

        public float getTotalItems() {
            return totalItems;
        }

        public float getTotalPrice() {
            return totalPrice;
        }

        public Location getLocation() {
            return location;
        }

        public ShortDate getShortDate() {
            return shortDate;
        }

        // Setter Methods

        public void set_id(float _id) {
            this._id = _id;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public void setTotalItems(float totalItems) {
            this.totalItems = totalItems;
        }

        public void setTotalPrice(float totalPrice) {
            this.totalPrice = totalPrice;
        }

        public void setLocation(Location locationObject) {
            this.location = locationObject;
        }

        public void setShortDate(ShortDate shortDateObject) {
            this.shortDate = shortDateObject;
        }

    @Override
    public String toString() {
        return "CustomerPurchases{" +
                "_id=" + _id +
                ", customerId='" + customerId + '\'' +
                ", totalItems=" + totalItems +
                ", totalPrice=" + totalPrice +
                ", " + location +
                ", " + shortDate +
                '}';
    }
}
