package com.test.test.test.list;

import java.util.Map;

import nc.uap.lfw.core.comp.WebElement;
import nc.uap.lfw.core.event.DatasetEvent;
import nc.uap.lfw.core.event.MouseEvent;
import nc.vo.pub.BusinessException;
import javax.annotation.Resource;
import java.util.Map;
import nc.uap.lfw.core.cmd.CmdInvoker;
import nc.uap.lfw.core.bm.ButtonStateManager;
import nc.uap.lfw.core.cmd.UifDatasetLoadCmdByMd;
import nc.uap.lfw.core.data.Dataset;
import uap.lfw.pub.ctrl.view.listview.LfwModelListViewCtrl;

 /**
 * ��Ϣ�б�Ĭ���߼�
 * 
 */
public class TestListWinMainViewCtrl<T extends WebElement> extends LfwModelListViewCtrl{
    private static final long serialVersionUID = -1;
    private static final String MAIN_VIEW_ID = "main";
    private static final String CARD_WIN_ID = "com.test.test.uiComps.test_cardwin";
    private static final String CARD_WIN_TITLE = "�༭";
    @Resource public Main main;

  
	/**
	 * ������ѡ���߼�
	 * 
	 * @param datasetEvent
	 */
	public void onAfterRowSelect(DatasetEvent datasetEvent) {
		super.onAfterRowSelect(datasetEvent);
	}
	
  
	/**
	 * ����
	 * 
	 * @param mouseEvent
	 */
	public void onAdd(MouseEvent mouseEvent) {
		super.onAdd(mouseEvent);
	}

  
	/**
	 * �༭
	 * 
	 * @param scriptEvent
	 */
	public void onEdit(MouseEvent mouseEvent) {
		super.onEdit(mouseEvent);
	}
  
	/**
	 * ɾ��
	 * 
	 * @param scriptEvent
	 */
	public void onDelete(MouseEvent mouseEvent) {
		super.onDelete(mouseEvent);
	}
	
		/**
	 * ����
	 * @param mouseEvent
	 * @throws BusinessException
	 */
	public void onStart(MouseEvent<?> mouseEvent) {
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
	public void onAttchFile(MouseEvent<?> mouseEvent){
		super.onAttchFile(mouseEvent);
	}
	
	/**
	 * ��ӡ
	 */
	public void onPrint(MouseEvent mouseEvent){
		super.onPrint(mouseEvent);
	}
	
	public void filterDisable(  MouseEvent mouseEvent){
	    Dataset ds = this.getMasterDs();
	    boolean isSel = main.menubar.getItem("filter").getChildList().get(0).isSelected();
	    if(isSel){
	    	ds.setLastCondition("");
	    }
	    else
	    	ds.setLastCondition("enablestate = 2");
	    CmdInvoker.invoke(new UifDatasetLoadCmdByMd(ds.getId()));
		ButtonStateManager.updateButtons();
  	}
	/** 
	 * �ⲿ����ˢ��
	 * @param keys
	 */
	 public void doRefresh(  Map<?,?> keys){
		 super.doRefresh(keys);
	 }
	  
	  /** 
	 * ����֯�仯
	 * @param keys
	 */
	  public void doOrgChange(  Map<?,?> keys){
	    super.doOrgChange(keys);
	  }
	  
	  /** 
	 * ��ѯplugin
	 * @param keys
	 */
	  public void doQueryChange(  Map<?,?> keys){
	    super.doQueryChange(keys);
	  }

  
  
	@Override
	protected String getMasterDsId() {
		return "Entity";
	}
	
	@Override
	protected String getCardWinId() {
		return CARD_WIN_ID;
	}
	
	@Override
	protected String getCardWinTitle() {
		return CARD_WIN_TITLE;
	}
}