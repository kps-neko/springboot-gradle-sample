package sample;

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.BulletinBoardForm;
import sample.model.BulletinBoardData;
import sample.service.BulletinBoardDataService;

@Controller
@EnableAutoConfiguration
public class BulletinBoardController {

//    @Autowired //リポジトリを紐づけする
//    BulletinBoardDataRepository repository;

    @Autowired
    BulletinBoardDataService bulletinBoardDataService;

    @ModelAttribute // 画面で使うフォームに対応したオブジェクトを初期化して、Modelに追加する(Thymeleafからアクセスさせるために必要)
    BulletinBoardForm setupForm() {
        return new BulletinBoardForm();
    }

    private static final Logger log = LoggerFactory.getLogger(BulletinBoardController.class);

    /**
     * 全件取得
     *
     * DBから全データを取得します
     *
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/bulletinBoard/serch/list", method = RequestMethod.GET)
    public String serchList(Locale locale, Model model) {

//        Iterable<BulletinBoardData> list = repository.findAll(new Sort(Direction.DESC, "postingDate"));
        List<BulletinBoardData> list = bulletinBoardDataService.getBulletinBoardDataAll();
        model.addAttribute("bulletinBoardDataList", list);

        return "bulletinBoard";
    }


//    /**
//     * パラメータで指定された名前のデータを検索する
//     *
//     * @param bulletinBoardForm フォームデータ
//     * @param locale
//     * @param model
//     * @return
//     */
//    @RequestMapping(value = "/bulletinBoard/serch", method = RequestMethod.POST)
//    public String serchKeyword(BulletinBoardForm bulletinBoardForm, Locale locale, Model model) {
//
//        Iterable<BulletinBoardData> list = repository.findByName(bulletinBoardForm.getName(), new Sort(Direction.DESC, "postingDate"));
//        model.addAttribute("bulletinBoardDataList", list);
//        model.addAttribute("bulletinBoardForm", new BulletinBoardForm());
//
//        return "bulletinBoard";
//    }

    /**
     * 画面で入力されたデータをDBに登録して今回登録したデータを含めて全データを画面に返却する
     *
     * ※トランザクションの範囲について確認しておく
     *
     * @param bulletinBoardForm フォームデータ
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/bulletinBoard", method = RequestMethod.POST)
    public String registReport(@Valid BulletinBoardForm bulletinBoardForm, BindingResult result, Model model) {

        // バリデータ
        if (result.hasErrors()) {
            for(FieldError err: result.getFieldErrors()) {
                log.info("error code = [" + err.getCode() + "]");
            }
            return "bulletinBoard";
        }

        BulletinBoardData entity = new BulletinBoardData();
        entity.setName(bulletinBoardForm.getName());
        entity.setPostingContent(bulletinBoardForm.getPostingContent());
        entity.setPostingDate(new Timestamp(System.currentTimeMillis()));
        entity.setRegisterDate(new Timestamp(System.currentTimeMillis()));

        bulletinBoardDataService.addBulletinBoardData(entity);

//        Iterable<BulletinBoardData> list = repository.findAll(new Sort(Direction.DESC, "postingDate"));
        List<BulletinBoardData> list = bulletinBoardDataService.getBulletinBoardDataAll();
        model.addAttribute("bulletinBoardDataList", list);
        model.addAttribute("bulletinBoardForm", new BulletinBoardForm());

        return "bulletinBoard";
    }

}