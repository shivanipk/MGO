package com.example.administrator.mgo;


/**
 * Created by Administrator on 12-04-2017.
 */
public class Artifact {


        public String qrcode;
        public String name;
        public String date_installed;
        public String authority_name;
        public String no_vice;
        public String medium;
        public String expert;
        public String link;

        // Default constructor required for calls to
        // DataSnapshot.getValue(User.class)
        public Artifact() {
        }

        public Artifact( String qrcode,String name,String date_installed,String authority_name,String no_vice,String medium,String expert,String link) {
            this.qrcode = qrcode;
            this.name = name;
            this.date_installed = date_installed;
            this.authority_name = authority_name;
            this.no_vice = no_vice;
            this.medium = medium;
            this.expert = expert;
            this.link = link;

        }



}
