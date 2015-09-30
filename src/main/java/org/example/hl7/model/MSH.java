package org.example.hl7.model;

@SuppressWarnings("unused")
public class MSH {

	private Object delegate;
	private String fieldSeparator;
	private String encodingCharacters;
	private String sendingApplication;
	private String sendingFacility;
	private String messageDateTime;
	private String messageType;
	private String messageControlId;
	private String processingId;
	private String versionId;
	
	
	MSH(ca.uhn.hl7v2.model.v23.segment.MSH delegate) {
		this.delegate = delegate;
	}
	
	public ca.uhn.hl7v2.model.v23.segment.MSH getDelegate() {
		return (ca.uhn.hl7v2.model.v23.segment.MSH)delegate;
	}

	public String getFieldSeparator() {
		return getDelegate().getFieldSeparator().getValue();
	}

	public void setFieldSeparator(String fieldSeparator) throws Exception {
		getDelegate().getFieldSeparator().setValue(fieldSeparator);
	}

	public String getEncodingCharacters() {
		return getDelegate().getEncodingCharacters().getValue();
	}

	public void setEncodingCharacters(String encodingCharacters) throws Exception {
		getDelegate().getEncodingCharacters().setValue(encodingCharacters);
	}
	
	public String getMessageType() {
		return getDelegate().getMessageType().getMessageType().getValue();
	}

	public void setMessageType(String messageType) throws Exception {
		getDelegate().getMessageType().getMessageType().setValue(messageType);
	}

	public String getMessageControlId() {
		return getDelegate().getMessageControlID().getValue();
	}

	public void setMessageControlId(String messageControlId) throws Exception {
		getDelegate().getMessageControlID().setValue(messageControlId);
	}

	public String getProcessingId() {
		return getDelegate().getProcessingID().getProcessingID().getValue();
	}

	public void setProcessingId(String processingId) throws Exception {
		getDelegate().getProcessingID().getProcessingID().setValue(processingId);
	}

	public String getVersionId() {
		return getDelegate().getVersionID().getValue();
	}

	public void setVersionId(String versionId) throws Exception {
		getDelegate().getVersionID().setValue(versionId);
	}

	public String getMessageDateTime() {
		return getDelegate().getDateTimeOfMessage().getTimeOfAnEvent().getValue();
	}

	public void setMessageDateTime(String messageDateTime) throws Exception {
		getDelegate().getDateTimeOfMessage().getTimeOfAnEvent().setValue(messageDateTime);
	}

	public String getSendingApplication() {
		return getDelegate().getSendingApplication().getNamespaceID().getValue();
	}

	public void setSendingApplication(String sendingApplication) throws Exception {
		getDelegate().getSendingApplication().getNamespaceID().setValue(sendingApplication);
	}
	
	public String getSendingFacility() {
		return getDelegate().getSendingFacility().getNamespaceID().getValue();
	}

	public void setSendingFacility(String sendingFacility) throws Exception {
		getDelegate().getSendingFacility().getNamespaceID().setValue(sendingFacility);
	}
	
}
