package com.mac.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmltoJson {

    // ithe strinh ch asel ka.
    public static String college = "" +
            "<college>\n" +
            "<student>\n" +
            "<id>101</id>\n" +
            "<name>student1</name>\n" +
            "<branch>Computer Science</branch>\n" +
            "</student>\n" +
            "</college>";

    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();   // Converting xml to json
       /*
       //Here we are converting xml to java object without json
       // means this converts directly from xml to java object
       College college2 = xmlMapper.readValue(college, College.class);
        System.out.println(college2);
*/
        JsonNode jsonNode = xmlMapper.readTree(college);
        // we have to convert xml to jsonNode
        //JsonNode is not fully jason format
        // so to convert JsonNode we have to make it to Json using toString

        ObjectMapper objectMapper = new ObjectMapper();
        College college1 = objectMapper.readValue(jsonNode.toString(), College.class);
        // Here the object mapper is getting json format to convert it into object

        System.out.println(jsonNode);
        System.out.println(college1);
    }

}


/*
    * "<student>\n" +
            "<id>102</id>\n" +
            "<name>xyz</name>\n" +
            "<branch>IT</branch>\n" +
            "</student>\n" +
    * */