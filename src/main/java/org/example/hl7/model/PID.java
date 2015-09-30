package org.example.hl7.model;

@SuppressWarnings("unused")
public class PID {

	private Object delegate;
	private CX_ID internalId;
	private XPN patientName;
	
	PID(ca.uhn.hl7v2.model.v23.segment.PID delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.PID getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.PID)delegate;
	}
	
	public CX_ID getInternalId() throws Exception {
		if (getDelegate().getPatientIDInternalIDReps() == 0) {
			return new CX_ID(getDelegate().insertPatientIDInternalID(0));
		} else {
			return new CX_ID(getDelegate().getPatientIDInternalID()[0]);
		}
	}
	
	public XPN getPatientName() throws Exception {
		if (getDelegate().getPatientNameReps() == 0) {
			return new XPN(getDelegate().insertPatientName(0));
		} else {
			return new XPN(getDelegate().getPatientName()[0]);
		}
	}
}
