/**
 * 
 */
package in.imp.ext.rs.impl;

import in.imp.ext.constants.PincodeConstants;
import in.imp.ext.output.entity.PincodeOutputEntity;
import in.imp.ext.rs.ExternalRestWebService;
import in.imp.ext.util.PincodeUtil;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author achaw1
 *
 */
public class PincodeExternalRestWebServiceImpl implements
		ExternalRestWebService {

	/* (non-Javadoc)
	 * @see in.ipm.ext.rs.ExternalRestWebService#getPincodeOutputDetails()
	 */
	@Override
	public List<PincodeOutputEntity> getPincodeDetails() {
		String serviceUrl = PincodeConstants.API_ALL_INDIA_PINCODE_REST_URL;
		return null;
	}

	public static void run(String... strings) {
		try{
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<PincodeOutputEntity> responseObj = restTemplate.getForEntity(PincodeUtil.getTestURL(), PincodeOutputEntity.class);
			convertResponseObj(responseObj);
			System.out.println(responseObj.toString());	
			System.out.println("test code");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
    }

	/**
	 * @param responseObj
	 */
	private static void convertResponseObj(
			ResponseEntity<PincodeOutputEntity> responseObj) {
		// TODO Auto-generated method stub
		
	}
}
