package sample.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sample.model.UserInfo;
import sample.model.UserRolesKey;
import sample.service.UserInfoService;
import sample.service.UserRolesService;

/**
 * DBから認証情報を確認するためのサービス
 *
 * @author a-numadate
 *
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
   @Autowired
   private UserInfoService userInfoService;
   @Autowired
   private UserRolesService userRolesService;

   /**
    * 独自処理に書き換え　DBから認証情報を取得する
    *
    */
   @Override
   public UserDetails loadUserByUsername(String username)
           throws UsernameNotFoundException {

       // ロールの情報も結合してとってくればSQL一本でできるかも
       UserInfo userInfo = userInfoService.getSearchUserIdUserInfo(username);
       if (userInfo == null) {
           throw new UsernameNotFoundException("");
       }

       List<SimpleGrantedAuthority> authorityList = new ArrayList<SimpleGrantedAuthority>();

       List<UserRolesKey> roles = userRolesService.getSearchUserIdUserRoles(username);
       for (UserRolesKey role: roles) {
           authorityList.add(new SimpleGrantedAuthority(role.getRole()));
       }
       return new MyUserDetails(userInfo, authorityList);
   }

   private String toEncryptedHashValue(String algorithmName, String value) {
        MessageDigest md = null;
        StringBuilder sb = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(value.getBytes());
        sb = new StringBuilder();
        for (byte b : md.digest()) {
            String hex = String.format("%02x", b);
            sb.append(hex);
        }
        return sb.toString();
    }
}
