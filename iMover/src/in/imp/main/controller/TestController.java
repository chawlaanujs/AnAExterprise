/**
 * 
 */
package in.imp.main.controller;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author achaw1
 *
 */
@RestController
@RequestMapping("/imover")
public class TestController {
	
	@GET
	@RequestMapping("/test")
	public void test(){
		System.out.println("Application runs.");
	}
	
	
}
