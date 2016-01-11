/**
 * 
 */
package in.imp.ext.output.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author achaw1
 *
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class PincodeOutputFieldSubEntity {
	
	@JsonProperty("type")
	private String type;
	@JsonProperty("size")
	private String size;
	@JsonProperty("length")
	private String length;
	@JsonProperty("not null")
	private String notNullFlag;
	@JsonProperty("description")
	private String description;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}
	/**
	 * @return the notNullFlag
	 */
	public String getNotNullFlag() {
		return notNullFlag;
	}
	/**
	 * @param notNullFlag the notNullFlag to set
	 */
	public void setNotNullFlag(String notNullFlag) {
		this.notNullFlag = notNullFlag;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	} 

}
