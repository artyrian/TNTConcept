<?xml version="1.0" encoding="ISO-8859-1"?>
<!--

    TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
    Copyright (C) 2007 Autentia Real Bussiness Solution S.L.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

-->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<!--
stylesheet for wcf tabbed
-->

<xsl:template match="xtabbed">
  <table cellspacing="0" cellpadding="5" border="0" id="{@id}">
    
    <tr>
      <td>
        <table cellspacing="0" cellpadding="2" border="1" width="100%">
          <xsl:apply-templates mode="tabbed-heading"/>
        </table>
      </td>
    </tr>
    <tr>
      <td class="tabbed-body">
        <xsl:apply-templates mode="tabbed-body" select="xpanel[@current='true']"/>
      </td>
    </tr>

  </table>
</xsl:template>


<xsl:template match="xpanel[@hidden='true']" mode="tabbed-heading"/>

<xsl:template match="xpanel[@current='true']" mode="tabbed-heading">
  <td class="tabbed-current">
    <img src="{$context}/wcf/tabbed/current.png"/>
    <xsl:text> </xsl:text>
    <xsl:value-of select="@label"/>
  </td>
</xsl:template>

<xsl:template match="xpanel" mode="tabbed-heading">
  <td class="tabbed-other">
    <input type="image" border="0" name="{@id}" src="{$context}/wcf/tabbed/other.png"/>
    <xsl:text> </xsl:text>
    <xsl:value-of select="@label"/>
  </td>
</xsl:template>


<xsl:template match="xpanel" mode="tabbed-body">
  <xsl:apply-templates/>
</xsl:template>

</xsl:stylesheet>
