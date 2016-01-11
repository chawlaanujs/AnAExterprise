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
public class PincodeOutputRecordEntity {
	@JsonProperty("id")
	private String id;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("officename")
	private String area;
	@JsonProperty("pincode")
	private String pincode;
	@JsonProperty("officeType")
	private String officeType;
	@JsonProperty("Deliverystatus")
	private String deliveryStatus;
	@JsonProperty("divisionname")
	private String division;
	@JsonProperty("regionname")
	private String region;
	@JsonProperty("circlename")
	private String circle;
	@JsonProperty("Taluk")
	private String taluk;
	@JsonProperty("Districtname")
	private String district;
	@JsonProperty("statename")
	private String state;
	@JsonProperty("Telephone")
	private String telephone;
	@JsonProperty("Related Suboffice")
	private String relatedSubOffice;
	@JsonProperty("Related Headoffice")
	private String relatedHeadOffice;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the officeType
	 */
	public String getOfficeType() {
		return officeType;
	}
	/**
	 * @param officeType the officeType to set
	 */
	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}
	/**
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	/**
	 * @param deliveryStatus the deliveryStatus to set
	 */
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the circle
	 */
	public String getCircle() {
		return circle;
	}
	/**
	 * @param circle the circle to set
	 */
	public void setCircle(String circle) {
		this.circle = circle;
	}
	/**
	 * @return the taluk
	 */
	public String getTaluk() {
		return taluk;
	}
	/**
	 * @param taluk the taluk to set
	 */
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the relatedSubOffice
	 */
	public String getRelatedSubOffice() {
		return relatedSubOffice;
	}
	/**
	 * @param relatedSubOffice the relatedSubOffice to set
	 */
	public void setRelatedSubOffice(String relatedSubOffice) {
		this.relatedSubOffice = relatedSubOffice;
	}
	/**
	 * @return the relatedHeadOffice
	 */
	public String getRelatedHeadOffice() {
		return relatedHeadOffice;
	}
	/**
	 * @param relatedHeadOffice the relatedHeadOffice to set
	 */
	public void setRelatedHeadOffice(String relatedHeadOffice) {
		this.relatedHeadOffice = relatedHeadOffice;
	}

}
