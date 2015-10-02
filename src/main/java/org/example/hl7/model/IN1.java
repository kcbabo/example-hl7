package org.example.hl7.model;

@SuppressWarnings("unused")
public class IN1 {
	
	private Object delegate;
	private String planId;
	private String companyId;
	private String companyName;
	private XAD companyAddress;
	
	IN1(ca.uhn.hl7v2.model.v23.segment.IN1 delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.IN1 getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.IN1)delegate;
	}

	public String getPlanId() {
		return getDelegate().getInsurancePlanID().getIdentifier().getValue();
	}

	public void setPlanId(String planId) throws Exception {
		getDelegate().getInsurancePlanID().getIdentifier().setValue(planId);
	}

	public String getCompanyId() {
		return getDelegate().getInsuranceCompanyID().getID().getValue();
	}

	public void setCompanyId(String companyId) throws Exception {
		getDelegate().getInsuranceCompanyID().getID().setValue(companyId);
	}

	public String getCompanyName() {
		return getDelegate().getInsuranceCompanyName().getOrganizationName().getValue();
	}

	public void setCompanyName(String companyName) throws Exception {
		getDelegate().getInsuranceCompanyName().getOrganizationName().setValue(companyName);
	}

	public XAD getCompanyAddress() {
		return new XAD(getDelegate().getInsuranceCompanyAddress());
	}
	
}
