package com.yukoresort.product.model;

public class ProductVO {
	
	private Integer productId;
	private String productName;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ProductVO(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
