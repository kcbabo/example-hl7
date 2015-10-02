package org.example.hl7.model;

@SuppressWarnings("unused")
public class XAD {
	
	private Object delegate;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	
	XAD(ca.uhn.hl7v2.model.v23.datatype.XAD delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.datatype.XAD getDelegate() {
		return (ca.uhn.hl7v2.model.v23.datatype.XAD)delegate;
	}

	public String getStreetAddress() {
		return getDelegate().getStreetAddress().getValue();
	}

	public void setStreetAddress(String streetAddress) throws Exception {
		getDelegate().getStreetAddress().setValue(streetAddress);
	}

	public String getCity() {
		return getDelegate().getCity().getValue();
	}

	public void setCity(String city) throws Exception {
		getDelegate().getCity().setValue(city);
	}

	public String getState() {
		return getDelegate().getStateOrProvince().getValue();
	}

	public void setState(String state) throws Exception {
		getDelegate().getStateOrProvince().setValue(state);
	}

	public String getZip() {
		return getDelegate().getZipOrPostalCode().getValue();
	}

	public void setZip(String zip) throws Exception {
		getDelegate().getZipOrPostalCode().setValue(zip);
	}

	
	
}
