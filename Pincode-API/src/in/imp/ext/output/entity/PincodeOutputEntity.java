/**
 * 
 */
package in.imp.ext.output.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author achaw1
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PincodeOutputEntity {
	
	@JsonProperty("help")
	private String help;
//	@JsonProperty("fields")
//	@JsonIgnore(value=true)
//	private PincodeOutputFieldEntity[] fields;
	@JsonProperty("success")
	private boolean success;
	@JsonProperty("count")
	private int count;
	@JsonProperty("records")
	private List<PincodeOutputRecordEntity> records;
	/**
	 * @return the help
	 */
	public String getHelp() {
		return help;
	}
	/**
	 * @param help the help to set
	 */
	public void setHelp(String help) {
		this.help = help;
	}
	/**
	 * @return the fields
	 */
//	public PincodeOutputFieldEntity[] getFields() {
//		return fields;
//	}
	/**
	 * @param fields the fields to set
	 */
//	public void setFields(PincodeOutputFieldEntity[] fields) {
//		this.fields = fields;
//	}
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the records
	 */
	public List<PincodeOutputRecordEntity> getRecords() {
		return records;
	}
	/**
	 * @param records the records to set
	 */
	public void setRecords(List<PincodeOutputRecordEntity> records) {
		this.records = records;
	}

}
