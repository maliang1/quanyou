package com.test.test.test.card;

import nc.uap.lfw.core.comp.WebElement;
import nc.uap.lfw.core.event.DatasetEvent;
import nc.uap.lfw.core.event.DialogEvent;
import nc.uap.lfw.core.event.MouseEvent;
import nc.vo.pub.BusinessException;
import uap.lfw.pub.ctrl.view.cardview.LfwModelCardViewCtrl;

 /**
 * ��Ƭ����Ĭ���߼�
 * 
 */
public class TestCardWinMainViewCtrl <T extends WebElement> extends LfwModelCardViewCtrl{
	private static final long serialVersionUID = -1;
	private static final String PARAM_BILLITEM = "billitem";
	private static final String PLUGOUT_ID = "afterSavePlugout";
  
	/**
	 * ҳ����ʾ�¼�
	 * 
	 * @param dialogEvent
	 */
	public void beforeShow(DialogEvent dialogEvent) {
		super.beforeShow(dialogEvent);
	}
  
	/**
	 * ������ѡ���߼�
	 * 
	 * @param datasetEvent
	 */
	public void onAfterRowSelect(DatasetEvent dsEvent) {
		super.onAfterRowSelect(dsEvent);
	}
  
	/**
	 * ����
	 * 
	 * @param datasetEvent
	 */

	public void onSave(MouseEvent<?> mouseEvent) {
		super.onSave(mouseEvent);
	}

  
	/**
	 * ����
	 */
	public void onAdd(MouseEvent<?> mouseEvent){
		super.onSave(mouseEvent);
	}
	
	/**
	 * ����
	 * @param mouseEvent
	 */
	public void onCopy(MouseEvent<?> mouseEvent) {
		super.onCopy(mouseEvent);
	}

	/**
	 * ɾ��
	 */
	public void onDelete(MouseEvent<?> mouseEvent){
		super.onDelete(mouseEvent);
	}

	/**
	 * ����
	 */
	public void onBack(MouseEvent<?> mouseEvent){
		super.onBack(mouseEvent);
	}
	
	/**
	 * ����
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onStart(MouseEvent<?> mouseEvent){
		super.onStart(mouseEvent);
	}

	/**
	 * ͣ��
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onStop(MouseEvent<?> mouseEvent) {
		super.onStop(mouseEvent);
	}

	/**
	 * ����
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onAttchFile(MouseEvent<?> mouseEvent) {
		super.onAttchFile(mouseEvent);
	}
	
	/**
	 * ��ӡ
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onPrint(MouseEvent<?> mouseEvent) {
		super.onPrint(mouseEvent);
	}
	
	

  
	/**
	 * �ӱ�����
	 */
	public void onGridAddClick(MouseEvent<?> mouseEvent) {
		super.onGridAddClick(mouseEvent);
	}

	/**
	 * �ӱ�༭
	 */
	public void onGridEditClick(MouseEvent<?> mouseEvent) {
		super.onGridEditClick(mouseEvent);
	}

	/**
	 * �ӱ�ɾ��
	 */
	public void onGridDeleteClick(MouseEvent<?> mouseEvent) {
		super.onGridDeleteClick(mouseEvent);
	}


	@Override
	protected String getMasterDsId() {
		return "Entity";
	}
}