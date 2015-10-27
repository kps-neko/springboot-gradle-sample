package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.mapper.BulletinBoardDataMapper;
import sample.model.BulletinBoardData;
import sample.model.BulletinBoardDataExample;

@Service
public class BulletinBoardDataService {

    @Autowired
    private BulletinBoardDataMapper bulletinBoardDataMapper;

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
     * １件のデータを登録する
     *
     * 全件取得のため条件は指定せずに検索する
     * ※わかりづらそうだからSQL文書くような形式にしたほうがいいかもしれない
     *
     * @return int　件数
     */
    public int addBulletinBoardData(BulletinBoardData record) {
        return bulletinBoardDataMapper.insertBulletinBoardDataAutoNumbering(record);
    }
}
