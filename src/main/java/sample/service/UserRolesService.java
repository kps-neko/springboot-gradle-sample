package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.mapper.UserRolesExMapper;
import sample.model.UserRolesKey;

@Service
public class UserRolesService {
    @Autowired
    private UserRolesExMapper userRolesExMapper;

    /**
     * 名前で検索した結果を取得して返却する
     *
     * @return　List<BulletinBoardData>　検索結果
     */
    public List<UserRolesKey> getSearchUserIdUserRoles(String name) {
        return userRolesExMapper.selectByUserId(name);
    }
}
