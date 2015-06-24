package com.yousoft.model.security.view;

import java.util.ArrayList;
import java.util.List;

/***
 * 树形结点.
 * 
 * @author jiangweiysang01
 * @version 1.0
 * @since 2016.06.19
 */
public class MenuTreeNode {
	/** 节点ID **/
	private String id;
	/** 节点名称 **/
	private String text;
	/** 子节点集合 **/
	private List<MenuTreeNode> children = new ArrayList<MenuTreeNode>();;
	/** 是否子节点 **/
	private boolean leaf;
	/** 节点图标. **/
	private String icon;
	/** 节点请求URL. **/
	private String url;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the children
	 */
	public List<MenuTreeNode> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(List<MenuTreeNode> children) {
		this.children = children;
	}

	/**
	 * @return the leaf
	 */
	public boolean isLeaf() {
		return leaf;
	}

	/**
	 * @param leaf
	 *            the leaf to set
	 */
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", children="
				+ children + ", leaf=" + leaf + ", icon=" + icon + ", url="
				+ url + "]";
	}

}
