package com.guludai.ui.shiro;


import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.guludai.ui.biz.BaseSecurityResourcesBiz;
import com.guludai.ui.biz.BaseSecurityUserBiz;
import com.guludai.ui.entity.BaseSecurityResources;
import com.guludai.ui.entity.BaseSecurityUser;


 
public class MyShiroRealm extends AuthorizingRealm {

   @Autowired
	private BaseSecurityUserBiz baseSecurityUserBiz;

   @Autowired
    private BaseSecurityResourcesBiz baseSecurityResourcesBiz;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    	principalCollection.getPrimaryPrincipal();
    	BaseSecurityUser user= (BaseSecurityUser) SecurityUtils.getSubject().getPrincipal();
        List<BaseSecurityResources> resourcesList = baseSecurityResourcesBiz.loadUserResources(user.getUserCode(),1);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        for(BaseSecurityResources resources: resourcesList){
            info.addStringPermission(resources.getItem());
        }
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户的输入的账号.
        String username = (String)token.getPrincipal();
        BaseSecurityUser user = baseSecurityUserBiz.selectByUsername(username);
        if(user==null) throw new UnknownAccountException();
        /*if (0==user.getEnable()) {
            throw new LockedAccountException(); // 帐号锁定
        }*/
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, //用户
                user.getPassword(), //密码
                ByteSource.Util.bytes(user.getSalt()),
                getName()  //realm name
        );
        // 当验证都通过后，把用户信息放在session里
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("userSession", user);
        return authenticationInfo;
    }

    /**
     * 指定principalCollection 清除
     */
  /*  public void clearCachedAuthorizationInfo(PrincipalCollection principalCollection) {

        SimplePrincipalCollection principals = new SimplePrincipalCollection(
                principalCollection, getName());
        super.clearCachedAuthorizationInfo(principals);
    }
*/
}
