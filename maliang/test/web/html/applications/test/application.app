<?xml version="1.0" encoding='UTF-8'?>
<!DOCTYPE Application PUBLIC "-//Yonyou Co., Ltd.//UAP LFW APPLICATION 6.3//EN" "http://uap.yonyou.com/dtd/uap_lfw_app_6_3.dtd">
<Application TagName="Application" caption="test" controllerClazz="com.test.test.test.list.TestListWinCtrl" defaultWindowId="com.test.test.uiComps.test_listwin" id="test" sourcePackage="test/src/public/">
    <Attributes>
        <Attribute>
            <Key>templateType</Key>
            <Value>nc.uap.lfw.template.mastersecondly.MasterSecondlyFactory</Value>
            <Desc>
            </Desc>
        </Attribute>
    </Attributes>
    <PageMetas>
        <PageMeta caption="test列表" id="com.test.test.uiComps.test_listwin" isCanFreeDesign="true">
        </PageMeta>
        <PageMeta caption="test卡片" id="com.test.test.uiComps.test_cardwin" isCanFreeDesign="true">
        </PageMeta>
    </PageMetas>
    <Connectors>
        <Connector connType="1" id="testconn" pluginId="refreshProxy" plugoutId="proxyAfterSavePlugout" source="com.test.test.uiComps.test_cardwin" sourceWindow="" target="com.test.test.uiComps.test_listwin" targetWindow="">
        </Connector>
    </Connectors>
</Application>