package cn.e3mall.mapper;

import cn.e3mall.pojo.TbOrderShipping;
import cn.e3mall.pojo.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int countByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int insert(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int insertSelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Thu Dec 28 15:51:07 CST 2017
     */
    int updateByPrimaryKey(TbOrderShipping record);
}