package com.test.test.test.card;

import nc.uap.lfw.core.comp.WebElement;
import nc.uap.lfw.core.event.DatasetEvent;
import nc.uap.lfw.core.event.DialogEvent;
import nc.uap.lfw.core.event.MouseEvent;
import nc.vo.pub.BusinessException;
import uap.lfw.pub.ctrl.view.cardview.LfwModelCardViewCtrl;

 /**
 * 卡片窗口默认逻辑
 * 
 */
public class TestCardWinMainViewCtrl <T extends WebElement> extends LfwModelCardViewCtrl{
	private static final long serialVersionUID = -1;
	private static final String PARAM_BILLITEM = "billitem";
	private static final String PLUGOUT_ID = "afterSavePlugout";
  
	/**
	 * 页面显示事件
	 * 
	 * @param dialogEvent
	 */
	public void beforeShow(DialogEvent dialogEvent) {
		super.beforeShow(dialogEvent);
	}
  
	/**
	 * 主数据选中逻辑
	 * 
	 * @param datasetEvent
	 */
	public void onAfterRowSelect(DatasetEvent dsEvent) {
		super.onAfterRowSelect(dsEvent);
	}
  
	/**
	 * 保存
	 * 
	 * @param datasetEvent
	 */

	public void onSave(MouseEvent<?> mouseEvent) {
		super.onSave(mouseEvent);
	}

  
	/**
	 * 新增
	 */
	public void onAdd(MouseEvent<?> mouseEvent){
		super.onSave(mouseEvent);
	}
	
	/**
	 * 复制
	 * @param mouseEvent
	 */
	public void onCopy(MouseEvent<?> mouseEvent) {
		super.onCopy(mouseEvent);
	}

	/**
	 * 删除
	 */
	public void onDelete(MouseEvent<?> mouseEvent){
		super.onDelete(mouseEvent);
	}

	/**
	 * 返回
	 */
	public void onBack(MouseEvent<?> mouseEvent){
		super.onBack(mouseEvent);
	}
	
	/**
	 * 启用
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onStart(MouseEvent<?> mouseEvent){
		super.onStart(mouseEvent);
	}

	/**
	 * 停用
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onStop(MouseEvent<?> mouseEvent) {
		super.onStop(mouseEvent);
	}

	/**
	 * 附件
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onAttchFile(MouseEvent<?> mouseEvent) {
		super.onAttchFile(mouseEvent);
	}
	
	/**
	 * 打印
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onPrint(MouseEvent<?> mouseEvent) {
		super.onPrint(mouseEvent);
	}
	
	

  
	/**
	 * 子表新增
	 */
	public void onGridAddClick(MouseEvent<?> mouseEvent) {
		super.onGridAddClick(mouseEvent);
	}

	/**
	 * 子表编辑
	 */
	public void onGridEditClick(MouseEvent<?> mouseEvent) {
		super.onGridEditClick(mouseEvent);
	}

	/**
	 * 子表删除
	 */
	public void onGridDeleteClick(MouseEvent<?> mouseEvent) {
		super.onGridDeleteClick(mouseEvent);
	}


	@Override
	protected String getMasterDsId() {
		return "Entity";
	}
}