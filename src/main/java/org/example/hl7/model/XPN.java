package org.example.hl7.model;

@SuppressWarnings("unused")
public class XPN {
	
	private Object delegate;
	private String familyName;
	private String givenName;
	private String middleNameInitial;
	
	XPN(ca.uhn.hl7v2.model.v23.datatype.XPN delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.datatype.XPN getDelegate() {
		return (ca.uhn.hl7v2.model.v23.datatype.XPN)delegate;
	}

	public String getFamilyName() {
		return getDelegate().getFamilyName().getValue();
	}

	public void setFamilyName(String familyName) throws Exception {
		getDelegate().getFamilyName().setValue(familyName);
	}

	public String getGivenName() {
		return getDelegate().getGivenName().getValue();
	}

	public void setGivenName(String givenName) throws Exception {
		getDelegate().getGivenName().setValue(givenName);
	}

	public String getMiddleNameInitial() {
		return getDelegate().getMiddleInitialOrName().getValue();
	}

	public void setMiddleNameInitial(String middleNameInitial) throws Exception {
		getDelegate().getMiddleInitialOrName().setValue(middleNameInitial);
	}
	
	
}
