/**
 * 
 */
package in.imp.ext.util;

import in.imp.ext.constants.PincodeConstants;
import in.imp.ext.input.entity.PincodeInputEntity;

/**
 * @author achaw1
 *
 */
public class PincodeUtil {
	
	/**
	 * @return
	 */
	public static String getAPIURL() {
		return PincodeConstants.API_ALL_INDIA_PINCODE_REST_URL;
	}
	
	/**
	 * @return
	 */
	public static String createFinalAPIURL(PincodeInputEntity input) {
		return PincodeConstants.API_ALL_INDIA_PINCODE_REST_URL;
	}

	/**
	 * @return
	 */
	public static String getTestURL() {
		return PincodeConstants.API_TEST_PINCODE_REST_URL;
	}

}
