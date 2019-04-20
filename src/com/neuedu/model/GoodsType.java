package com.neuedu.model;

public class GoodsType {
	private long typeno;
	private String type;
	private String createtime;
	
	public GoodsType() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public GoodsType(long typeno, String type, String createtime) {
		super();
		this.typeno = typeno;
		this.type = type;
		this.createtime = createtime;
	}

	public long getTypeno() {
		return typeno;
	}

	public void setTypeno(long typeno) {
		this.typeno = typeno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	

}
