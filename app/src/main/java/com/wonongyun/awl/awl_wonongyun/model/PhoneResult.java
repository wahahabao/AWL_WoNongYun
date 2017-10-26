package com.wonongyun.awl.awl_wonongyun.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by AWL on 2017/10/25.
 * api model by wxf
 */

public class PhoneResult {
    /**
     *{
     "resultcode":"200",
     "reason":"Return Successd!",
     "result":{
     "province":"安徽",
     "city":"合肥",
     "areacode":"0551",
     "zip":"230000",
     "company":"移动",
     "card":""
     },
     "error_code":0
     }
     */

    private int resultcode;
    private String reason;
    private ResultEntity result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    private int error_code;

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public static class ResultEntity{
        private String province;
        private String city;
        private String areacode;
        private String zip;
        private String company;
        private String card;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAreacode() {
            return areacode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }
    }
}
