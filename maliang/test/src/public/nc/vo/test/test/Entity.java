package nc.vo.test.test;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加类的描述信息
 * </p>
 *  创建日期:2016-7-25
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
	 * 属性 name的Getter方法.属性名：名称
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}   
	/**
	 * 属性name的Setter方法.属性名：名称
	 * 创建日期:2016-7-25
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * 属性 id的Getter方法.属性名：ID
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}   
	/**
	 * 属性id的Setter方法.属性名：ID
	 * 创建日期:2016-7-25
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * 属性 age的Getter方法.属性名：年纪
	 *  创建日期:2016-7-25
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getAge () {
		return age;
	}   
	/**
	 * 属性age的Setter方法.属性名：年纪
	 * 创建日期:2016-7-25
	 * @param newAge java.lang.Integer
	 */
	public void setAge (java.lang.Integer newAge ) {
	 	this.age = newAge;
	} 	 
	
	/**
	 * 属性 billno的Getter方法.属性名：单据号
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getBillno () {
		return billno;
	}   
	/**
	 * 属性billno的Setter方法.属性名：单据号
	 * 创建日期:2016-7-25
	 * @param newBillno java.lang.String
	 */
	public void setBillno (java.lang.String newBillno ) {
	 	this.billno = newBillno;
	} 	 
	
	/**
	 * 属性 title的Getter方法.属性名：单据标题
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getTitle () {
		return title;
	}   
	/**
	 * 属性title的Setter方法.属性名：单据标题
	 * 创建日期:2016-7-25
	 * @param newTitle java.lang.String
	 */
	public void setTitle (java.lang.String newTitle ) {
	 	this.title = newTitle;
	} 	 
	
	/**
	 * 属性 billmaker的Getter方法.属性名：制单人
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getBillmaker () {
		return billmaker;
	}   
	/**
	 * 属性billmaker的Setter方法.属性名：制单人
	 * 创建日期:2016-7-25
	 * @param newBillmaker java.lang.String
	 */
	public void setBillmaker (java.lang.String newBillmaker ) {
	 	this.billmaker = newBillmaker;
	} 	 
	
	/**
	 * 属性 billdate的Getter方法.属性名：制单时间
	 *  创建日期:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getBilldate () {
		return billdate;
	}   
	/**
	 * 属性billdate的Setter方法.属性名：制单时间
	 * 创建日期:2016-7-25
	 * @param newBilldate nc.vo.pub.lang.UFDateTime
	 */
	public void setBilldate (nc.vo.pub.lang.UFDateTime newBilldate ) {
	 	this.billdate = newBilldate;
	} 	 
	
	/**
	 * 属性 approver的Getter方法.属性名：审批人
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return approver;
	}   
	/**
	 * 属性approver的Setter方法.属性名：审批人
	 * 创建日期:2016-7-25
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
	 	this.approver = newApprover;
	} 	 
	
	/**
	 * 属性 approvestatus的Getter方法.属性名：审批状态
	 *  创建日期:2016-7-25
	 * @return nc.vowebrt.lfwwfmbizitf.WfmBillstatusEnum
	 */
	public String getApprovestatus () {
		return approvestatus;
	}   
	/**
	 * 属性approvestatus的Setter方法.属性名：审批状态
	 * 创建日期:2016-7-25
	 * @param newApprovestatus nc.vowebrt.lfwwfmbizitf.WfmBillstatusEnum
	 */
	public void setApprovestatus (String newApprovestatus ) {
	 	this.approvestatus = newApprovestatus;
	} 	 
	
	/**
	 * 属性 approvedate的Getter方法.属性名：审批时间
	 *  创建日期:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getApprovedate () {
		return approvedate;
	}   
	/**
	 * 属性approvedate的Setter方法.属性名：审批时间
	 * 创建日期:2016-7-25
	 * @param newApprovedate nc.vo.pub.lang.UFDateTime
	 */
	public void setApprovedate (nc.vo.pub.lang.UFDateTime newApprovedate ) {
	 	this.approvedate = newApprovedate;
	} 	 
	
	/**
	 * 属性 code的Getter方法.属性名：编码
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}   
	/**
	 * 属性code的Setter方法.属性名：编码
	 * 创建日期:2016-7-25
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * 属性 pk_org的Getter方法.属性名：组织
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * 属性pk_org的Setter方法.属性名：组织
	 * 创建日期:2016-7-25
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * 属性 pk_org_v的Getter方法.属性名：组织多版本
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * 属性pk_org_v的Setter方法.属性名：组织多版本
	 * 创建日期:2016-7-25
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	 
	
	/**
	 * 属性 pk_group的Getter方法.属性名：所属集团
	 *  创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * 属性pk_group的Setter方法.属性名：所属集团
	 * 创建日期:2016-7-25
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2016-7-25
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2016-7-25
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2016-7-25
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2016-7-25
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	 
	
	
	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:2016-7-25
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2016-7-25
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
			
		return "id";
	}
    
	/**
	 * <p>返回表名称
	 * <p>
	 * 创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "test_Entity";
	}    
	
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:2016-7-25
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "test_Entity";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2016-7-25
	  */
     public Entity() {
		super();	
	}    
	
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.test.test.Entity" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("test.Entity");
		
   	}
     
}