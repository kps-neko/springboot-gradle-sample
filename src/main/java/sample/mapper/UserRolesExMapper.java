package sample.mapper;

import java.util.List;

import sample.model.UserRolesKey;

public interface UserRolesExMapper {
    /**
     * 指定した名前に該当するデータを検索する
     *
     * @param name 名前
     * @return 該当データ(リスト)
     */
    List<UserRolesKey> selectByUserId(String name);
}
