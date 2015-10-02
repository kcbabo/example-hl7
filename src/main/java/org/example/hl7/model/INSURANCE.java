package org.example.hl7.model;

@SuppressWarnings("unused")
public class INSURANCE {

	private Object delegate;
	private IN1 insuranceInfo;
	private IN2 additionalInsuranceInfo;
	
	public INSURANCE() throws Exception {
		this(new ca.uhn.hl7v2.model.v23.message.ADT_A01().insertINSURANCE(0));
	}
	
	INSURANCE(ca.uhn.hl7v2.model.v23.group.ADT_A01_INSURANCE delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.group.ADT_A01_INSURANCE getDelegate() {
		return (ca.uhn.hl7v2.model.v23.group.ADT_A01_INSURANCE)delegate;
	}

	public IN1 getInsuranceInfo() {
		return new IN1(getDelegate().getIN1());
	}

	public IN2 getAdditionalInsuranceInfo() {
		return new IN2(getDelegate().getIN2());
	}
	
}
