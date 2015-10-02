package org.example.hl7.model;

import java.util.ArrayList;
import java.util.List;

import ca.uhn.hl7v2.model.v23.group.ADT_A01_INSURANCE;
import ca.uhn.hl7v2.util.DeepCopy;

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
	private List<INSURANCE> INSURANCE;
	
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
	
	public List<INSURANCE> getINSURANCE() throws Exception {
		List<INSURANCE> insurance = new ArrayList<INSURANCE>(getDelegate().getINSURANCEReps());
		for (ADT_A01_INSURANCE ins : getDelegate().getINSURANCEAll()) {
			insurance.add(new INSURANCE(ins));
		}
		return insurance;
	}
	
	public void setINSURANCE(List<INSURANCE> insurance) throws Exception {
		for (int i = 0; i < insurance.size(); i++) {
			ADT_A01_INSURANCE ins = getDelegate().insertINSURANCE(i);
			DeepCopy.copy(insurance.get(i).getInsuranceInfo().getDelegate(), ins.getIN1());
			if (insurance.get(i).getAdditionalInsuranceInfo() != null) {
				DeepCopy.copy(insurance.get(i).getAdditionalInsuranceInfo().getDelegate(), ins.getIN2());
			}
		}
	}
}
