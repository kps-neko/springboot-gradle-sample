package sample.mapper;

import sample.model.UserInfo;

public interface UserInfoExMapper {
    /**
     * 指定した名前に該当するデータを検索する
     *
     * @param name 名前
     * @return 該当データ(リスト)
     */
    UserInfo selectByUserId(String name);
}
