package sample.mapper;

import java.util.List;

import sample.model.BulletinBoardData;

/**
 * 自動作成のファイルに追加処理書くともろもろめんどくさそうなので
 * 追加で処理を作りたい場合は、拡張機能扱いで別のDaoとして定義する
 *
 * @author a-numadate
 *
 */
public interface BulletinBoardDataExMapper {

    /**
     * idのMax値を取得して返却する
     *
     * @param example
     * @return idのMax値
     */
    Integer selectByIdMax();

    /**
     * 指定した名前に該当するデータを検索する
     *
     * @param name 名前
     * @return 該当データ(リスト)
     */
    List<BulletinBoardData> selectByName(String name);
}
