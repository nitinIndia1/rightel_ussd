package com.wpits.rightel.beans;
import java.util.*;
import java.util.stream.*;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

import java.util.function.*;
@JacksonXmlRootElement(localName = "USSDResponse")
@Data
public class USSDResponse {
	@JacksonXmlProperty(localName = "Phone")
private String Phone;
	@JacksonXmlProperty(localName = "Action")
	private String Action;
	@JacksonXmlProperty(localName = "Text")
private String Text;
	@JacksonXmlProperty(localName = "CodeSchema")
private String CodeSchema;
	@JacksonXmlProperty(localName = "SessionId")
private String SessionId;
	@JacksonXmlProperty(localName = "ServiceId")
private String ServiceId;
	@JacksonXmlProperty(localName = "ErrorCode")
private String ErrorCode;
}
