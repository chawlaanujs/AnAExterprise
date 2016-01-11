/**
 * 
 */
package in.imp.main.service;

import in.imp.vo.response.PincodeResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
 
/**
 * @author achaw1
 *
 */
@Path("/iMover")
@Produces(MediaType.APPLICATION_JSON)
public interface MoverPackerService {

	@GET
	@Path("/area/{pincode}")
	public PincodeResponse getPincodeDetails(@QueryParam("pincode") Integer pincode);


	@GET
	@Path("/test")
	public void testAPI();
}
