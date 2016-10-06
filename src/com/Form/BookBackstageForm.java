package com.Form;

public class BookBackstageForm {
 	
	private String keyword;
	private String ddlCode;
	private String[] ddlName;

	/**
	 * 保存数据字典时的状态标识
	 * 值=new:新建一种数据类型，并添加数据项，进行保存
	 * 值=add:在原有的数据类型的基础上进行修改和编辑，编辑对应的数据项，进行保存
	 */
	private String typeflag;
	//保存数据字典的数据项的名称
	

	public String getTypeflag() {
		return typeflag;
	}
	public void setTypeflag(String typeflag) {
		this.typeflag = typeflag;
	}	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getDdlCode() {
		return ddlCode;
	}
	public void setDdlCode(String ddlCode) {
		this.ddlCode = ddlCode;
	}
	public String[] getDdlName() {
		return ddlName;
	}
	public void setDdlName(String[] ddlName) {
		this.ddlName = ddlName;
	}
	

	
	
}