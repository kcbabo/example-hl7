package org.example.hl7.model;

@SuppressWarnings("unused")
public class CX_ID {
	
	private Object delegate;
	private String id;
	private String assigningAuthority;
	private String identifierTypeCode;
	private String assigningFacility;
	
	CX_ID(ca.uhn.hl7v2.model.v23.datatype.CX delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.datatype.CX getDelegate() {
		return (ca.uhn.hl7v2.model.v23.datatype.CX)delegate;
	}
	
	public String getId() {
		return getDelegate().getID().getValue();
	}
	public void setId(String id) throws Exception {
		getDelegate().getID().setValue(id);
	}
	public String getAssigningAuthority() {
		return getDelegate().getAssigningAuthority().getNamespaceID().getValue();
	}
	public void setAssigningAuthority(String assigningAuthority) throws Exception {
		getDelegate().getAssigningAuthority().getNamespaceID().setValue(assigningAuthority);
	}
	public String getIdentifierTypeCode() {
		return getDelegate().getIdentifierTypeCode().getValue();
	}
	public void setIdentifierTypeCode(String identifierTypeCode) throws Exception {
		getDelegate().getIdentifierTypeCode().setValue(identifierTypeCode);
	}
	public String getAssigningFacility() {
		return getDelegate().getAssigningFacility().getNamespaceID().getValue();
	}
	public void setAssigningFacility(String assigningFacility) throws Exception {
		getDelegate().getAssigningFacility().getNamespaceID().setValue(assigningFacility);
	}
}
