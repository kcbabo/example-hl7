package org.example.hl7.model;

@SuppressWarnings("unused")
public class ADT_A01 {

	private Object delegate;
	private MSH MSH;
	private EVN EVN;
	private PID PID;
	private NK1 NK1;
	private PV1 PV1;
	private GT1 GT1;
	private DG1 DG1;
	
	public ADT_A01() throws Exception {
		this.delegate = new ca.uhn.hl7v2.model.v23.message.ADT_A01();
	}

	public ADT_A01(ca.uhn.hl7v2.model.v23.message.ADT_A01 delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.message.ADT_A01 getDelegate() {
		return (ca.uhn.hl7v2.model.v23.message.ADT_A01)delegate;
	}
	
	public MSH getMSH() {
		return new MSH(getDelegate().getMSH());
	}
	
	public EVN getEVN() {
		return new EVN(getDelegate().getEVN());
	}

	public PID getPID() {
		return new PID(getDelegate().getPID());
	}
}
