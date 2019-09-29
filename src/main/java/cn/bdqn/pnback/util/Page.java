package cn.bdqn.pnback.util;


import cn.bdqn.pnback.pojo.*;

import java.util.List;

public class Page {
	//总页数
	private int pageSum;
	//每页显示的数量
	private int pageCount=10;
	//当前页码
	private int pageIndex;
	//总条数
	private int count;
	//每页显示的内容
	private List<Goods> goods;

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	private List<Order> order;
	private List<Comment> comment;
	private List<Consults> consults;
	private  List<Trouble> trouble;

	private  List<Menu> menu;

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public List<Consults> getConsults() {
		return consults;
	}

	public void setConsults(List<Consults> consults) {
		this.consults = consults;
	}

	public List<Trouble> getTrouble() {
		return trouble;
	}

	public void setTrouble(List<Trouble> trouble) {
		this.trouble = trouble;
	}

	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public List<Goods> getGoods() {
		return goods;
	}


	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public int getPageSum() {
		return pageSum;
	}
	public void setPageSum(int pageSum) {
		this.pageSum = pageSum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		//总页数 = (总行数 是否整除 每页行数) ? (总行数 除以 每页行数) : (总行数 除以 每页行数 加 1);
		this.pageSum = count % pageCount == 0 ? count / pageCount : count
				/ pageCount + 1;
	}
	
}
