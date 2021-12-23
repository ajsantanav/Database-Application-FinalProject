package edu.citytech.cst.s23370098.model;

public class Location {
        private String code;
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return "Location{" +
                    "code='" + code + '\'' +
                    '}';
        }
}
