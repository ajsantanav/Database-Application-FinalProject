package edu.citytech.cst.s23370098.model;


public class ShortDate {
        private int year;
        private int month;
        private int day;
        private String dayName;


        // Getter Methods

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        public String getDayName() { return dayName; }

        // Setter Methods

        public void setYear(int year) {
            this.year = year;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setDayName(String dayName) {
            this.dayName = dayName;
        }

        @Override
        public String toString() {
            return "ShortDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    ", dayName='" + dayName + '\'' +
                    '}';
        }
}
