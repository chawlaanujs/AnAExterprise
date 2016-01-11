/**
 * 
 */
package in.imp.main.service.impl;

import in.imp.ext.rs.ExternalRestWebService;
import in.imp.main.service.MoverPackerService;
import in.imp.vo.response.PincodeResponse;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author achaw1
 *
 */
public class MoverPackerServiceImpl implements MoverPackerService {

	@Autowired
	private ExternalRestWebService externalRestWebService;
	
	@Override
	public PincodeResponse getPincodeDetails(Integer pincode) {
		// TODO Auto-generated method stub
		externalRestWebService.getPincodeDetails();
		return null;
	}

	@Override
	public void testAPI() {
		System.out.println("API is running");
	}

}
