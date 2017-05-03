package com.maliang.ream;

import java.util.Set;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.maliang.service.user.IuserService;
import com.maliang.vo.user.User;

public class MysimpleReam extends AuthorizingRealm{
	
	@Autowired
	private IuserService userService;

	/**
	 *  认证信息，主要针对用户登录， 
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		 User user = userService.login(token.getUsername(),token.getPassword());
		if(null == user){
			throw new AccountException("帐号或密码不正确！");
		/**
		 * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
		 */
		}
		return new SimpleAuthenticationInfo(user,user.getPassword(), getName());
    }

	 /** 
     * 授权 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
    	
//    	Long userId = TokenManager.getUserId();
		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
		//根据用户ID查询角色（role），放入到Authorization里。
//		Set<String> roles = roleService.findRoleByUserId(userId);
//		info.setRoles(roles);
		//根据用户ID查询权限（permission），放入到Authorization里。
//		Set<String> permissions = permissionService.findPermissionByUserId(userId);
    	Set<String> permissions = null;
    	info.setStringPermissions(permissions);
        return info;  
    }  
    /**
     * 清空当前用户权限信息
     */
//	public  void clearCachedAuthorizationInfo() {
//		PrincipalCollection principalCollection = SecurityUtils.getSubject().getPrincipals();
//		SimplePrincipalCollection principals = new SimplePrincipalCollection(
//				principalCollection, getName());
//		super.clearCachedAuthorizationInfo(principals);
//	}
//	/**
//	 * 指定principalCollection 清除
//	 */
//	public void clearCachedAuthorizationInfo(PrincipalCollection principalCollection) {
//		SimplePrincipalCollection principals = new SimplePrincipalCollection(
//				principalCollection, getName());
//		super.clearCachedAuthorizationInfo(principals);
//	}

}
