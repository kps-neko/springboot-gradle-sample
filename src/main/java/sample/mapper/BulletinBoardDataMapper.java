package sample.mapper;

import java.util.List;
import sample.model.BulletinBoardData;
import sample.model.BulletinBoardDataExample;
import sample.model.BulletinBoardDataKey;

public interface BulletinBoardDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    int deleteByPrimaryKey(BulletinBoardDataKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    int insert(BulletinBoardData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    int insertSelective(BulletinBoardData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    List<BulletinBoardData> selectByExample(BulletinBoardDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    BulletinBoardData selectByPrimaryKey(BulletinBoardDataKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    int updateByPrimaryKeySelective(BulletinBoardData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.bulletin_board_data
     *
     * @mbggenerated Tue Nov 24 04:11:13 JST 2015
     */
    int updateByPrimaryKey(BulletinBoardData record);
}