package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        XMLBuilder xmlBuilder = new XMLBuilder();
        xmlBuilder.addHeader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlBuilder.addTag("People", "number", String.valueOf(persons.size())).endTag();
        for (Person person : persons) {
            xmlBuilder.addTag("Person", "id", String.valueOf(person.getId())).addAttrib("name", person.getName()).endTag();
            xmlBuilder.addTag("Address").addTag("City").addValue(person.getCity()).closeTag("City");
            xmlBuilder.addTag("Country").addValue(person.getCountry()).closeTag("Country").closeTag("Address").closeTag("Person");
        }
        xmlBuilder.closeTag("People");
        return xmlBuilder.build().getXMLstring();
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bhavesh",1,"Mumbai","Thane"));
        persons.add(new Person("Hrithik",2,"Mumbai","Goregoan"));
        System.out.println(getPeopleXml(persons));
    }
}

