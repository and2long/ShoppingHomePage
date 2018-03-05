package com.and2long.shoppinghomepage;

import java.util.List;

/**
 * Created by and2long on 2018/3/5.
 * 数据实体
 */

public class TopData {


    /**
     * data : [{"cate_id":1,"cate_name":"Å®×°","cate_url":"/addons/bsht_tbk/res/icon/1.png","dtk_cate_id":1,"hdk_cate_id":1,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":1,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":1,"if_index":1,"if_top":0,"owner_id":0,"seq":101,"status":"1","tblm_cate_id":16},{"cate_id":1,"cate_name":"ÄÐ×°","cate_url":"/addons/bsht_tbk/res/icon/2.png","dtk_cate_id":9,"hdk_cate_id":2,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":2,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":2,"if_index":1,"if_top":0,"owner_id":0,"seq":100,"status":"1","tblm_cate_id":30},{"cate_id":1,"cate_name":"ÄÚÒÂ","cate_url":"/addons/bsht_tbk/res/icon/4.png","dtk_cate_id":10,"hdk_cate_id":3,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":9,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":3,"if_index":1,"if_top":0,"owner_id":0,"seq":99,"status":"1","tblm_cate_id":1625},{"cate_id":2,"cate_name":"Ä¸Ó¤","cate_url":"/addons/bsht_tbk/res/icon/5.png","dtk_cate_id":2,"hdk_cate_id":8,"hdk_cate_id2":9,"hdk_cate_id3":999,"hpt_cate_id":7,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":4,"if_index":1,"if_top":0,"owner_id":0,"seq":98,"status":"1","tblm_cate_id":50008165},{"cate_id":3,"cate_name":"»¯×±Æ·","cate_url":"/addons/bsht_tbk/res/icon/6.png","dtk_cate_id":3,"hdk_cate_id":4,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":6,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":5,"if_index":1,"if_top":0,"owner_id":0,"seq":97,"status":"1","tblm_cate_id":50010788},{"cate_id":4,"cate_name":"¾Ó¼Ò","cate_url":"/addons/bsht_tbk/res/icon/7.png","dtk_cate_id":4,"hdk_cate_id":10,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":12,"hpt_cate_id2":11,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":6,"if_index":1,"if_top":0,"owner_id":0,"seq":96,"status":"1","tblm_cate_id":0},{"cate_id":5,"cate_name":"Ð¬°üÅäÊÎ","cate_url":"/addons/bsht_tbk/res/icon/3.png","dtk_cate_id":5,"hdk_cate_id":5,"hdk_cate_id2":6,"hdk_cate_id3":7,"hpt_cate_id":3,"hpt_cate_id2":4,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":7,"if_index":1,"if_top":0,"owner_id":0,"seq":95,"status":"1","tblm_cate_id":0},{"cate_id":6,"cate_name":"ÃÀÊ³","cate_url":"/addons/bsht_tbk/res/icon/8.png","dtk_cate_id":6,"hdk_cate_id":11,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":8,"hpt_cate_id2":999,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":8,"if_index":1,"if_top":0,"owner_id":0,"seq":94,"status":"1","tblm_cate_id":50002766},{"cate_id":7,"cate_name":"³µÆ·","cate_url":"/addons/bsht_tbk/res/icon/9.png","dtk_cate_id":7,"hdk_cate_id":14,"hdk_cate_id2":999,"hdk_cate_id3":999,"hpt_cate_id":14,"hpt_cate_id2":16,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":9,"if_index":1,"if_top":0,"owner_id":0,"seq":93,"status":"1","tblm_cate_id":0},{"cate_id":8,"cate_name":"ÊýÂë¼Òµç","cate_url":"/addons/bsht_tbk/res/icon/10.png","dtk_cate_id":8,"hdk_cate_id":12,"hdk_cate_id2":13,"hdk_cate_id3":999,"hpt_cate_id":10,"hpt_cate_id2":13,"hpt_cate_id3":999,"hpt_cate_id4":999,"id":10,"if_index":1,"if_top":0,"owner_id":0,"seq":92,"status":"1","tblm_cate_id":0}]
     * retCode : 10000
     * retMsg : ³É¹¦
     */

