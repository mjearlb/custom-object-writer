package mjearlb.objects;

public class TestObject {

    public int integer;
    public String string;

    public TestObject() {
	this.integer = 20;
	this.string = "testing"; 
    }  // TestObject

    @Override
    public String toString() {
	return this.integer + " - " + this.string; 
    } // toString

} // TestObject
