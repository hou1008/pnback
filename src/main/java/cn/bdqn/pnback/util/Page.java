package cn.bdqn.pnback.util;


import cn.bdqn.pnback.pojo.Goods;

import java.util.List;

public class Page {
	//总页数
	private int pageSum;
	//每页显示的数量
	private int pageCount=2;
	//当前页码
	private int pageIndex;
	//总条数
	private int count;
	//每页显示的内容
	private List<Goods> goods;

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