    private int retCode;
    private String retMsg;
    private List<DataBean> data;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cate_id : 1
         * cate_name : Å®×°
         * cate_url : /addons/bsht_tbk/res/icon/1.png
         * dtk_cate_id : 1
         * hdk_cate_id : 1
         * hdk_cate_id2 : 999
         * hdk_cate_id3 : 999
         * hpt_cate_id : 1
         * hpt_cate_id2 : 999
         * hpt_cate_id3 : 999
         * hpt_cate_id4 : 999
         * id : 1
         * if_index : 1
         * if_top : 0
         * owner_id : 0
         * seq : 101
         * status : 1
         * tblm_cate_id : 16
         */

        private int cate_id;
        private String cate_name;
        private String cate_url;
        private int dtk_cate_id;
        private int hdk_cate_id;
        private int hdk_cate_id2;
        private int hdk_cate_id3;
        private int hpt_cate_id;
        private int hpt_cate_id2;
        private int hpt_cate_id3;
        private int hpt_cate_id4;
        private int id;
        private int if_index;
        private int if_top;
        private int owner_id;
        private int seq;
        private String status;
        private int tblm_cate_id;

        public int getCate_id() {
            return cate_id;
        }

        public void setCate_id(int cate_id) {
            this.cate_id = cate_id;
        }

        public String getCate_name() {
            return cate_name;
        }

        public void setCate_name(String cate_name) {
            this.cate_name = cate_name;
        }

        public String getCate_url() {
            return cate_url;
        }

        public void setCate_url(String cate_url) {
            this.cate_url = cate_url;
        }

        public int getDtk_cate_id() {
            return dtk_cate_id;
        }

        public void setDtk_cate_id(int dtk_cate_id) {
            this.dtk_cate_id = dtk_cate_id;
        }

        public int getHdk_cate_id() {
            return hdk_cate_id;
        }

        public void setHdk_cate_id(int hdk_cate_id) {
            this.hdk_cate_id = hdk_cate_id;
        }

        public int getHdk_cate_id2() {
            return hdk_cate_id2;
        }

        public void setHdk_cate_id2(int hdk_cate_id2) {
            this.hdk_cate_id2 = hdk_cate_id2;
        }

        public int getHdk_cate_id3() {
            return hdk_cate_id3;
        }

        public void setHdk_cate_id3(int hdk_cate_id3) {
            this.hdk_cate_id3 = hdk_cate_id3;
        }

        public int getHpt_cate_id() {
            return hpt_cate_id;
        }

        public void setHpt_cate_id(int hpt_cate_id) {
            this.hpt_cate_id = hpt_cate_id;
        }

        public int getHpt_cate_id2() {
            return hpt_cate_id2;
        }

        public void setHpt_cate_id2(int hpt_cate_id2) {
            this.hpt_cate_id2 = hpt_cate_id2;
        }

        public int getHpt_cate_id3() {
            return hpt_cate_id3;
        }

        public void setHpt_cate_id3(int hpt_cate_id3) {
            this.hpt_cate_id3 = hpt_cate_id3;
        }

        public int getHpt_cate_id4() {
            return hpt_cate_id4;
        }

        public void setHpt_cate_id4(int hpt_cate_id4) {
            this.hpt_cate_id4 = hpt_cate_id4;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIf_index() {
            return if_index;
        }

        public void setIf_index(int if_index) {
            this.if_index = if_index;
        }

        public int getIf_top() {
            return if_top;
        }

        public void setIf_top(int if_top) {
            this.if_top = if_top;
        }

        public int getOwner_id() {
            return owner_id;
        }

        public void setOwner_id(int owner_id) {
            this.owner_id = owner_id;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getTblm_cate_id() {
            return tblm_cate_id;
        }

        public void setTblm_cate_id(int tblm_cate_id) {
            this.tblm_cate_id = tblm_cate_id;
        }
    }
}
