package com.fc.cmapweb.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropUtil {
	
	private static Map<PropFileName, Properties> propMap;
	private static final String PROP_FILE_ROOT = "/config/";
	
	private enum PropFileName {
		
		POLICY
		
	}

	static {

		InputStream in = null;
		Properties tmpProp = null;
		propMap = new HashMap<>();

		for (PropFileName tmpFileName : PropFileName.values()) {
			
			String path = PROP_FILE_ROOT + tmpFileName.toString().toLowerCase() + ".properties";
			
			try {
				
				in = PropUtil.class.getResourceAsStream(path);
				tmpProp = new Properties();
				
				tmpProp.load(in);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (null != in) {
						in.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			propMap.put(tmpFileName, tmpProp);

		}
		
	}

	public static String getPropVal(String key) {
		
		Properties policyProp = propMap.get(PropFileName.POLICY);
		return policyProp.getProperty(key);
		
	}

}
