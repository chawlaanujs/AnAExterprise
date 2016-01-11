/**
 * 
 */
package in.imp.ext.rs;

import in.imp.ext.output.entity.PincodeOutputEntity;

import java.util.List;

/**
 * @author achaw1
 *
 */
public interface ExternalRestWebService {
	
	public List<PincodeOutputEntity> getPincodeDetails();

}
