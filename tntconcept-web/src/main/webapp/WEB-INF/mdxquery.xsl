<?xml version="1.0"?>
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

<!DOCTYPE xsl:stylesheet [
  <!ENTITY nbsp "&#160;">
  <!ENTITY amp "&#046;">
]>

<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:tt="http://www.tonbeller.com/bii/treetable"
>

<xsl:output method="html" indent="yes"/>


<xsl:template match="mdxtable">
  <xsl:value-of select="query"/>
</xsl:template>

</xsl:stylesheet>
