package com.ryx.entity.query;



/**
 * 
 * 参数
 * 
 */
public class UserQuery extends BaseParam{


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 登录名称
	 */
	private String loginName;

	private String loginNameFuzzy;

	/**
	 * 姓名
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 头像
	 */
	private String avatar;

	private String avatarFuzzy;

	/**
	 * 备注
	 */
	private String memos;

	private String memosFuzzy;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

	public String getLoginName(){
		return this.loginName;
	}

	public void setLoginNameFuzzy(String loginNameFuzzy){
		this.loginNameFuzzy = loginNameFuzzy;
	}

	public String getLoginNameFuzzy(){
		return this.loginNameFuzzy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return this.avatar;
	}

	public void setAvatarFuzzy(String avatarFuzzy){
		this.avatarFuzzy = avatarFuzzy;
	}

	public String getAvatarFuzzy(){
		return this.avatarFuzzy;
	}

	public void setMemos(String memos){
		this.memos = memos;
	}

	public String getMemos(){
		return this.memos;
	}

	public void setMemosFuzzy(String memosFuzzy){
		this.memosFuzzy = memosFuzzy;
	}

	public String getMemosFuzzy(){
		return this.memosFuzzy;
	}

}
