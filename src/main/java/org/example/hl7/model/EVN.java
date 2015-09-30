package org.example.hl7.model;

@SuppressWarnings("unused")
public class EVN {

	private Object delegate;
	private String eventTypeCode;
	private String recordedDateType;
	
	EVN(ca.uhn.hl7v2.model.v23.segment.EVN delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.EVN getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.EVN)delegate;
	}
	
	public String getEventTypeCode() {
		return getDelegate().getEventTypeCode().getValue();
	}
	
	public void setEventTypeCode(String eventTypeCode) throws Exception {
		getDelegate().getEventTypeCode().setValue(eventTypeCode);
	}
	
	public String getRecordedDateType() {
		return getDelegate().getRecordedDateTime().getTimeOfAnEvent().getValue();
	}
	
	public void setRecordedDateType(String recordedDateType) throws Exception {
		getDelegate().getRecordedDateTime().getTimeOfAnEvent().setValue(recordedDateType);
	}
}
