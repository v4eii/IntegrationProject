<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/output_map_res_1.map" md5sum="1b6d72e3e886136cd60ce4ca1ed2c0a0" version="8.0.500" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM Graphical Data Mapping Editor.
*   Version 8.0.5.0
*
*   Mapping file:		output_map_res_1.map
*   Map declaration(s):	output_map_res_1
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FFirstModule%252FCalculateInterface%257DmultResponseMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FSecondModule%252FBP2Interface%257Doperation1ResponseMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:date="http://exslt.org/dates-and-times"
    xmlns:str="http://exslt.org/strings"
    xmlns:exsl="http://exslt.org/common"
    xmlns:set="http://exslt.org/sets"
    xmlns:math="http://exslt.org/math"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:xs4xs="http://www.w3.org/2001/XMLSchema"
    xmlns:io6="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:in="http://FirstModule/CalculateInterface"
    xmlns:io="http://www.w3.org/2005/08/addressing"
    xmlns:io3="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:in2="wsdl.http://FirstModule/CalculateInterface"
    xmlns:io2="http://www.w3.org/2003/05/soap-envelope"
    xmlns:io5="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io4="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:out2="wsdl.http://SecondModule/BP2Interface"
    xmlns:out="http://SecondModule/BP2Interface"
    xmlns:map="http://SecondModule/xslt/output_map_res_1"
    xmlns:msl="http://www.ibm.com/xmlmap"
    exclude-result-prefixes="date str exsl set math map xalan msl"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root wrapper template  -->
  <xsl:template match="/">
    <xsl:choose>
      <xsl:when test="msl:datamap">
        <msl:datamap>
          <xsl:element name="dataObject">
            <xsl:attribute name="xsi:type">
              <xsl:value-of select="'out2:operation1ResponseMsg'"/>
            </xsl:attribute>
            <xsl:call-template name="map:output_map_res_12">
              <xsl:with-param name="body" select="msl:datamap/dataObject[1]"/>
            </xsl:call-template>
          </xsl:element>
        </msl:datamap>
      </xsl:when>
      <xsl:otherwise>
        <xsl:apply-templates select="body" mode="map:output_map_res_1"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:output_map_res_1">
    <body>
      <xsl:attribute name="xsi:type">
        <xsl:value-of select="'out2:operation1ResponseMsg'"/>
      </xsl:attribute>
      <out:operation1Response>
        <!-- a simple data mapping: "in:multResponse/result"(int) to "output1"(string) -->
        <xsl:choose>
          <xsl:when test="normalize-space(string(in:multResponse/result))">
            <xsl:element name="output1">
              <xsl:value-of select="in:multResponse/result"/>
            </xsl:element>
          </xsl:when>
          <xsl:otherwise>
            <output1 xsi:nil="true"/>
          </xsl:otherwise>
        </xsl:choose>
      </out:operation1Response>
    </body>
  </xsl:template>

  <!-- This rule represents a type mapping: "body" to "body".  -->
  <xsl:template name="map:output_map_res_12">
    <xsl:param name="body"/>
    <out:operation1Response>
      <!-- a simple data mapping: "$body/in:multResponse/result"(int) to "output1"(string) -->
      <xsl:choose>
        <xsl:when test="normalize-space(string($body/in:multResponse/result))">
          <xsl:element name="output1">
            <xsl:value-of select="$body/in:multResponse/result"/>
          </xsl:element>
        </xsl:when>
        <xsl:otherwise>
          <output1 xsi:nil="true"/>
        </xsl:otherwise>
      </xsl:choose>
    </out:operation1Response>
  </xsl:template>

  <!-- *****************    Utility Templates    ******************  -->
  <!-- copy the namespace declarations from the source to the target -->
  <xsl:template name="copyNamespaceDeclarations">
    <xsl:param name="root"/>
    <xsl:for-each select="$root/namespace::*[not(name() = '')]">
      <xsl:copy/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
