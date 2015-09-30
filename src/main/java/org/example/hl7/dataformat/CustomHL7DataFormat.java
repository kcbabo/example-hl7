package org.example.hl7.dataformat;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.camel.Exchange;
import org.apache.camel.component.hl7.HL7DataFormat;
import org.example.hl7.model.ADT_A01;

public class CustomHL7DataFormat extends HL7DataFormat {
	
	public CustomHL7DataFormat() {
		setValidate(false);
	}

	@Override
	public void marshal(Exchange exchange, Object body, OutputStream outputStream) throws Exception {
		if (exchange.getIn().getBody() instanceof ADT_A01) {
			super.marshal(exchange, exchange.getIn().getBody(ADT_A01.class).getDelegate(), outputStream);
		} else {
			super.marshal(exchange, body, outputStream);
		}
		
	}
	
	@Override
	public Object unmarshal(Exchange exchange, InputStream inputStream) throws Exception {
		Object body = super.unmarshal(exchange, inputStream);
		return new ADT_A01((ca.uhn.hl7v2.model.v23.message.ADT_A01)body);
	}
}
