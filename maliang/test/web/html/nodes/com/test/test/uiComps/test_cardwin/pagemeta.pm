<?xml version="1.0" encoding='UTF-8'?>
<PageMeta caption="test卡片" controllerClazz="com.test.test.test.card.TestCardWinCtrl" id="test_cardwin" sourcePackage="test/src/public/">
    <Processor>nc.uap.lfw.core.event.AppRequestProcessor</Processor>
     <Widgets>
       <Widget canFreeDesign="true" id="main" refId="main">
        </Widget>
    </Widgets>
    <Attributes>
        <Attribute>
            <Key>CARD_WINDOW</Key>
            <Value>true</Value>
            <Desc>
            </Desc>
        </Attribute>
    </Attributes>
     <PlugoutDescs>
         <PlugoutProxy delegatedViewId="main" id="proxyAfterSavePlugout">
        </PlugoutProxy>
    </PlugoutDescs>
    <Connectors>
	     <Connector connType="7" id="proxyout_proxyAfterSavePlugout_afterSavePlugout" pluginId="proxyAfterSavePlugout" plugoutId="afterSavePlugout" source="main" sourceWindow="" target="com.test.test.uiComps.test_cardwin" targetWindow="">
        </Connector>
    </Connectors>
   
    <Events>
    </Events>
</PageMeta>