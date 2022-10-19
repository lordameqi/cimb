package com.employees;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseKnownXMLStructure {

    public static void main(String[] args) throws Exception {
        // get document builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // build document
        Document document = builder.parse(new File("employees.xml"));

        // normalize the xml structure ; its just too important!
        document.getDocumentElement().normalize();

        // here comes the root node
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        // get all employee
        NodeList nlList = document.getElementsByTagName("employee");
        ArrayList<Employee> employees = new ArrayList<Employee>();

        System.out.println("============================================");
        for (int i = 0; i < nlList.getLength(); i++) {
            Employee ha = new Employee();
            Node node = nlList.item(i);

            // System.out.print("");
            // if (node.getNodeType() == Node.ELEMENT_NODE) {
            // // print each
            // Element eLement = (Element) node;
            // System.out.print("[");
            // System.out.print("Employee id :" + eLement.getAttribute("id"));
            // System.out.print(", firstname :" +
            // eLement.getElementsByTagName("firstname").item(0).getTextContent());
            // System.out.print(", lastname :" +
            // eLement.getElementsByTagName("lastname").item(0).getTextContent());
            // System.out.print(", location :" +
            // eLement.getElementsByTagName("location").item(0).getTextContent());
            // System.out.print("]");
            // System.out.println(" ");
            // }

            System.out.print("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                // print each
                Element eLement = (Element) node;

                ha.setId(Integer.parseInt(eLement.getAttribute("id")));
                ha.setFirstName(eLement.getElementsByTagName("firstname").item(0).getTextContent());
                ha.setLastName(eLement.getElementsByTagName("lastname").item(0).getTextContent());
                ha.setLocation(eLement.getElementsByTagName("location").item(0).getTextContent());
                employees.add(ha);
            }

        }
        for (Employee index : employees) {
            System.out.println("id = " + index.getId());
            System.out.println("Firstname = " + index.getFirstName());
            System.out.println("Lastname = " + index.getLastName());
            System.out.println("Location = " + index.getLastName());
            System.out.println("");
        }

    }
}