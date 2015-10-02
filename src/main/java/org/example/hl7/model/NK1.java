package org.example.hl7.model;

public class NK1 {

	private Object delegate;
	private XPN name;
	private String relationship;
	private XAD address;

	NK1(ca.uhn.hl7v2.model.v23.segment.NK1 delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.NK1 getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.NK1)delegate;
	}

	public XPN getName() throws Exception {
		if (getDelegate().getNKNameReps() == 0) {
			return new XPN(getDelegate().insertNKName(0));
		} else {
			return new XPN(getDelegate().getNKName()[0]);
		}
	}

	public String getRelationship() {
		return getDelegate().getRelationship().getIdentifier().getValue();
	}

	public void setRelationship(String relationship) throws Exception {
		getDelegate().getRelationship().getIdentifier().setValue(relationship);
	}

	public XAD getAddress() throws Exception {
		if (getDelegate().getAddressReps() == 0) {
			return new XAD(getDelegate().insertAddress(0));
		} else {
			return new XAD(getDelegate().getAddress()[0]);
		}
	}

	
}
