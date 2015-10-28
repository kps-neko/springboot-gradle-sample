package sample.mapper;

import java.util.List;

import sample.model.BulletinBoardData;

public interface  BulletinBoardDataExMapper {

    /**
     * idのMax値を取得して返却する
     *
     * @param example
     * @return idのMax値
     */
    Integer selectByIdMax2();

//    /**
//     * 指定した名前に該当するデータを検索する
//     *
//     * @param name 名前
//     * @return 該当データ(リスト)
//     */
//    List<BulletinBoardData> selectByName2(String name);
}
