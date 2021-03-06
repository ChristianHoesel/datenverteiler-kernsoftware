/*
 * Copyright 2005 by Kappich+Kni� Systemberatung Aachen (K2S)
 * 
 * This file is part of de.bsvrz.dav.daf.
 * 
 * de.bsvrz.dav.daf is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 * 
 * de.bsvrz.dav.daf is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with de.bsvrz.dav.daf; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package de.bsvrz.dav.daf.main.config;

/**
 * Schnittstellenklasse zum Zugriff auf die gemeinsamen Eigenschaften von Attributtypen. �ber Attributtypen
 * ist Zugriff auf die beschreibenden Information von konkreten Attributwerten m�glich. Je nach Art wird von
 * einem Attributtyp eine der folgenden Schnittstellenklassen unterst�tzt:
 * <ul>
 * 	<li>{@link StringAttributeType} f�r Zeichenketten,</li>
 * 	<li>{@link IntegerAttributeType} f�r Ganze Zahlen,</li>
 * 	<li>{@link DoubleAttributeType} f�r Flie�kommazahlen,</li>
 * 	<li>{@link TimeAttributeType} f�r Zeitstempel und</li>
 * 	<li>{@link ReferenceAttributeType} f�r Objekt-Referenzen und</li>
 * 	<li>{@link AttributeListDefinition} f�r Attributlisten in strukturierten Attributgruppen.</li>
 * </ul>
 *
 * @author Kappich+Kni� Systemberatung Aachen (K2S)
 * @author Roland Schmitz (rs)
 * @author Stephan Homeyer (sth)
 * @version $Revision: 5052 $ / $Date: 2007-08-31 20:02:55 +0200 (Fri, 31 Aug 2007) $ / ($Author: rs $)
 */
public interface AttributeType extends ConfigurationObject {
	/**
	 * Ermittelt den Default-Attributwert dieses Attributtyps.
	 * @return Default-Attributwert dieses Attributtyps oder <code>null</code> falls kein Defaultwert festgelegt wurde.
	 */
	String getDefaultAttributeValue();
}

