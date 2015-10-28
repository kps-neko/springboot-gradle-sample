package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.mapper.BulletinBoardDataExMapper;
import sample.mapper.BulletinBoardDataMapper;
import sample.model.BulletinBoardData;
import sample.model.BulletinBoardDataExample;

@Service
public class BulletinBoardDataService {

    @Autowired
    private BulletinBoardDataMapper bulletinBoardDataMapper;

    @Autowired
    private BulletinBoardDataExMapper bulletinBoardDataExMapper;

    /**
     * 全件取得して返却する
     *
     * 全件取得のため条件は指定せずに検索する
     * ※わかりづらそうだからSQL文書くような形式にしたほうがいいかもしれない
     *
     * @return　List<BulletinBoardData>　検索結果
     */
    public List<BulletinBoardData> getBulletinBoardDataAll() {
        BulletinBoardDataExample exp = new BulletinBoardDataExample();
        return bulletinBoardDataMapper.selectByExample(exp);
    }

    /**
     * 名前で検索した結果を取得して返却する
     *
     * @return　List<BulletinBoardData>　検索結果
     */
    public List<BulletinBoardData> getSearchNameBulletinBoardData(String name) {
        return bulletinBoardDataExMapper.selectByName(name);
    }

    /**
     * １件のデータを登録する
     *
     * @return int　件数
     */
    @Transactional(rollbackFor = Exception.class)
    public int addBulletinBoardData(BulletinBoardData record) {
        Integer maxId = bulletinBoardDataExMapper.selectByIdMax();

        int id = 1;
        if (maxId != null) {
            id = maxId.intValue() + 1;
        }

        record.setId(id);
        return bulletinBoardDataMapper.insert(record);
    }
}
