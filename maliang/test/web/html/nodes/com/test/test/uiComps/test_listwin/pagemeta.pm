<?xml version="1.0" encoding='UTF-8'?>
<PageMeta i18nName="" caption="test列表"  controllerClazz="com.test.test.test.list.TestListWinCtrl"  id="test_listwin" sourcePackage="test/src/public/" windowType="win">
     <Processor>nc.uap.lfw.core.event.AppRequestProcessor</Processor>
    <Widgets>
        <Widget canFreeDesign="true" id="main" refId="main">
        </Widget>
        <Widget canFreeDesign="false" id="simplequery" refId="../uap.lfw.imp.query.pubview_simplequery">
        	<Attributes> 
       		 <Attribute> 
	          <Key>auto_query</Key>  
	          <Value>true</Value>  
	          <Desc/> 
	        </Attribute>  
	        <Attribute> 
	          <Key>with_title</Key>  
	          <Value>true</Value>  
	          <Desc/> 
	        </Attribute> 
      </Attributes> 
        </Widget>
        <Widget canFreeDesign="false" id="modeorg" refId="../uap.lfw.bd.org.pubview_modeConfigOrg">
        </Widget>
    </Widgets>
    <PlugoutDescs>
    </PlugoutDescs>
    <PluginDescs>
        <PluginProxy delegatedViewId="main" id="refreshProxy">
        </PluginProxy>
    </PluginDescs>
    <Connectors>
    	<Connector connType="2" id="modeOrgConnListView" pluginId="org_plugin" plugoutId="orgout" source="modeorg" sourceWindow="" target="main" targetWindow="">
        </Connector>
        <Connector connType="8" id="proxyin_refreshProxy_refresh_plugin" pluginId="refresh_plugin" plugoutId="refreshProxy" source="com.test.test.uiComps.test_listwin" sourceWindow="" target="main" targetWindow="">
        </Connector>
        <Connector connType="2" id="simpleQueryConnListView" pluginId="simpleQuery_plugin" plugoutId="qryout" source="simplequery" sourceWindow="" target="main" targetWindow="">
        </Connector>       
    </Connectors>
</PageMeta>