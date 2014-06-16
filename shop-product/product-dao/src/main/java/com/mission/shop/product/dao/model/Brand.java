package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Brand implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.brand_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Long brandId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.brand_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private String brandName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.url
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.brand_desc
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private String brandDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table brand
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.brand_id
	 * @return  the value of brand.brand_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Long getBrandId() {
		return brandId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.brand_id
	 * @param brandId  the value for brand.brand_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.brand_name
	 * @return  the value of brand.brand_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.brand_name
	 * @param brandName  the value for brand.brand_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName == null ? null : brandName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.url
	 * @return  the value of brand.url
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.url
	 * @param url  the value for brand.url
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.brand_desc
	 * @return  the value of brand.brand_desc
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public String getBrandDesc() {
		return brandDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.brand_desc
	 * @param brandDesc  the value for brand.brand_desc
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc == null ? null : brandDesc.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.create_time
	 * @return  the value of brand.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.create_time
	 * @param createTime  the value for brand.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.update_time
	 * @return  the value of brand.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.update_time
	 * @param updateTime  the value for brand.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.status
	 * @return  the value of brand.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.status
	 * @param status  the value for brand.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}