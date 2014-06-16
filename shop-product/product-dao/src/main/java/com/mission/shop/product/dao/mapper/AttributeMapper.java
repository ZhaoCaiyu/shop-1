package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.Attribute;
import com.mission.shop.product.dao.model.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int countByExample(AttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int deleteByExample(AttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int deleteByPrimaryKey(Long atrrId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int insert(Attribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int insertSelective(Attribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	List<Attribute> selectByExample(AttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	Attribute selectByPrimaryKey(Long atrrId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Attribute record,
			@Param("example") AttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int updateByExample(@Param("record") Attribute record,
			@Param("example") AttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int updateByPrimaryKeySelective(Attribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	int updateByPrimaryKey(Attribute record);
}