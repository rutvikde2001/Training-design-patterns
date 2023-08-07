package designpattern.builder;

class XML {
    private String XMLstring;
    XML(String XMLString){
        this.XMLstring = XMLString;

    }

    public String getXMLstring() {
        return XMLstring;
    }
}

public class XMLBuilder {
    private StringBuilder finalXML = new StringBuilder();

    public XML build() {
        return new XML(finalXML.toString());
    }
    public XMLBuilder addHeader(String header) {
        finalXML.append(header);
        return this;
    }

    public XMLBuilder addTag(String tagName) {
        finalXML.append("<" + tagName + ">");
        return this;
    }
    public XMLBuilder addTag(String tagName, String attrb, String value) {
        finalXML.append("<" + tagName + " " + attrb + "=\"").append(value).append("\"");
        return this;
    }

    public XMLBuilder addAttrib(String attrb, String value) {
        finalXML.append(" " + attrb + "=\"").append(value).append("\"");
        return this;
    }

    public XMLBuilder addValue(String value) {
        finalXML.append(value);
        return this;
    }

    public XMLBuilder endTag() {
        finalXML.append(">");
        return this;
    }

    public XMLBuilder closeTag(String tagName) {
        finalXML.append("</" + tagName + ">");
        return this;
    }
}