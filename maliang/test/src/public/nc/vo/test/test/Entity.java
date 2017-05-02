package nc.vo.test.test;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�������������Ϣ
 * </p>
 *  ��������:2016-7-25
 * @author 
 * @version NCPrj ??
 */
public class Entity extends nc.vo.pub.SuperVO{
	
    private java.lang.String name;
    private java.lang.String id;
    private java.lang.Integer age;
    private java.lang.String billno;
    private java.lang.String title;
    private java.lang.String billmaker;
    private nc.vo.pub.lang.UFDateTime billdate;
    private java.lang.String approver;
    private java.lang.String approvestatus;
    private nc.vo.pub.lang.UFDateTime approvedate;
    private java.lang.String code;
    private java.lang.String pk_org;
    private java.lang.String pk_org_v;
    private java.lang.String pk_group;
    private java.lang.Integer dr = 0;
    private nc.vo.pub.lang.UFDateTime ts;    
	
	
    public static final String NAME = "name";
    public static final String ID = "id";
    public static final String AGE = "age";
    public static final String BILLNO = "billno";
    public static final String TITLE = "title";
    public static final String BILLMAKER = "billmaker";
    public static final String BILLDATE = "billdate";
    public static final String APPROVER = "approver";
    public static final String APPROVESTATUS = "approvestatus";
    public static final String APPROVEDATE = "approvedate";
    public static final String CODE = "code";
    public static final String PK_ORG = "pk_org";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String PK_GROUP = "pk_group";

	/**
	 * ���� name��Getter����.������������
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}   
	/**
	 * ����name��Setter����.������������
	 * ��������:2016-7-25
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * ���� id��Getter����.��������ID
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}   
	/**
	 * ����id��Setter����.��������ID
	 * ��������:2016-7-25
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * ���� age��Getter����.�����������
	 *  ��������:2016-7-25
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getAge () {
		return age;
	}   
	/**
	 * ����age��Setter����.�����������
	 * ��������:2016-7-25
	 * @param newAge java.lang.Integer
	 */
	public void setAge (java.lang.Integer newAge ) {
	 	this.age = newAge;
	} 	 
	
	/**
	 * ���� billno��Getter����.�����������ݺ�
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getBillno () {
		return billno;
	}   
	/**
	 * ����billno��Setter����.�����������ݺ�
	 * ��������:2016-7-25
	 * @param newBillno java.lang.String
	 */
	public void setBillno (java.lang.String newBillno ) {
	 	this.billno = newBillno;
	} 	 
	
	/**
	 * ���� title��Getter����.�����������ݱ���
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getTitle () {
		return title;
	}   
	/**
	 * ����title��Setter����.�����������ݱ���
	 * ��������:2016-7-25
	 * @param newTitle java.lang.String
	 */
	public void setTitle (java.lang.String newTitle ) {
	 	this.title = newTitle;
	} 	 
	
	/**
	 * ���� billmaker��Getter����.���������Ƶ���
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getBillmaker () {
		return billmaker;
	}   
	/**
	 * ����billmaker��Setter����.���������Ƶ���
	 * ��������:2016-7-25
	 * @param newBillmaker java.lang.String
	 */
	public void setBillmaker (java.lang.String newBillmaker ) {
	 	this.billmaker = newBillmaker;
	} 	 
	
	/**
	 * ���� billdate��Getter����.���������Ƶ�ʱ��
	 *  ��������:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getBilldate () {
		return billdate;
	}   
	/**
	 * ����billdate��Setter����.���������Ƶ�ʱ��
	 * ��������:2016-7-25
	 * @param newBilldate nc.vo.pub.lang.UFDateTime
	 */
	public void setBilldate (nc.vo.pub.lang.UFDateTime newBilldate ) {
	 	this.billdate = newBilldate;
	} 	 
	
	/**
	 * ���� approver��Getter����.��������������
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return approver;
	}   
	/**
	 * ����approver��Setter����.��������������
	 * ��������:2016-7-25
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
	 	this.approver = newApprover;
	} 	 
	
	/**
	 * ���� approvestatus��Getter����.������������״̬
	 *  ��������:2016-7-25
	 * @return nc.vowebrt.lfwwfmbizitf.WfmBillstatusEnum
	 */
	public String getApprovestatus () {
		return approvestatus;
	}   
	/**
	 * ����approvestatus��Setter����.������������״̬
	 * ��������:2016-7-25
	 * @param newApprovestatus nc.vowebrt.lfwwfmbizitf.WfmBillstatusEnum
	 */
	public void setApprovestatus (String newApprovestatus ) {
	 	this.approvestatus = newApprovestatus;
	} 	 
	
	/**
	 * ���� approvedate��Getter����.������������ʱ��
	 *  ��������:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getApprovedate () {
		return approvedate;
	}   
	/**
	 * ����approvedate��Setter����.������������ʱ��
	 * ��������:2016-7-25
	 * @param newApprovedate nc.vo.pub.lang.UFDateTime
	 */
	public void setApprovedate (nc.vo.pub.lang.UFDateTime newApprovedate ) {
	 	this.approvedate = newApprovedate;
	} 	 
	
	/**
	 * ���� code��Getter����.������������
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}   
	/**
	 * ����code��Setter����.������������
	 * ��������:2016-7-25
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * ���� pk_org��Getter����.����������֯
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * ����pk_org��Setter����.����������֯
	 * ��������:2016-7-25
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * ���� pk_org_v��Getter����.����������֯��汾
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * ����pk_org_v��Setter����.����������֯��汾
	 * ��������:2016-7-25
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	 
	
	/**
	 * ���� pk_group��Getter����.����������������
	 *  ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * ����pk_group��Setter����.����������������
	 * ��������:2016-7-25
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * ���� dr��Getter����.��������dr
	 *  ��������:2016-7-25
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * ����dr��Setter����.��������dr
	 * ��������:2016-7-25
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * ���� ts��Getter����.��������ts
	 *  ��������:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * ����ts��Setter����.��������ts
	 * ��������:2016-7-25
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	 
	
	
	/**
	  * <p>ȡ�ø�VO�����ֶ�.
	  * <p>
	  * ��������:2016-7-25
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2016-7-25
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "id";
	}
    
	/**
	 * <p>���ر�����
	 * <p>
	 * ��������:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "test_Entity";
	}    
	
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2016-7-25
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "test_Entity";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2016-7-25
	  */
     public Entity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.test.test.Entity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("test.Entity");
		
   	}
     
}