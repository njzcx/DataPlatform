package com.esen.dqy.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class LoginRealm extends AuthorizingRealm {

	@Override
	public String getName() {
		return "customRealm";
	}
	
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection princ) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// 获取用户名称
        String username = (String) token.getPrincipal();
        /*User user = userService.findByUsername(username);
        if (user == null) {
            // 用户名不存在抛出异常
            System.out.println("认证：当前登录的用户不存在");
            throw new UnknownAccountException();
        }
        String pwd = user.getPassword();
        return new SimpleAuthenticationInfo(user, pwd, getName());*/
        return null;
	}

}
