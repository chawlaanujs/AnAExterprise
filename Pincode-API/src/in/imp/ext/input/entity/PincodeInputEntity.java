/**
 * 
 */
package in.imp.ext.input.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * @author achaw1
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PincodeInputEntity {
	
	private String [] resource_id;
	private String [] filters;
	private int offset;
	private int limit;
	private String [] fields;
	private String [] sort;
	private String [] join;
	/**
	 * @return the resource_id
	 */
	public String[] getResource_id() {
		return resource_id;
	}
	/**
	 * @param resource_id the resource_id to set
	 */
	public void setResource_id(String[] resource_id) {
		this.resource_id = resource_id;
	}
	/**
	 * @return the filters
	 */
	public String[] getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(String[] filters) {
		this.filters = filters;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/**
	 * @return the fields
	 */
	public String[] getFields() {
		return fields;
	}
	/**
	 * @param fields the fields to set
	 */
	public void setFields(String[] fields) {
		this.fields = fields;
	}
	/**
	 * @return the sort
	 */
	public String[] getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String[] sort) {
		this.sort = sort;
	}
	/**
	 * @return the join
	 */
	public String[] getJoin() {
		return join;
	}
	/**
	 * @param join the join to set
	 */
	public void setJoin(String[] join) {
		this.join = join;
	}
	
}
