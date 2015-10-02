package org.example.hl7.model;

@SuppressWarnings("unused")
public class IN2 {
	
	private Object delegate;
	private String socialSecurityNum;
	private String employerName;
	private String insuranceIdNum;
	
	IN2(ca.uhn.hl7v2.model.v23.segment.IN2 delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.IN2 getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.IN2)delegate;
	}

	public String getSocialSecurityNum() {
		return getDelegate().getInsuredSSocialSecurityNumber().getValue();
	}

	public void setSocialSecurityNum(String socialSecurityNum) throws Exception {
		getDelegate().getInsuredSSocialSecurityNumber().setValue(socialSecurityNum);
	}

	public String getEmployerName() {
		return getDelegate().getInsuredSEmployerName().getIDNumber().getValue();
	}

	public void setEmployerName(String employerName) throws Exception {
		getDelegate().getInsuredSEmployerName().getIDNumber().setValue(employerName);
	}

	public String getInsuranceIdNum() {
		return getDelegate().getMedicareHealthInsCardNumber().getValue();
	}

	public void setInsuranceIdNum(String insuranceIdNum) throws Exception {
		getDelegate().getMedicareHealthInsCardNumber().setValue(insuranceIdNum);
	}
	
	
}
