package com.test.test.test.list;
import nc.uap.lfw.core.comp.text.TextComp;
import nc.uap.lfw.core.comp.GridComp;
import nc.uap.lfw.core.data.Dataset;
import nc.uap.lfw.core.page.IView;
import nc.uap.lfw.core.comp.MenubarComp;

/**
 * �벻Ҫ�޸Ĵ��࣬������������������ʹ�õ��Ŀؼ�������ģ�͵Ľṹ�壬�������Ա���롣
 */
public class Main implements IView{
    /**
     * ���ؼ���Entity_grid
     */
	public GridComp Entity_grid;
    /**
     * ���ݼ���displayname
     */
	public Dataset Entity;
    /**
     * �ؼ���menubar
     */
	public MenubarComp menubar;

}