package com.tutorialflow.example.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "DataPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"filteredlogmessage"})
public class DataPatternConverter extends LogEventPatternConverter {

	protected DataPatternConverter(String name, String style) {
		super(name, style);
	}

    public DataPatternConverter(String[] options) {
		super("filteredlogmessage", "filteredlogmessage");
	}

	public static DataPatternConverter newInstance(String[] options) {
        return new DataPatternConverter(options);
    }
	
	/** 
	 *  Capture the log message before printing to the console/log file 
	 *  Modify the log message/filter the log message for any characters..
	 */
	@Override
	public void format(LogEvent event, StringBuilder toAppendTo) {
		String rawLogMessage = event.getMessage().getFormattedMessage();
		String filteredMessage = rawLogMessage.replaceAll("\\d{6}", "");
		toAppendTo.append(filteredMessage);
	}

}
