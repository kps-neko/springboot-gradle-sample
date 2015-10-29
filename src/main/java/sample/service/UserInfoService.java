package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.mapper.UserInfoExMapper;
import sample.model.UserInfo;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoExMapper userInfoExMapper;

    /**
     * 名前で検索した結果を取得して返却する
     *
     * @return　List<BulletinBoardData>　検索結果
     */
    public UserInfo getSearchUserIdUserInfo(String name) {
        return userInfoExMapper.selectByUserId(name);
    }
}
